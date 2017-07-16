package hr.action.profile;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.HumanFile;
import hr.service.profile.ProfileService;

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

	public void setProfileService(ProfileService profileService) {
		this.profileService = profileService;
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

	private HumanFile humanFile;
	private HttpServletRequest request;
	private List<HumanFile> humanFiles;

	

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

	
	
	
	
	
	//  ��ѯ�����е�һ���˵�
	public String toQueryLocate() {

		System.out.println("laile...............");
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
		System.out.println(humanFile);
		Map<String, Object> data = profileService.selectProfile(humanFile,
				page, rows);
		String jsonStr = new Gson().toJson(data);

		System.out.println("jsonStr:    " + jsonStr);
		System.out.println("ok.......");

		sendClient(jsonStr);

		return null;
	}
}
