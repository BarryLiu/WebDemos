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
	
	
	
//���� ���Խ���Ǽ� ɸѡҳ�� 
	public String interviewResume(){
		System.out.println("������interview-list");
		return "interview-list";
	}
	// ���� ���Խ���Ǽ�ҳ��
	public String interviewList(){
		System.out.println("������InterViewAction    "+interViewService);
		majorKinds = positionService.selectMajorKinds();
		return "interview-resume";
	}
	
	//ajAx �첽���س�     �����Խ���Ǽ�ҳ�桱 ������
	public String loadList() throws IOException{
		
		System.out.println(engageResume);
		System.out.println(utilBean);
	 	Map<String, Object> data = interViewService.selectResumeList(engageResume,utilBean,
				page, rows);
		String jsonStr = new Gson().toJson(data);
		HrUtils.sendClient(jsonStr);
		return null;
	}
	// ����Ǽ�ҳ�� �� ����Ҫ�����ݸ���id ��ѯ���� 
	public String interviewRegister(){
		engageResume = interViewService.selectResumeById(engageResume.getId());
//		int count = interViewService.selectAmountCount(engageResume.getId());// �õ����� ����   ��û��һ�����ݼ�һ�����ݵķ�����
		engageInterview = interViewService.selectInterViewOne(engageResume.getId());
		int count=0;
		if(engageInterview != null){
			count = engageInterview.getInterviewAmount();//����������� �� ֻ�ı����� �ڼ����������ԣ�
		}else{
			engageInterview =new EngageInterview();
		}
		engageInterview.setInterviewAmount(++count);// ���ϱ��ε����Դ���
		System.out.println("���Դ��� �� count:  "+count);
		
		
		System.out.println(engageResume);
		
		
		return "interview-register";
	}
	// �Ǽ����� 
	public String toList() throws IOException{
		// �Ǽ���ɣ� ���� ����Ϊ�ѵǼ�
		interViewService.toDengJiResume(engageResume.getId());
		
		
		engageInterview.setInterviewStatus(1);// ������ɡ�
		System.out.println(engageInterview);
		if(engageInterview.getId()==null|| "".equals(engageInterview.getId())){
			interViewService.insertInterView(engageInterview);
		}else{
			interViewService.updateInterView(engageInterview);
		}
		return interviewList();
	}
	
	
	
//------------------------------����ɸѡ
	public String siftList(){
		System.out.println("��������ɸѡ����");
		return "sift-list";
	}
	
	
	//ajAx �첽���س�     �����Խ���Ǽ�ҳ�桱 ������
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
		
		
	public String interviewSift(){  // ����������ѡ
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
		if("��������".equals(checkcomment)){
			System.out.println("��������");
			interViewService.addviceInterView(rid,iid);
			
		}else if("�������".equals(checkcomment)){
			System.out.println("�������");
			System.out.println("û�б���ģ��");
			
		}else if("����¼��".equals(checkcomment)){
			System.out.println("����¼��");
			interViewService.adviceLuYong(rid,iid);
			
		}else if("ɾ������".equals(checkcomment)){
			System.out.println("�������");
			interViewService.adviceDeleteResumeAndInterView(rid,iid);
			
		}
		
		
		return siftList();//�ύ�ɹ��� ���������б���ҳ��
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
