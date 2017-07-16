package hr.service.recruit;

import java.util.List;

import hr.entity.EngageInterview;
import hr.entity.EngageInterviewExample;
import hr.entity.EngageInterviewExample.Criteria;
import hr.entity.EngageResume;
import hr.service.BaseService;

public class EmployService extends BaseService{

	public EngageInterview selectInterviewByResumeId(Integer resumeId) {
		
		EngageInterviewExample example =new EngageInterviewExample();
		Criteria criteria = example.createCriteria();
		criteria.andResumeIdEqualTo(resumeId);
		List<EngageInterview> interviews = engageInterviewMapper.selectByExample(example);
		System.out.println(interviews.size());
		if(interviews.size()==0)// ���û�в鵽���ݣ� �ͷ���null 
			return null;

		return interviews.get(interviews.size()-1);
	}

	/**��� ����ͨ����  ������ݵ�  id �� checkComment �Ƿ�ͨ�� */
	public void sqTiJiao(Integer id,String checkComment) {
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(id);
		resume.setPassCheckcomment(checkComment);
		resume.setPassCheckStatus(2);			// ��Ϊ2 ��ʾ ��� ����������û���������
		engageResumeMapper.updateByPrimaryKey(resume);
	}

	/**����  ����ͨ����  ������ݵ�  id �� passComment �Ƿ�ͨ�� */
	public void sqSengPi(Integer id, String passComment) {
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(id);
		resume.setPassPasscomment(passComment);
		resume.setPassCheckStatus(3);			// ��Ϊ3��ʾ��������������û���������
		engageResumeMapper.updateByPrimaryKey(resume);
	}
	
}
