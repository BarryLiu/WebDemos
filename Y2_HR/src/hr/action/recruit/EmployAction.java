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
	
//录入申请==================1
	public String registerList(){
		System.out.println("进入 录入申请  。。");
		
		return "register_list";
	}
	
	public String sqSegister(){// 进入录入详情页面
		HrUtils.showParams();
		engageResume = resumeService.selectById(engageResume.getId()+"");
		engageInterview = employService.selectInterviewByResumeId(engageResume.getId());
		return "register";
	}
	
	public String sqRegister(){//录入提交
		System.out.println(engageResume);
		System.out.println();
		//String parameter = ServletActionContext.getRequest().getParameter("");
		String comment = engageResume.getPassCheckcomment();
		if("通过".equals(comment)){
			employService.sqTiJiao(engageResume.getId(),"通过");
		}else if("不通过".equals(comment)){
			employService.sqTiJiao(engageResume.getId(),"不通过");
		}
		
		return registerList();  // 提交后继续回页面
	}
	
	
//录入审批==================2
	public String checkList(){
		System.out.println("进入 录入审批  。。");
		
		return "check_list";
	}
	
	public String spCheck(){// 进入审批页面
		HrUtils.showParams();
		engageResume = resumeService.selectById(engageResume.getId()+"");
		engageInterview = employService.selectInterviewByResumeId(engageResume.getId());
		return "check";
	}
	
	public String returnCheckList(){// 审批提交
		System.out.println(engageResume);

		String comment = engageResume.getPassPasscomment();
		if("通过".equals(comment)){
			employService.sqSengPi(engageResume.getId(),"通过");
			return "human_register";  // 通过就要插入数据到人力资源去
		}else if("不通过".equals(comment)){
			employService.sqSengPi(engageResume.getId(),"不通过");
		}
		
		return checkList();
	}
	
	
	
//录入查询==================3
	public String list(){
		System.out.println("进入 录入查询  。。");
		
		return "list";
	}
	public String cxDedails(){ // 查询
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
