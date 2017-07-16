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

	//��ѯ ������       ҳ��    ��   ��ҳ 
	public Map<String, Object> selectResumeList(EngageResume engageResume,
			UtilBean utilBean, Integer page, Integer rows) {
		if(page==null || page < 0)page=1;
		if(rows==null || rows < 0)rows=5;
		
		String prmkStr = HrUtils.getWhereStr(configPrimaryKeyMapper,utilBean);
		String whereStr = null;
		String queryTag = ServletActionContext.getRequest().getParameter("queryTag");//����jsp�˵� ÿ��ҳ���в�ͬ��״̬����
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

	// ��  ���Ա� EngageInterview ���в���һ�� ����
	public int insertInterView(EngageInterview engageInterview) {
		return engageInterviewMapper.insert(engageInterview);
	}

	//��ѯ�����id �����Դ��� 
	public int selectAmountCount(Integer resumeId) {
		return engageInterviewMapper.selectAmountByResumeId(resumeId);
	}
	
//------------------------------------ ����ɸѡ
	//���ݷ�ҳ��ѯ ��   engage_interview �������
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
	/**���ݼ������id ��ѯ�������Լ�¼ */
	public EngageInterview selectInterViewOne(Integer resumeId) {
		
		EngageInterviewExample example = new EngageInterviewExample();
		example.createCriteria().andResumeIdEqualTo(resumeId);
		List<EngageInterview> lists = engageInterviewMapper.selectByExample(example );
		if(lists.size()==0)
			return null;
		return lists.get(lists.size()-1);
	}
	/**����id �ı� ���Ա������*/
	public void updateInterView(EngageInterview engageInterview) {
		engageInterviewMapper.updateByPrimaryKey(engageInterview);
	}

	/**����id ��ѯ������������״̬��Ϊ1 ��ʾ�Ѿ��Ǽ�*/
	public void toDengJiResume(int rid) {
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(rid);
		resume.setInterviewStatus(1);//��������״̬Ϊ������״̬
		engageResumeMapper.updateByPrimaryKey(resume);
	}

	
	
	
	/**��������  ���޸� engageResume ������ �� �˻�����ǰ��״̬*/
	public void addviceInterView(Integer rid,Integer iid) {
		// �ļ�����
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(rid);
		resume.setInterviewStatus(1);//��������״̬Ϊ������״̬
		resume.setPassCheckcomment("�������� ");
		engageResumeMapper.updateByPrimaryKey(resume);
		
		//�����Ա�
		EngageInterview interview = engageInterviewMapper.selectByPrimaryKey(iid);
		interview.setCheckStatus(0);
		interview.setInterviewStatus(1);
		
		engageInterviewMapper.updateByPrimaryKey(interview);
		
	}
	
	/**ɾ��������  �� ɾ������������Ա��е�����*/
	public void adviceDeleteResumeAndInterView(Integer rid, Integer iid) {
		engageResumeMapper.deleteByPrimaryKey(rid);
		engageInterviewMapper.deleteByPrimaryKey(iid);
	}

	/**����¼�ã� ����¼�� ����*/
	public void adviceLuYong(Integer rid, Integer iid) {
		String checker = ServletActionContext.getRequest().getParameter("engageInterview.checker");
		
		EngageInterview interview = engageInterviewMapper.selectByPrimaryKey(iid);
		interview.setCheckStatus(2);  // ��Ϊ����¼�� �� ��������ɸѡ�����������״̬
		interview.setChecker(checker);
		interview.setCheckTime(new Date());
		interview.setCheckComment("����¼��");
		
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(rid);
		resume.setPassCheckStatus(1);   // ����   ͨ���ĸ���״̬ �� ����Ϣ��¼�� ����ɼ�
		
		engageInterviewMapper.updateByPrimaryKey(interview);
		engageResumeMapper.updateByPrimaryKey(resume);
		
	}
	

	
	
}
