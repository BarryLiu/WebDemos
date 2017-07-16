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

	private int page;// ҳ��
	private int rows;// ҳ���С
	// ���ݵ�����
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

	// ��ѯһ������
	public String toQueryLocate() {

		firsts = transferService.selectAllFirsts();

		return "register_locate";
	}

	// ����һ���˵���id ��������˵�
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
	 * ��Ҫ ���͵�json �ַ������͵������ȥ
	 * 
	 * @param jsonStr
	 *            json �ַ���
	 * @throws IOException
	 */
	private void sendClient(String jsonStr) throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(jsonStr);
	}

	// ���ݶ����˵���id ��������˵� ��������˵���id Ϊ0 �͸���һ���˵���ѯ �� ���һ���˵���Ҳ��0 �Ͳ�ѯȫ���� �����˵�
	public String findThird() throws IOException {
		request = ServletActionContext.getRequest();
		thirds = transferService.findThird(request);
		String jsonStr = new Gson().toJson(thirds);
		sendClient(jsonStr);
		return null;
	}

	/**
	 * ���� һ�������� ���˵���ѯ��humanFile �Ķ��󲢽����� ��ҳ�� ��� ûѡ�� ����
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
	// ��ѯһ������
	public String findFirst() throws IOException {
		firsts = transferService.selectAllFirsts();
		String jsonStr = new Gson().toJson(firsts);
		System.out.println(firsts);
		sendClient(jsonStr);
		return null;
	}
	//��ѯְλ����
	public String findMajorKind() throws IOException{
		majorKinds = transferService.selectAllMajorKinds();
		String jsonStr = new Gson().toJson(majorKinds);
		sendClient(jsonStr);
		return null;
	}
	
	//���� ְλ����id ��ѯ�� ְλ ���ְλid Ϊ0 �Ͳ�ѯȫ�� ��ְλ
	public String findMajor() throws IOException {

		List<ConfigMajor> configMajors = transferService.findMajor();

		String jsonStr = new Gson().toJson(configMajors);
		sendClient(jsonStr);

		return null;
	}
	
	//��ѯн������
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
	//  ��ѯ�����е�һ���˵�
	public String toQueryLocate2() {

		// ��ѯһ����������
		firsts = transferService.selectAllFirsts();

		// ��ѯȫ�� �� ְλ����
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
