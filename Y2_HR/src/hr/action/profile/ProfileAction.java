package hr.action.profile;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.ConfigPublicChar;
import hr.entity.HumanFile;
import hr.service.profile.ProfileService;
import hr.service.recruit.ResumeService;
import hr.utils.UtilBean;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
/**
 * 人力资源档案管理 
 * @author Eung-yuong Liu
 *
 */
public class ProfileAction {
	// 为action 写 实现逻辑
	private ProfileService profileService;
	private ResumeService resumeService;

	public void setProfileService(ProfileService profileService) {
		this.profileService = profileService;
	}
	public void setResumeService(ResumeService resumeService) {
		this.resumeService = resumeService;
	}
// 
	private int page;// 页码
	private int rows;// 页面大小
	
	//用于传递 的数据 
	private List<ConfigFileFirstKind> firsts;
	private List<ConfigFileSecondKind> seconds;
	private List<ConfigFileThirdKind> thirds;

	private List<ConfigMajorKind> majorKinds;
	private ConfigFileFirstKind first;

	private UtilBean utilBean;
	private HumanFile humanFile;
	private HttpServletRequest request;
	private List<HumanFile> humanFiles;
	private List<ConfigPublicChar> configPublicChars;
	

	private int count ;
	
	public UtilBean getUtilBean() {
		return utilBean;
	}
	public void setUtilBean(UtilBean utilBean) {
		this.utilBean = utilBean;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public List<ConfigPublicChar> getConfigPublicChars() {
		return configPublicChars;
	}
	public void setConfigPublicChars(List<ConfigPublicChar> configPublicChars) {
		this.configPublicChars = configPublicChars;
	}
	public ProfileService getProfileService() {
		return profileService;
	}
	public ResumeService getResumeService() {
		return resumeService;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public List<HumanFile> getHumanFiles() {
		return humanFiles;
	}

	public void setHumanFiles(List<HumanFile> humanFiles) {
		this.humanFiles = humanFiles;
	}

	public List<ConfigMajorKind> getMajorKinds() {
		return majorKinds;
	}

	public void setMajorKinds(List<ConfigMajorKind> majorKinds) {
		this.majorKinds = majorKinds;
	}

	public HumanFile getHumanFile() {
		return humanFile;
	}

	public void setHumanFile(HumanFile humanFile) {
		this.humanFile = humanFile;
	}

	public ConfigFileFirstKind getFirst() {
		return first;
	}

	public void setFirst(ConfigFileFirstKind first) {
		this.first = first;
	}

	public List<ConfigFileFirstKind> getFirsts() {
		return firsts;
	}

	public void setFirsts(List<ConfigFileFirstKind> firsts) {
		this.firsts = firsts;
	}

	public List<ConfigFileSecondKind> getSeconds() {
		return seconds;
	}

	public void setSeconds(List<ConfigFileSecondKind> seconds) {
		this.seconds = seconds;
	}

	public List<ConfigFileThirdKind> getThirds() {
		return thirds;
	}

	public void setThirds(List<ConfigFileThirdKind> thirds) {
		this.thirds = thirds;
	}

	
	
	
	
	
	 
//人力资源档案查询      查询出所有的一级菜单====================3
	public String toQueryLocate() {

		// 查询一级分类种类
		firsts = profileService.selectAllFirsts();
		// 查询全部 的 职位种类
		majorKinds = profileService.selectAllMajorKinds();
		return "query_locate";
	}

	// 根据一级菜单的id 查出二级菜单
	public String findSecond() throws IOException {
		String firstKindId = first.getFirstKindId();
		System.out.println("comming............" + firstKindId);
		Integer fkId = Integer.valueOf(firstKindId);
		if (fkId != 0) {
			seconds = profileService.selectSecondsByFirstId(fkId);
		} else {
			seconds = profileService.selectByExample();
		}
		String jsonStr = new Gson().toJson(seconds);
		System.out.println("jsonStr:   " + jsonStr);
		sendClient(jsonStr);

		return null;
	}

	/**
	 * 将要 发送的json 字符串发送到服务端去
	 * 
	 * @param jsonStr
	 *            json 字符串
	 * @throws IOException
	 */
	private void sendClient(String jsonStr) throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(jsonStr);
	}

	//根据二级菜单的id 查出三级菜单 如果二级菜单的id 为0 就根据一级菜单查询 ， 如果一级菜单的也是0 就查询全部的 三级菜单
	public String findThird() throws IOException {
		request = ServletActionContext.getRequest();
		thirds = profileService.findThird(request);

		String jsonStr = new Gson().toJson(thirds);
		sendClient(jsonStr);

		return null;
	}

	//根据 职位类型id 查询出 职位 如果职位id 为0 就查询全部 的职位
	public String findMajor() throws IOException {

		List<ConfigMajor> configMajors = profileService.findMajor();

		String jsonStr = new Gson().toJson(configMajors);
		sendClient(jsonStr);

		return null;
	}
	
	/**
	 *  根据 一二三四五 级菜单查询出humanFile 的对象并将他们 分页， 如果 没选就 忽略
	 * @return
	 * @throws IOException
	 */
	public String selectProfile() throws IOException {
		Map<String, Object> data = profileService.selectProfile(humanFile,
				page, rows);
		String jsonStr = new Gson().toJson(data);
		System.out.println("jsonStr:    " + jsonStr);
		sendClient(jsonStr);
		return null;
	}
	/**分页查询 比上面方法多了一个 条件(jsp 传过来 queryTag的值) 查询功能*/
	public String selectProfileTag() throws IOException {
		
		Map<String, Object> data = profileService.selectProfileTag(humanFile,utilBean,
				page, rows);
		String jsonStr = new Gson().toJson(data);
		System.out.println("jsonStr:    " + jsonStr);
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/json;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(jsonStr);
		return null;
	}
	
	
// 人力资源档案登记  ==================================================1
	public String humanRegister(){
		System.out.println("进入人力资源档案登记");
		
		firsts = profileService.selectAllFirsts();// 查询一级分类种类
		majorKinds = profileService.selectAllMajorKinds();// 查询全部 的 职位种类
		configPublicChars = resumeService.selectPublicChar(); // 查询全部的公共字段
		return "human_register";
	}
	public String doDengji(){ // 登记
		System.out.println("登记。。");
		return null;
	}
	
	
// 人力资源档案登记复核================================================2
	public String checkList(){
		count = profileService.selectCount();
		return "check_list";
	}
	public String humanCheck(){ // 复核
		humanFile = profileService.selectHumanFile(humanFile.getId());
		return "human_check";
	}
	
	
// 人力资源档案变更 ====================================================4
	public String changeLocate(){
		// 查询一级分类种类
		firsts = profileService.selectAllFirsts();
		// 查询全部 的 职位种类
		majorKinds = profileService.selectAllMajorKinds();
		return "change_locate";
	}
	public String toChange(){
		humanFile = profileService.selectHumanFile(humanFile.getId());
		configPublicChars = resumeService.selectPublicChar(); // 查询全部的公共字段
		return "change_list_information";
	}
}
