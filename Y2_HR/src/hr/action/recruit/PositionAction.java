package hr.action.recruit;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.EngageMajorRelease;
import hr.service.recruit.PositionService;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;

/**
 *  人力资源--招聘管理--职位发布管理
 * @author Eung-yuong Liu
 *
 */
public class PositionAction {
	
	
	private PositionService positionService;
	 
	public void setPositionService(PositionService positionService) {
		this.positionService = positionService;
	}


	private List<ConfigFileFirstKind> firsts;
	private List<ConfigMajorKind> majorKinds;
	private HttpServletRequest request;
	private EngageMajorRelease emajorRelease;
	
	
// 进入职位发布登记   ===============================1
	public String register(){
		firsts = positionService.selectFirsts();//查询全部 的 一级机构
		majorKinds = positionService.selectMajorKinds();//查询全部 的 职位种类
		return "position_register";
	}

	
	public String findSecond() throws IOException{//根据一级菜单的id   查出二级菜单   
		List<ConfigFileSecondKind> seconds = positionService.findSecond();
		String jsonStr= new Gson().toJson(seconds);
		sendClient(jsonStr);
		return null;
	}
	
	public String findThird() throws IOException{ // 查询三级菜单  
		request = ServletActionContext.getRequest();
		List<ConfigFileThirdKind> thirds  =positionService.findThird(request);
		String jsonStr= new Gson().toJson(thirds);
		
		for (ConfigFileThirdKind configFileThirdKind : thirds) {
			System.out.println("三级："+configFileThirdKind);
		}
		sendClient(jsonStr);
		return null;
	}
	
	
	public String findMajor() throws IOException{ // 查询职位名称
		request =ServletActionContext.getRequest();
		List<ConfigMajor> configMajors =null;
		configMajors = positionService.findMajor(request);
		String jsonStr = new Gson().toJson(configMajors);
		sendClient(jsonStr);
		return null;
	}
	
	public String addEmajorRelease(){ //发布职位， emajor_release 表插入数据
		System.out.println(emajorRelease);
		int i =positionService.insertEmajorRelease(emajorRelease);
		return positionChangeUpdate();
	}
	
	
	
	
	
	
	private Integer page=1;
	private Integer rows=5;
	private Integer count=0;
	private Integer pageCount=0;
	private List<EngageMajorRelease> emajorReleases;
	
//职位发布管理--职位发布变更    进入（如果第一次进  就是第一页 ， 一页五行）  =========================2
	public String positionChangeUpdate(){
		
		count = positionService.geteMajorReleaseCount(null);
	
		String nextPage = ServletActionContext.getRequest().getParameter("nextPage");
		if(nextPage!=null){
			page=Integer.parseInt(nextPage);
		}
		
		emajorReleases = positionService.geteMajorReleasePage(emajorRelease,page,rows);
		//得到一共有几页 
		pageCount=(int) Math.ceil(count/(rows*1.0));
		System.out.println("页面的属性：  count: "+count + " rows: "+rows + "  pageCount: "+ pageCount);
		
		return "position_change_update";
	}
	
	 
	public String  positionReleaseChange(){ //职位发布变更    根据id 查询到 再跳到 更改页面 
		emajorRelease = positionService.selectEmajorReleaseById(emajorRelease.getId());
		return "position_release_change";
	}
	
	public String doPositionReleaseChange() throws ParseException{//执行更改， 成功 后跳到他的列表页面  改完进主页面
		request = ServletActionContext.getRequest();
		String changeTime = request.getParameter("emajorRelease.changeTime");
		String deadline = request.getParameter("emajorRelease.deadline");
		System.out.println("changeTime: "+changeTime+ " deadline： "+deadline);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //得到的数据 赋值给对象 
		Date cTime = sdf.parse(changeTime);
		  sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dline = sdf.parse(deadline);
		emajorRelease.setChangeTime(cTime);
		emajorRelease.setDeadline(dline);
		System.out.println("==============:  "+emajorRelease);
		positionService.updateEmajorRelease(emajorRelease);
		return positionChangeUpdate();
	}
	
	public String positionChangeDelete(){ // 职位发布变更    根据id 删除
		Integer id = emajorRelease.getId();
		
		int i = positionService.deleteEmajorReleaseById(id);
		
		return positionChangeUpdate();
	}
	
	
	
	
	
	
//进入职位发布查询  主页面 （如果第一次进  就是第一页 ， 一页五行）========================================3
	public  String positionReleaseSearch(){
		
		count = positionService.geteMajorReleaseCount(null);
		String nextPage = ServletActionContext.getRequest().getParameter("nextPage");
		if(nextPage!=null){
			page=Integer.parseInt(nextPage);
		}
		emajorReleases = positionService.geteMajorReleasePage(emajorRelease,page,rows);
		for (EngageMajorRelease kind : emajorReleases) {
			System.out.println(kind);
		}
		//得到一共有几页 
		pageCount=(int) Math.ceil(count/(rows*1.0));
		System.out.println("页面的属性：  count: "+count + " rows: "+rows + "  pageCount: "+ pageCount);
		
		return "position_release_search";
	}
	/**
	 * 职位申请    根据id 查询到 再跳到 更改页面 
	 * @return
	 */
	public String  positionReleaseDetails(){
		System.out.println("emajorRelease.getId():   "+emajorRelease.getId());
		emajorRelease = positionService.selectEmajorReleaseById(emajorRelease.getId());
		return "position_release_details";
	}
	
	
	
	
	
	
	
	public List<ConfigMajorKind> getMajorKinds() {
		return majorKinds;
	}
	public void setMajorKinds(List<ConfigMajorKind> majorKinds) {
		this.majorKinds = majorKinds;
	}
	 
	public List<ConfigFileFirstKind> getFirsts() {
		return firsts;
	}
	public void setFirsts(List<ConfigFileFirstKind> firsts) {
		this.firsts = firsts;
	}

 

	 

	public EngageMajorRelease getEmajorRelease() {
		return emajorRelease;
	}

	public void setEmajorRelease(EngageMajorRelease emajorRelease) {
		this.emajorRelease = emajorRelease;
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

	public List<EngageMajorRelease> getEmajorReleases() {
		return emajorReleases;
	}

	public void setEmajorReleases(List<EngageMajorRelease> emajorReleases) {
		this.emajorReleases = emajorReleases;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public HttpServletRequest getRequest() {
		return request;
	}


	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}


	public PositionService getPositionService() {
		return positionService;
	}


	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * 将要  发送的json 字符串发送到服务端去   
	 * @param jsonStr  json 字符串
	 * @throws IOException  
	 */
	private void sendClient(String jsonStr) throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(jsonStr);
	}

	
}
