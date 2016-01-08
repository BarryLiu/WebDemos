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
	
	// 进入   简历登记 页面
	public String register(){
		String emajorReleaseidStr = ServletActionContext.getRequest().getParameter("id");
		
		System.out.println("他的主键是 ：  emajorReleaseidStr:   "+ emajorReleaseidStr);
		if(emajorReleaseidStr!=null)
			emajorRelease = positionService.selectEmajorReleaseById(Integer.parseInt(emajorReleaseidStr));
		
		majorKinds = resumeService.selectMajorKinds();
		configPublicChars = resumeService.selectPublicChar();
		return "register";
	}
	
	//添加一条 简历到  engage_resume 表中 
	public String saveEngageResume(){
		
		System.out.println("engageResume:   "+engageResume);
		resumeService.insertEngageResume(engageResume);

		System.out.println("添加成功 ");
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("addMsg", "添加成功");
		return "register";
	}
	
	
//简历筛选 页面============================1
	public String resumeChoose(){
		System.out.println(" 进入了  简历筛选 。。。。");
		
		majorKinds = positionService.selectMajorKinds();

		return "resume-choose";
	}
	//简历筛选 点击开始的操作
	public String findEngageResume() throws ParseException{
		System.out.println("简历筛选 点击开始的操作。。。。。。");
		return "resume-list";
	}

	private Integer page;
	private Integer rows;
	
	public String selectResumeList() throws IOException{
		System.out.println(" 进入 Ajax  得到分页的数据");
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
		System.out.println(" 进入--有效简历查询 。。。。。。");
		majorKinds = positionService.selectMajorKinds();
		
		
		return "valid-resume";
	}
	
	//到复核页面去 根据id 查询出来 哪个要复核的   和得到职位等的一系列数据
	public String resumeDetails(){
		 
		engageResume = resumeService.selectEngageResumeById(engageResume);
		System.out.println("engageResume : "+ engageResume);
		
			
		return "resume_details";
	}
	public String updateResume(){ // 到复核里面推荐
		
		resumeService.updateResume();
		return resumeChoose();
	}
	
	
	
//  有效简历筛选===============================2
	public String findEngageResumeOK(){
		return "valid-list";
	}
	//有效简历单个查询
	public String selectById(){
		String engageResumeIdStr = ServletActionContext.getRequest().getParameter("id");
		System.out.println("他的主键是 ：  emajorReleaseidStr:   "+ engageResumeIdStr);
		engageResume =  resumeService.selectById(engageResumeIdStr);
		
		return "resume-select";
	}
	
	
	
	
	
	
	
	/**根据id 删除 简历 */
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
