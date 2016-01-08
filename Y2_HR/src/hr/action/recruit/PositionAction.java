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
 *  ������Դ--��Ƹ����--ְλ��������
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
	
	
// ����ְλ�����Ǽ�   ===============================1
	public String register(){
		firsts = positionService.selectFirsts();//��ѯȫ�� �� һ������
		majorKinds = positionService.selectMajorKinds();//��ѯȫ�� �� ְλ����
		return "position_register";
	}

	
	public String findSecond() throws IOException{//����һ���˵���id   ��������˵�   
		List<ConfigFileSecondKind> seconds = positionService.findSecond();
		String jsonStr= new Gson().toJson(seconds);
		sendClient(jsonStr);
		return null;
	}
	
	public String findThird() throws IOException{ // ��ѯ�����˵�  
		request = ServletActionContext.getRequest();
		List<ConfigFileThirdKind> thirds  =positionService.findThird(request);
		String jsonStr= new Gson().toJson(thirds);
		
		for (ConfigFileThirdKind configFileThirdKind : thirds) {
			System.out.println("������"+configFileThirdKind);
		}
		sendClient(jsonStr);
		return null;
	}
	
	
	public String findMajor() throws IOException{ // ��ѯְλ����
		request =ServletActionContext.getRequest();
		List<ConfigMajor> configMajors =null;
		configMajors = positionService.findMajor(request);
		String jsonStr = new Gson().toJson(configMajors);
		sendClient(jsonStr);
		return null;
	}
	
	public String addEmajorRelease(){ //����ְλ�� emajor_release ���������
		System.out.println(emajorRelease);
		int i =positionService.insertEmajorRelease(emajorRelease);
		return positionChangeUpdate();
	}
	
	
	
	
	
	
	private Integer page=1;
	private Integer rows=5;
	private Integer count=0;
	private Integer pageCount=0;
	private List<EngageMajorRelease> emajorReleases;
	
//ְλ��������--ְλ�������    ���루�����һ�ν�  ���ǵ�һҳ �� һҳ���У�  =========================2
	public String positionChangeUpdate(){
		
		count = positionService.geteMajorReleaseCount(null);
	
		String nextPage = ServletActionContext.getRequest().getParameter("nextPage");
		if(nextPage!=null){
			page=Integer.parseInt(nextPage);
		}
		
		emajorReleases = positionService.geteMajorReleasePage(emajorRelease,page,rows);
		//�õ�һ���м�ҳ 
		pageCount=(int) Math.ceil(count/(rows*1.0));
		System.out.println("ҳ������ԣ�  count: "+count + " rows: "+rows + "  pageCount: "+ pageCount);
		
		return "position_change_update";
	}
	
	 
	public String  positionReleaseChange(){ //ְλ�������    ����id ��ѯ�� ������ ����ҳ�� 
		emajorRelease = positionService.selectEmajorReleaseById(emajorRelease.getId());
		return "position_release_change";
	}
	
	public String doPositionReleaseChange() throws ParseException{//ִ�и��ģ� �ɹ� �����������б�ҳ��  �������ҳ��
		request = ServletActionContext.getRequest();
		String changeTime = request.getParameter("emajorRelease.changeTime");
		String deadline = request.getParameter("emajorRelease.deadline");
		System.out.println("changeTime: "+changeTime+ " deadline�� "+deadline);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //�õ������� ��ֵ������ 
		Date cTime = sdf.parse(changeTime);
		  sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dline = sdf.parse(deadline);
		emajorRelease.setChangeTime(cTime);
		emajorRelease.setDeadline(dline);
		System.out.println("==============:  "+emajorRelease);
		positionService.updateEmajorRelease(emajorRelease);
		return positionChangeUpdate();
	}
	
	public String positionChangeDelete(){ // ְλ�������    ����id ɾ��
		Integer id = emajorRelease.getId();
		
		int i = positionService.deleteEmajorReleaseById(id);
		
		return positionChangeUpdate();
	}
	
	
	
	
	
	
//����ְλ������ѯ  ��ҳ�� �������һ�ν�  ���ǵ�һҳ �� һҳ���У�========================================3
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
		//�õ�һ���м�ҳ 
		pageCount=(int) Math.ceil(count/(rows*1.0));
		System.out.println("ҳ������ԣ�  count: "+count + " rows: "+rows + "  pageCount: "+ pageCount);
		
		return "position_release_search";
	}
	/**
	 * ְλ����    ����id ��ѯ�� ������ ����ҳ�� 
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
	 * ��Ҫ  ���͵�json �ַ������͵������ȥ   
	 * @param jsonStr  json �ַ���
	 * @throws IOException  
	 */
	private void sendClient(String jsonStr) throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(jsonStr);
	}

	
}
