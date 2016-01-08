package hr.action.recruit;

import hr.entity.ConfigMajorKind;
import hr.entity.EngageInterview;
import hr.entity.EngageResume;
import hr.service.recruit.InterViewService;
import hr.service.recruit.PositionService;
import hr.utils.HrUtils;
import hr.utils.UtilBean;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class InterViewAction {
	private InterViewService interViewService;
	private PositionService positionService;
	
	private List<ConfigMajorKind> majorKinds;
	private EngageResume engageResume;
	private EngageInterview engageInterview;
	private UtilBean utilBean;
	
	private Integer page;
	private Integer rows;
	
	
	
//进入 面试结果登记 筛选页面 
	public String interviewResume(){
		System.out.println("进入了interview-list");
		return "interview-list";
	}
	// 进入 面试结果登记页面
	public String interviewList(){
		System.out.println("进入了InterViewAction    "+interViewService);
		majorKinds = positionService.selectMajorKinds();
		return "interview-resume";
	}
	
	//ajAx 异步加载出     “面试结果登记页面” 的数据
	public String loadList() throws IOException{
		
		System.out.println(engageResume);
		System.out.println(utilBean);
	 	Map<String, Object> data = interViewService.selectResumeList(engageResume,utilBean,
				page, rows);
		String jsonStr = new Gson().toJson(data);
		HrUtils.sendClient(jsonStr);
		return null;
	}
	// 进入登记页面 ， 将需要的数据更具id 查询出来 
	public String interviewRegister(){
		engageResume = interViewService.selectResumeById(engageResume.getId());
//		int count = interViewService.selectAmountCount(engageResume.getId());// 得到面试 次数   （没多一条数据加一条数据的方法）
		engageInterview = interViewService.selectInterViewOne(engageResume.getId());
		int count=0;
		if(engageInterview != null){
			count = engageInterview.getInterviewAmount();//（不添加数据 ， 只改变他的 第几次面试属性）
		}else{
			engageInterview =new EngageInterview();
		}
		engageInterview.setInterviewAmount(++count);// 加上本次的面试次数
		System.out.println("面试次数 ： count:  "+count);
		
		
		System.out.println(engageResume);
		
		
		return "interview-register";
	}
	// 登记面试 
	public String toList() throws IOException{
		// 登记完成， 设置 简历为已登记
		interViewService.toDengJiResume(engageResume.getId());
		
		
		engageInterview.setInterviewStatus(1);// 面试完成。
		System.out.println(engageInterview);
		if(engageInterview.getId()==null|| "".equals(engageInterview.getId())){
			interViewService.insertInterView(engageInterview);
		}else{
			interViewService.updateInterView(engageInterview);
		}
		return interviewList();
	}
	
	
	
//------------------------------面试筛选
	public String siftList(){
		System.out.println("进入面试筛选。。");
		return "sift-list";
	}
	
	
	//ajAx 异步加载出     “面试结果登记页面” 的数据
		public String loadInterViewList() throws IOException{
			
			System.out.println("page:"+page+"  rows: " + rows );
			System.out.println(engageResume);
			System.out.println(utilBean);
		 	Map<String, Object> data = interViewService.selectInterViewList(page, rows);
			String jsonStr = new Gson().toJson(data);
			System.out.println("jsonStr:    " + jsonStr);
			System.out.println("ok.......");
			HrUtils.sendClient(jsonStr);
			return null;
		}
		
		
	public String interviewSift(){  // 进入面试赛选
		engageResume = interViewService.selectResumeById(engageResume.getId());
		engageInterview = interViewService.selectInterViewOne(engageResume.getId());
		System.out.println();
		System.out.println(engageResume);
		System.out.println(engageInterview);
		return "interview-sift";
	}
	
	public String returnSiftList(){
		String checkcomment = engageResume.getPassCheckcomment();
		Integer rid=engageResume.getId();
		Integer iid=engageInterview.getId();
		if("建议面试".equals(checkcomment)){
			System.out.println("建议面试");
			interViewService.addviceInterView(rid,iid);
			
		}else if("建议笔试".equals(checkcomment)){
			System.out.println("建议笔试");
			System.out.println("没有笔试模块");
			
		}else if("建议录用".equals(checkcomment)){
			System.out.println("建议录用");
			interViewService.adviceLuYong(rid,iid);
			
		}else if("删除简历".equals(checkcomment)){
			System.out.println("建议简历");
			interViewService.adviceDeleteResumeAndInterView(rid,iid);
			
		}
		
		
		return siftList();//提交成功， 进入面试列表主页面
	}
	
	public InterViewService getInterViewService() {
		return interViewService;
	}

	public void setInterViewService(InterViewService interViewService) {
		this.interViewService = interViewService;
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

	public EngageResume getEngageResume() {
		return engageResume;
	}

	public void setEngageResume(EngageResume engageResume) {
		this.engageResume = engageResume;
	}

	public UtilBean getUtilBean() {
		return utilBean;
	}

	public void setUtilBean(UtilBean utilBean) {
		this.utilBean = utilBean;
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
	public EngageInterview getEngageInterview() {
		return engageInterview;
	}
	public void setEngageInterview(EngageInterview engageInterview) {
		this.engageInterview = engageInterview;
	}
}
