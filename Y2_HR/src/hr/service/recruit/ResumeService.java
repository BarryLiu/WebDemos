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
	 * ��ѯְλ����
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
		String queryTag = ServletActionContext.getRequest().getParameter("queryTag");//����jsp�˵� ÿ��ҳ���в�ͬ��״̬����
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
	 *  ���� id ��ѯ  engageResume ��һ������
	 * @param engageResume
	 * @return
	 */
	public EngageResume selectEngageResumeById(EngageResume engageResume) {
		return engageResumeMapper.selectByPrimaryKey(engageResume.getId());
	}

	/** ����id��ѯ engageResume ���һ����Ϣ*/
	public EngageResume selectById(String engageResumeIdStr) {
		return engageResumeMapper.selectByPrimaryKey(Integer.valueOf(engageResumeIdStr));
	}

	//��ѯ�����ֶ�
	public List<ConfigPublicChar> selectPublicChar() {
		return configPublicCharMapper.selectByExample(null);
	}
	
	//�Ƽ�  �� ����id ��ѯ������  �Ƽ�   
	public void updateResume() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("engageResume.id");
		String passChecker = request.getParameter("engageResume.passChecker");
		String recomandation = request.getParameter("engageResume.recomandation");
		
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(Integer.valueOf(id));
		resume.setCheckStatus(2); //�Ѿ��Ƽ��͸�Ϊ2
		resume.setPassChecker(passChecker);
		resume.setRecomandation(recomandation);
		resume.setPassCheckTime(new Date());
		
		System.out.println("�Ƽ��� "+resume);
		
		engageResumeMapper.updateByPrimaryKey(resume);
		
	}

	/**����id ɾ�� resume�������*/
	public void deleteResumeById(Integer resumeId) {
		engageResumeMapper.deleteByPrimaryKey(resumeId);
	}

	 
}
