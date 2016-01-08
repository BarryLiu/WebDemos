package hr.action.recruit;

import org.apache.struts2.ServletActionContext;

import hr.entity.EngageInterview;
import hr.entity.EngageResume;
import hr.service.recruit.EmployService;
import hr.service.recruit.ResumeService;
import hr.utils.HrUtils;
 
/**
 * @author Eung-yuong Liu
 *
 */
public class EmployAction {
	private EmployService employService;
	private ResumeService resumeService;
	
	private EngageResume engageResume;
	private EngageInterview engageInterview;
	
//¼������==================1
	public String registerList(){
		System.out.println("���� ¼������  ����");
		
		return "register_list";
	}
	
	public String sqSegister(){// ����¼������ҳ��
		HrUtils.showParams();
		engageResume = resumeService.selectById(engageResume.getId()+"");
		engageInterview = employService.selectInterviewByResumeId(engageResume.getId());
		return "register";
	}
	
	public String sqRegister(){//¼���ύ
		System.out.println(engageResume);
		System.out.println();
		//String parameter = ServletActionContext.getRequest().getParameter("");
		String comment = engageResume.getPassCheckcomment();
		if("ͨ��".equals(comment)){
			employService.sqTiJiao(engageResume.getId(),"ͨ��");
		}else if("��ͨ��".equals(comment)){
			employService.sqTiJiao(engageResume.getId(),"��ͨ��");
		}
		
		return registerList();  // �ύ�������ҳ��
	}
	
	
//¼������==================2
	public String checkList(){
		System.out.println("���� ¼������  ����");
		
		return "check_list";
	}
	
	public String spCheck(){// ��������ҳ��
		HrUtils.showParams();
		engageResume = resumeService.selectById(engageResume.getId()+"");
		engageInterview = employService.selectInterviewByResumeId(engageResume.getId());
		return "check";
	}
	
	public String returnCheckList(){// �����ύ
		System.out.println(engageResume);

		String comment = engageResume.getPassPasscomment();
		if("ͨ��".equals(comment)){
			employService.sqSengPi(engageResume.getId(),"ͨ��");
			return "human_register";  // ͨ����Ҫ�������ݵ�������Դȥ
		}else if("��ͨ��".equals(comment)){
			employService.sqSengPi(engageResume.getId(),"��ͨ��");
		}
		
		return checkList();
	}
	
	
	
//¼���ѯ==================3
	public String list(){
		System.out.println("���� ¼���ѯ  ����");
		
		return "list";
	}
	public String cxDedails(){ // ��ѯ
		HrUtils.showParams();
		engageResume = resumeService.selectById(engageResume.getId()+"");
		engageInterview = employService.selectInterviewByResumeId(engageResume.getId());
		
		return "details";
	}
	
	
	
	
	
	
	public EmployService getEmployService() {
		return employService;
	}
	public void setEmployService(EmployService employService) {
		this.employService = employService;
	}
	public EngageResume getEngageResume() {
		return engageResume;
	}
	public void setEngageResume(EngageResume engageResume) {
		this.engageResume = engageResume;
	}
	public void setResumeService(ResumeService resumeService) {
		this.resumeService = resumeService;
	}
	public EngageInterview getEngageInterview() {
		return engageInterview;
	}
	public void setEngageInterview(EngageInterview engageInterview) {
		this.engageInterview = engageInterview;
	}
	
}
