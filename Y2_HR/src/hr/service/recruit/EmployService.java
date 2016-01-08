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
		if(interviews.size()==0)// 如果没有查到数据， 就返回null 
			return null;

		return interviews.get(interviews.size()-1);
	}

	/**审核 申请通过？  这个数据的  id ， checkComment 是否通过 */
	public void sqTiJiao(Integer id,String checkComment) {
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(id);
		resume.setPassCheckcomment(checkComment);
		resume.setPassCheckStatus(2);			// 设为2 表示 审核 申请栏里面没有这个数据
		engageResumeMapper.updateByPrimaryKey(resume);
	}

	/**审批  申请通过？  这个数据的  id ， passComment 是否通过 */
	public void sqSengPi(Integer id, String passComment) {
		EngageResume resume = engageResumeMapper.selectByPrimaryKey(id);
		resume.setPassPasscomment(passComment);
		resume.setPassCheckStatus(3);			// 设为3表示审批申请栏里面没有这个数据
		engageResumeMapper.updateByPrimaryKey(resume);
	}
	
}
