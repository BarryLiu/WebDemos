package hr.action.recruit;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import hr.entity.ConfigMajorKind;
import hr.entity.ConfigPublicChar;
import hr.entity.EngageMajorRelease;
import hr.entity.EngageResume;
import hr.service.recruit.PositionService;
import hr.service.recruit.ResumeService;
import hr.utils.HrUtils;
import hr.utils.UtilBean;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;

public class ResumeAction {
	private ResumeService resumeService;
	private PositionService positionService;
	
	private List<ConfigMajorKind> majorKinds;
	private EngageResume engageResume;
	private UtilBean utilBean;
	private EngageMajorRelease emajorRelease;
	private List<ConfigPublicChar> configPublicChars;
	
	// ����   �����Ǽ� ҳ��
	public String register(){
		String emajorReleaseidStr = ServletActionContext.getRequest().getParameter("id");
		
		System.out.println("���������� ��  emajorReleaseidStr:   "+ emajorReleaseidStr);
		if(emajorReleaseidStr!=null)
			emajorRelease = positionService.selectEmajorReleaseById(Integer.parseInt(emajorReleaseidStr));
		
		majorKinds = resumeService.selectMajorKinds();
		configPublicChars = resumeService.selectPublicChar();
		return "register";
	}
	
	//���һ�� ������  engage_resume ���� 
	public String saveEngageResume(){
		
		System.out.println("engageResume:   "+engageResume);
		resumeService.insertEngageResume(engageResume);

		System.out.println("��ӳɹ� ");
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("addMsg", "��ӳɹ�");
		return "register";
	}
	
	
//����ɸѡ ҳ��============================1
	public String resumeChoose(){
		System.out.println(" ������  ����ɸѡ ��������");
		
		majorKinds = positionService.selectMajorKinds();

		return "resume-choose";
	}
	//����ɸѡ �����ʼ�Ĳ���
	public String findEngageResume() throws ParseException{
		System.out.println("����ɸѡ �����ʼ�Ĳ���������������");
		return "resume-list";
	}

	private Integer page;
	private Integer rows;
	
	public String selectResumeList() throws IOException{
		System.out.println(" ���� Ajax  �õ���ҳ������");
		if(page==null || page<0)page =1;
		if(rows==null || rows<0)rows=5;
		System.out.println(engageResume);
		System.out.println(utilBean);
		System.out.println("page:"+page+"  rows: " + rows );
	 	Map<String, Object> data = resumeService.selectResumeList(engageResume,utilBean,
				page, rows);
		String jsonStr = new Gson().toJson(data);
		System.out.println("jsonStr:    " + jsonStr);
		HrUtils.sendClient(jsonStr);
		return null;
	}
	
	
	
	
	
// 
	public String validResume(){
		System.out.println(" ����--��Ч������ѯ ������������");
		majorKinds = positionService.selectMajorKinds();
		
		
		return "valid-resume";
	}
	
	//������ҳ��ȥ ����id ��ѯ���� �ĸ�Ҫ���˵�   �͵õ�ְλ�ȵ�һϵ������
	public String resumeDetails(){
		 
		engageResume = resumeService.selectEngageResumeById(engageResume);
		System.out.println("engageResume : "+ engageResume);
		
			
		return "resume_details";
	}
	public String updateResume(){ // �����������Ƽ�
		
		resumeService.updateResume();
		return resumeChoose();
	}
	
	
	
//  ��Ч����ɸѡ===============================2
	public String findEngageResumeOK(){
		return "valid-list";
	}
	//��Ч����������ѯ
	public String selectById(){
		String engageResumeIdStr = ServletActionContext.getRequest().getParameter("id");
		System.out.println("���������� ��  emajorReleaseidStr:   "+ engageResumeIdStr);
		engageResume =  resumeService.selectById(engageResumeIdStr);
		
		return "resume-select";
	}
	
	
	
	
	
	
	
	/**����id ɾ�� ���� */
	public String deleteResumeById(){
		System.out.println("....");
		HttpServletRequest request = ServletActionContext.getRequest();
		//String resumeId = request.getParameter("resumeId");
		if(engageResume.getId()!=null)
			resumeService.deleteResumeById(engageResume.getId());
		
		String jspName = request.getParameter("jspName");
		return jspName;
	}
	
	
	public EngageResume getEngageResume() {
		return engageResume;
	}

	public void setEngageResume(EngageResume engageResume) {
		this.engageResume = engageResume;
	}

	public List<ConfigMajorKind> getMajorKinds() {
		return majorKinds;
	}
	public void setMajorKinds(List<ConfigMajorKind> majorKinds) {
		this.majorKinds = majorKinds;
	} 
	
	public void setPositionService(PositionService positionService) {
		this.positionService = positionService;
	}
	public ResumeService getResumeService() {
		return resumeService;
	}
	public void setResumeService(ResumeService resumeService) {
		this.resumeService = resumeService;
	}

	public void setUtilBean(UtilBean utilBean) {
		this.utilBean = utilBean;
	}

	public UtilBean getUtilBean() {
		return utilBean;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public EngageMajorRelease getEmajorRelease() {
		return emajorRelease;
	}

	public void setEmajorRelease(EngageMajorRelease emajorRelease) {
		this.emajorRelease = emajorRelease;
	}

	public List<ConfigPublicChar> getConfigPublicChars() {
		return configPublicChars;
	}

	public void setConfigPublicChars(List<ConfigPublicChar> configPublicChars) {
		this.configPublicChars = configPublicChars;
	}
	
}
