package hr.service.recruit;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import hr.entity.EngageInterview;
import hr.entity.EngageInterviewExample;
import hr.entity.EngageResume;
import hr.service.BaseService;
import hr.utils.HrUtils;
import hr.utils.UtilBean;

public class InterViewService extends BaseService{

	//查询 简历的       页面    有   分页 
	public Map<String, Object> selectResumeList(EngageResume engageResume,
			UtilBean utilBean, Integer page, Integer rows) {
		if(page==null || page < 0)page=1;
		if(rows==null || rows < 0)rows=5;
		
		String prmkStr = HrUtils.getWhereStr(configPrimaryKeyMapper,utilBean);
		String whereStr = null;
		String queryTag = ServletActionContext.getRequest().getParameter("queryTag");//来自jsp端的 每个页面有不同的状态条件
		if(queryTag!=null)
			whereStr=queryTag;
		if(prmkStr!=null)
			whereStr=prmkStr+prmkStr;
		
		 List<EngageResume> resumes = engageResumeMapper.selectAll(engageResume,utilBean,whereStr,(page - 1) * rows,rows);
		
		Map<String, Object> data = new HashMap<String, Object>();
		int total = engageResumeMapper.count(engageResume,utilBean,whereStr);
		data.put("total", total);
		data.put("rows", resumes);
		
		return data;
	}

	public EngageResume selectResumeById(Integer id) {
		return engageResumeMapper.selectByPrimaryKey(id);
	}

	// 给  面试表 EngageInterview 表中插入一条 数据
	public int insertInterView(EngageInterview engageInterview) {
		return engageInterviewMapper.insert(engageInterview);
	}

	//查询传入的id 的面试次数 
	public int selectAmountCount(Integer resumeId) {
		return engageInterviewMapper.selectAmountByResumeId(resumeId);
	}
	
//------------------------------------ 面试筛选
	//根据分页查询 出   engage_interview 表的数据
	public Map<String, Object> selectInterViewList(Integer page, Integer rows) {
		if( page == null || page <=0)page=1;
		if(rows==null)rows=5;
		int start = (page - 1) * rows;
		 List<EngageInterview> interviews = engageInterviewMapper.selectAll(start,rows);
		System.out.println("interviews.size() :  "+interviews.size());
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		EngageInterviewExample example =new EngageInterviewExample();
		example.createCriteria().andCheckStatusEqualTo(1);
		int total = engageInterviewMapper.countByExample(example );
		data.put("total", total);
		data.put("rows", interviews);
		
		return data;
	}
	/**根据简历表的id 查询出来面试记录 */
	public EngageInterview selectInterViewOne(Integer resumeId) {
		
		EngageInterviewExample example = new EngageInterviewExample();
		example.createCriteria().andResumeIdEqualTo(resumeId);
		List<EngageInterview> lists = engageInterviewMapper.selectByExample(example );
		if(lists.size()==0)
			return null;
		return lists.get(lists.size()-1);
	}
	/**根据id 改变 面试表的数据*/
	public void updateInterView(EngageInterview engageInterview) {
		engageInterviewMapper.updateByPrimaryKey(engageInterview);
	}

	/**根据id 查询出来，将面试状态改为1 表示已经登记*/
	public void toDengJiResume(int rid) {
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(rid);
		resume.setInterviewStatus(1);//设置面试状态为待面试状态
		engageResumeMapper.updateByPrimaryKey(resume);
	}

	
	
	
	/**建议面试  ，修改 engageResume 的属性 ， 退回面试前的状态*/
	public void addviceInterView(Integer rid,Integer iid) {
		// 改简历表
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(rid);
		resume.setInterviewStatus(1);//设置面试状态为待面试状态
		resume.setPassCheckcomment("建议面试 ");
		engageResumeMapper.updateByPrimaryKey(resume);
		
		//改面试表
		EngageInterview interview = engageInterviewMapper.selectByPrimaryKey(iid);
		interview.setCheckStatus(0);
		interview.setInterviewStatus(1);
		
		engageInterviewMapper.updateByPrimaryKey(interview);
		
	}
	
	/**删除建简历  ， 删除简历表和面试表中的数据*/
	public void adviceDeleteResumeAndInterView(Integer rid, Integer iid) {
		engageResumeMapper.deleteByPrimaryKey(rid);
		engageInterviewMapper.deleteByPrimaryKey(iid);
	}

	/**建议录用， 对其录用 。。*/
	public void adviceLuYong(Integer rid, Integer iid) {
		String checker = ServletActionContext.getRequest().getParameter("engageInterview.checker");
		
		EngageInterview interview = engageInterviewMapper.selectByPrimaryKey(iid);
		interview.setCheckStatus(2);  // 改为建议录用 ， 就让面试筛选不到这个面试状态
		interview.setChecker(checker);
		interview.setCheckTime(new Date());
		interview.setCheckComment("建议录用");
		
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(rid);
		resume.setPassCheckStatus(1);   // 设置   通过的复核状态 让 其信息对录用 管理可见
		
		engageInterviewMapper.updateByPrimaryKey(interview);
		engageResumeMapper.updateByPrimaryKey(resume);
		
	}
	

	
	
}
