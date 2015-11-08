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
 * ������Դ�������� 
 * @author Eung-yuong Liu
 *
 */
public class ProfileAction {
	// Ϊaction д ʵ���߼�
	private ProfileService profileService;
	private ResumeService resumeService;

	public void setProfileService(ProfileService profileService) {
		this.profileService = profileService;
	}
	public void setResumeService(ResumeService resumeService) {
		this.resumeService = resumeService;
	}
// 
	private int page;// ҳ��
	private int rows;// ҳ���С
	
	//���ڴ��� ������ 
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

	
	
	
	
	
	 
//������Դ������ѯ      ��ѯ�����е�һ���˵�====================3
	public String toQueryLocate() {

		// ��ѯһ����������
		firsts = profileService.selectAllFirsts();
		// ��ѯȫ�� �� ְλ����
		majorKinds = profileService.selectAllMajorKinds();
		return "query_locate";
	}

	// ����һ���˵���id ��������˵�
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

	//���ݶ����˵���id ��������˵� ��������˵���id Ϊ0 �͸���һ���˵���ѯ �� ���һ���˵���Ҳ��0 �Ͳ�ѯȫ���� �����˵�
	public String findThird() throws IOException {
		request = ServletActionContext.getRequest();
		thirds = profileService.findThird(request);

		String jsonStr = new Gson().toJson(thirds);
		sendClient(jsonStr);

		return null;
	}

	//���� ְλ����id ��ѯ�� ְλ ���ְλid Ϊ0 �Ͳ�ѯȫ�� ��ְλ
	public String findMajor() throws IOException {

		List<ConfigMajor> configMajors = profileService.findMajor();

		String jsonStr = new Gson().toJson(configMajors);
		sendClient(jsonStr);

		return null;
	}
	
	/**
	 *  ���� һ�������� ���˵���ѯ��humanFile �Ķ��󲢽����� ��ҳ�� ��� ûѡ�� ����
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
	/**��ҳ��ѯ �����淽������һ�� ����(jsp ������ queryTag��ֵ) ��ѯ����*/
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
	
	
// ������Դ�����Ǽ�  ==================================================1
	public String humanRegister(){
		System.out.println("����������Դ�����Ǽ�");
		
		firsts = profileService.selectAllFirsts();// ��ѯһ����������
		majorKinds = profileService.selectAllMajorKinds();// ��ѯȫ�� �� ְλ����
		configPublicChars = resumeService.selectPublicChar(); // ��ѯȫ���Ĺ����ֶ�
		return "human_register";
	}
	public String doDengji(){ // �Ǽ�
		System.out.println("�Ǽǡ���");
		return null;
	}
	
	
// ������Դ�����ǼǸ���================================================2
	public String checkList(){
		count = profileService.selectCount();
		return "check_list";
	}
	public String humanCheck(){ // ����
		humanFile = profileService.selectHumanFile(humanFile.getId());
		return "human_check";
	}
	
	
// ������Դ������� ====================================================4
	public String changeLocate(){
		// ��ѯһ����������
		firsts = profileService.selectAllFirsts();
		// ��ѯȫ�� �� ְλ����
		majorKinds = profileService.selectAllMajorKinds();
		return "change_locate";
	}
	public String toChange(){
		humanFile = profileService.selectHumanFile(humanFile.getId());
		configPublicChars = resumeService.selectPublicChar(); // ��ѯȫ���Ĺ����ֶ�
		return "change_list_information";
	}
}
