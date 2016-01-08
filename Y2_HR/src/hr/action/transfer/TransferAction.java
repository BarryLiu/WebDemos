package hr.action.transfer;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.HumanFile;
import hr.entity.MajorChange;
import hr.entity.SalaryStandardDetails;
import hr.service.transfer.TransferService;



public class TransferAction {

	private Logger logger = Logger.getLogger(getClass());

	private TransferService transferService;

	public void setTransferService(TransferService transferService) {
		this.transferService = transferService;
	}

	private int page;// 页码
	private int rows;// 页面大小
	// 传递的数据
	private List<ConfigFileFirstKind> firsts;
	private List<ConfigFileSecondKind> seconds;
	private List<ConfigFileThirdKind> thirds;
	private ConfigFileFirstKind first;
	private HttpServletRequest request;
	private HumanFile humanFile;
	private MajorChange majorChange;
	private int id;
	private List<ConfigMajorKind> majorKinds;
	private List<SalaryStandardDetails> salarystandards;
	private Date dd1;
	private Date dd2;


	public Date getDd1() {
		return dd1;
	}

	public void setDd1(Date dd1) {
		this.dd1 = dd1;
	}

	public Date getDd2() {
		return dd2;
	}

	public void setDd2(Date dd2) {
		this.dd2 = dd2;
	}

	public List<SalaryStandardDetails> getSalarystandards() {
		return salarystandards;
	}

	public void setSalarystandards(List<SalaryStandardDetails> salarystandards) {
		this.salarystandards = salarystandards;
	}

	public List<ConfigMajorKind> getMajorKinds() {
		return majorKinds;
	}

	public void setMajorKinds(List<ConfigMajorKind> majorKinds) {
		this.majorKinds = majorKinds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public MajorChange getMajorChange() {
		return majorChange;
	}

	public void setMajorChange(MajorChange majorChange) {
		this.majorChange = majorChange;
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

	public void setRows(int rows) {
		this.rows = rows;
	}

	public HumanFile getHumanFile() {
		return humanFile;
	}

	public void setHumanFile(HumanFile humanFile) {
		this.humanFile = humanFile;
	}

	public List<HumanFile> getHumanFiles() {
		return humanFiles;
	}

	public void setHumanFiles(List<HumanFile> humanFiles) {
		this.humanFiles = humanFiles;
	}

	private List<HumanFile> humanFiles;

	public List<ConfigFileSecondKind> getSeconds() {
		return seconds;
	}

	public ConfigFileFirstKind getFirst() {
		return first;
	}

	public void setFirst(ConfigFileFirstKind first) {
		this.first = first;
	}

	public void setSeconds(List<ConfigFileSecondKind> seconds) {
		this.seconds = seconds;
	}

	public void setFirsts(List<ConfigFileFirstKind> firsts) {
		this.firsts = firsts;
	}

	public List<ConfigFileFirstKind> getFirsts() {
		return firsts;
	}

	public List<ConfigFileThirdKind> getThirds() {
		return thirds;
	}

	public void setThirds(List<ConfigFileThirdKind> thirds) {
		this.thirds = thirds;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	// 查询一级分类
	public String toQueryLocate() {

		firsts = transferService.selectAllFirsts();

		return "register_locate";
	}

	// 根据一级菜单的id 查出二级菜单
	public String findSecond() throws IOException {
		String firstKindId = first.getFirstKindId();
		Integer fkId = Integer.valueOf(firstKindId);
		if (fkId != 0) {
			seconds = transferService.selectSecondsByFirstId(fkId);
		} else {
			seconds = transferService.selectByExample();
		}
		System.out.println(seconds);
		String jsonStr = new Gson().toJson(seconds);
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

	// 根据二级菜单的id 查出三级菜单 如果二级菜单的id 为0 就根据一级菜单查询 ， 如果一级菜单的也是0 就查询全部的 三级菜单
	public String findThird() throws IOException {
		request = ServletActionContext.getRequest();
		thirds = transferService.findThird(request);
		String jsonStr = new Gson().toJson(thirds);
		sendClient(jsonStr);
		return null;
	}

	/**
	 * 根据 一二三四五 级菜单查询出humanFile 的对象并将他们 分页， 如果 没选就 忽略
	 * 
	 * @return
	 * @throws IOException
	 */
	public String selectProfile() throws IOException {
		Map<String, Object> data = transferService.selectProfile(humanFile,
				page, rows,dd1,dd2);
		String jsonStr = new Gson().toJson(data);
		sendClient(jsonStr);
		return null;
	}
	
	public String selectHumanById(){
		humanFile=transferService.selectHumanById(id);
		return  "register";
	}
	// 查询一级分类
	public String findFirst() throws IOException {
		firsts = transferService.selectAllFirsts();
		String jsonStr = new Gson().toJson(firsts);
		System.out.println(firsts);
		sendClient(jsonStr);
		return null;
	}
	//查询职位分类
	public String findMajorKind() throws IOException{
		majorKinds = transferService.selectAllMajorKinds();
		String jsonStr = new Gson().toJson(majorKinds);
		sendClient(jsonStr);
		return null;
	}
	
	//根据 职位类型id 查询出 职位 如果职位id 为0 就查询全部 的职位
	public String findMajor() throws IOException {

		List<ConfigMajor> configMajors = transferService.findMajor();

		String jsonStr = new Gson().toJson(configMajors);
		sendClient(jsonStr);

		return null;
	}
	
	//查询薪酬名称
	public String findStandardName() throws IOException{
		salarystandards = transferService.selectAllSalaryStandards();
		System.out.println(salarystandards.size());
		String jsonStr = new Gson().toJson(salarystandards);
		System.out.println(jsonStr);
		sendClient(jsonStr);
		return null;
	}
	
	public String findNewSalary() throws IOException {
		List<SalaryStandardDetails> salarys = transferService.findsalarys();
		String jsonStr = new Gson().toJson(salarys);
		sendClient(jsonStr);
		return null;
	}
	
	public String insertMajorChange(){
		majorChange.setCheckStatus(0);
	    transferService.insertMajorChange(majorChange);
	    logger.debug(majorChange.toString());
		return "register_success";
	}
	
	public String selectMajorChange() throws IOException {
		Map<String, Object> data = transferService.selectMajorChange(page, rows);
		String jsonStr = new Gson().toJson(data);
		 logger.debug(data.toString());
		sendClient(jsonStr);
		return null;
	}
	
	public String selectMajorChangeById(){
		majorChange =transferService.selectById(id);
		return "check";
	}
	
	public String updateMajorChange(){
		System.out.println(majorChange.toString());
		transferService.updateMajorChange(majorChange);
		return "check_success";
	}
	//  查询出所有的一级菜单
	public String toQueryLocate2() {

		// 查询一级分类种类
		firsts = transferService.selectAllFirsts();

		// 查询全部 的 职位种类
		majorKinds = transferService.selectAllMajorKinds();

		return "locate";
	}
	
	public String selectMajorChange2() throws IOException{
		Map<String, Object> data = transferService.selectMajorChange2(majorChange,page, rows,dd1,dd2);
		
		String jsonStr = new Gson().toJson(data);
		sendClient(jsonStr);
		return null;
	}
	
	public String selectMajorChangeById2(){
		majorChange =transferService.selectById(id);
		return "detail";
	}
	
}
