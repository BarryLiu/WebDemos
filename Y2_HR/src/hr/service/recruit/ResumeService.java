package hr.service.recruit;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import hr.entity.ConfigMajorKind;
import hr.entity.ConfigPrimaryKey;
import hr.entity.ConfigPublicChar;
import hr.entity.EngageResume;
import hr.entity.HumanFile;
import hr.service.BaseService;
import hr.utils.HrUtils;
import hr.utils.UtilBean;

public class ResumeService extends BaseService{

	/**
	 * 查询职位种类
	 * @return
	 */
	public List<ConfigMajorKind> selectMajorKinds() {
		return configMajorKindMapper.selectByExample(null);
	}

	public int insertEngageResume(EngageResume engageResume) {
		return engageResumeMapper.insert(engageResume);
	}

	public Map<String, Object> selectResumeList(EngageResume engageResume,
			UtilBean utilBean, Integer page, Integer rows) {
		
		String prmkStr = HrUtils.getWhereStr(configPrimaryKeyMapper,utilBean);
		String whereStr = null;
		String queryTag = ServletActionContext.getRequest().getParameter("queryTag");//来自jsp端的 每个页面有不同的状态条件
		if(queryTag!=null)
			whereStr=queryTag;
		if(prmkStr!=null)
			whereStr=prmkStr+prmkStr;
		
		if( page == null || page <=0)page=1;
		
		
		System.out.println("whereStr: "+whereStr);
		 List<EngageResume> resumes = engageResumeMapper.selectAll(engageResume,utilBean,whereStr,(page - 1) * rows,rows);
		System.out.println("humanFiles.size() :  "+resumes.size());
		
		Map<String, Object> data = new HashMap<String, Object>();
		int total = engageResumeMapper.count(engageResume,utilBean,whereStr);
		data.put("total", total);
		data.put("rows", resumes);
		
		return data;
	}
	

	/**
	 *  根据 id 查询  engageResume 的一条数据
	 * @param engageResume
	 * @return
	 */
	public EngageResume selectEngageResumeById(EngageResume engageResume) {
		return engageResumeMapper.selectByPrimaryKey(engageResume.getId());
	}

	/** 根据id查询 engageResume 表的一条信息*/
	public EngageResume selectById(String engageResumeIdStr) {
		return engageResumeMapper.selectByPrimaryKey(Integer.valueOf(engageResumeIdStr));
	}

	//查询公共字段
	public List<ConfigPublicChar> selectPublicChar() {
		return configPublicCharMapper.selectByExample(null);
	}
	
	//推荐  ， 根据id 查询出来后  推荐   
	public void updateResume() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("engageResume.id");
		String passChecker = request.getParameter("engageResume.passChecker");
		String recomandation = request.getParameter("engageResume.recomandation");
		
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(Integer.valueOf(id));
		resume.setCheckStatus(2); //已经推荐就改为2
		resume.setPassChecker(passChecker);
		resume.setRecomandation(recomandation);
		resume.setPassCheckTime(new Date());
		
		System.out.println("推荐： "+resume);
		
		engageResumeMapper.updateByPrimaryKey(resume);
		
	}

	/**根据id 删除 resume表的数据*/
	public void deleteResumeById(Integer resumeId) {
		engageResumeMapper.deleteByPrimaryKey(resumeId);
	}

	 
}
