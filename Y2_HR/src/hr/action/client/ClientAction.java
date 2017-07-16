package hr.action.client;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.ConfigPrimaryKey;
import hr.entity.ConfigPublicChar;
import hr.entity.SalaryStandardDetails;
import hr.service.client.ClientService;
import hr.entity.Data;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;

public class ClientAction {

	private ClientService clientService;

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
	private List<ConfigFileFirstKind> firsts;
	private ConfigFileFirstKind first;
	private Integer id;
	private List<ConfigFileSecondKind> seconds;
	private ConfigFileSecondKind second;
	private List<ConfigFileThirdKind> thirds;
	private ConfigFileThirdKind third;
	private List<ConfigMajorKind> majorKinds;
	private ConfigMajorKind majorkind;
	private List<ConfigMajor> majors;
	private ConfigMajor major;
	private List<ConfigPublicChar> pbcs;
	private ConfigPublicChar pbc;
	private List<SalaryStandardDetails> ssds;
	private SalaryStandardDetails ssd;
	private List<Object> tables;
	private List<Data> datas;
	private String tableName;
	private String[] columnName;
	private String[] columnComment;
	public Logger log;

	public String[] getColumnName() {
		return columnName;
	}

	public void setColumnName(String[] columnName) {
		this.columnName = columnName;
	}

	public String[] getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String[] columnComment) {
		this.columnComment = columnComment;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Object> getTables() {
		return tables;
	}

	public List<Data> getDatas() {
		return datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;
	}

	public void setTables(List<Object> tables) {
		this.tables = tables;
	}

	public List<SalaryStandardDetails> getSsds() {
		return ssds;
	}

	public void setSsds(List<SalaryStandardDetails> ssds) {
		this.ssds = ssds;
	}

	public SalaryStandardDetails getSsd() {
		return ssd;
	}

	public void setSsd(SalaryStandardDetails ssd) {
		this.ssd = ssd;
	}

	public List<ConfigPublicChar> getPbcs() {
		return pbcs;
	}

	public void setPbcs(List<ConfigPublicChar> pbcs) {
		this.pbcs = pbcs;
	}

	public ConfigPublicChar getPbc() {
		return pbc;
	}

	public void setPbc(ConfigPublicChar pbc) {
		this.pbc = pbc;
	}

	public List<ConfigMajor> getMajors() {
		return majors;
	}

	public void setMajors(List<ConfigMajor> majors) {
		this.majors = majors;
	}

	public ConfigMajor getMajor() {
		return major;
	}

	public void setMajor(ConfigMajor major) {
		this.major = major;
	}

	public List<ConfigMajorKind> getMajorKinds() {
		return majorKinds;
	}

	public void setMajorKinds(List<ConfigMajorKind> majorKinds) {
		this.majorKinds = majorKinds;
	}

	public ConfigMajorKind getMajorkind() {
		return majorkind;
	}

	public void setMajorkind(ConfigMajorKind majorkind) {
		this.majorkind = majorkind;
	}

	public List<ConfigFileThirdKind> getThirds() {
		return thirds;
	}

	public void setThirds(List<ConfigFileThirdKind> thirds) {
		this.thirds = thirds;
	}

	public ConfigFileThirdKind getThird() {
		return third;
	}

	public void setThird(ConfigFileThirdKind third) {
		this.third = third;
	}

	public Logger getLog() {
		return log;
	}

	public void setLog(Logger log) {
		this.log = log;
	}

	public List<ConfigFileSecondKind> getSeconds() {
		return seconds;
	}

	public void setSeconds(List<ConfigFileSecondKind> seconds) {
		this.seconds = seconds;
	}

	public ConfigFileSecondKind getSecond() {
		return second;
	}

	public void setSecond(ConfigFileSecondKind second) {
		this.second = second;
	}

	public ConfigFileFirstKind getFirst() {
		return first;
	}

	public void setFirst(ConfigFileFirstKind first) {
		this.first = first;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<ConfigFileFirstKind> getFirsts() {
		return firsts;
	}

	public void setFirsts(List<ConfigFileFirstKind> firsts) {
		this.firsts = firsts;
	}

	// ��ѯ����һ���˵�
	public String findFirsts() {
		// ��ѯһ����������
		firsts = clientService.selectAllFirsts();
		return "first_kind";
	}

	// ����IDɾ��һ���˵�
	public String deleteFirst() {
		clientService.deleteFirst(id);
		return "first_delete_success";
	}

	// ���һ���˵�
	public String insertFirst() {
		clientService.insertFirst(first);
		return "first_kind_register_success";
	}

	// ����ID����һ���˵�
	public String findFirstById() {
		first = clientService.findFirstById(id);
		return "first_kind_change";
	}

	// ����id�޸�һ���˵�
	public String updateFirst() {
		clientService.updateFirst(first);
		return "first_kind_change_success";
	}

	// ��ѯ���ж����˵�
	public String findSeconds() {
		seconds = clientService.selectAllSeconds();
		return "second_kind";
	}

	// ����IDɾ�������˵�
	public String deleteSecond() {
		clientService.deleteSecond(id);
		return "second_delete_success";
	}

	// ��Ӷ����˵�
	public String insertSecond() {
		clientService.insertSecond(second);
		return "second_kind_register_success";
	}

	// ����ID���Ҷ����˵�
	public String findSecondById() {
		second = clientService.findSecondById(id);
		return "second_kind_change";
	}

	// ����id�޶����˵�
	public String updateSecond() {
		clientService.updateSecond(second);
		return "second_kind_change_success";
	}

	// ��ѯһ���˵���ת���������ҳ��
	public String findFirsts2() {
		firsts = clientService.selectAllFirsts();
		return "second_kind_register";
	}

	// ��ѯ���������˵�
	public String findThirds() {
		thirds = clientService.selectAllThirds();
		return "third_kind";
	}

	// ����IDɾ�������˵�
	public String deleteThird() {
		clientService.deleteThird(id);
		return "third_delete_success";
	}

	// ��ѯһ���˵���ת���������ҳ��
	public String findFirsts3() {
		firsts = clientService.selectAllFirsts();
		return "third_kind_register";
	}

	// ����һ��ID��ѯ�����˵�
	public String findSeconds2() throws IOException {
		String firstKindId = first.getFirstKindId();
		Integer fkId = Integer.valueOf(firstKindId);
		if (fkId != 0) {
			seconds = clientService.selectSecondsByFirstId(fkId);
		} else {
			seconds = clientService.selectAllSeconds();
		}
		System.out.println(seconds);
		String jsonStr = new Gson().toJson(seconds);
		sendClient(jsonStr);
		return null;
	}

	// ��������˵�
	public String insertThird() {
		clientService.insertThird(third);
		return "third_kind_register_success";
	}

	// ����ID���������˵�
	public String findThirdById() {
		third = clientService.findThirdById(id);
		return "third_kind_change";
	}

	// ����id�޶����˵�
	public String updateThird() {
		clientService.updateThird(third);
		return "third_kind_change_success";
	}

	// ��������ְλ����
	public String findMajorKinds() {
		majorKinds = clientService.selectAllMajorKinds();
		return "major_kind";
	}

	// ����IDɾ��ְλ����
	public String deleteMajorKind() {
		clientService.deleteMajorKind(id);
		String findMajorKinds = findMajorKinds();
		return findMajorKinds;
	}

	// ���ְλ����
	public String insertMajorKind() {
		clientService.insertMajorKind(majorkind);
		String findMajorKinds = findMajorKinds();
		return findMajorKinds;
	}

	// ��ѯ����ְλ
	public String findMajors() {
		majors = clientService.selectAllMajors();
		return "major";
	}

	// ����IDɾ��ְλ
	public String deleteMajor() {
		clientService.deleteMajor(id);
		String findMajors = findMajors();
		return findMajors;
	}

	// ��������ְλ����2
	public String findMajorKinds1() {
		majorKinds = clientService.selectAllMajorKinds();
		return "major_add";
	}

	// ����µ�ְλ
	public String insertMajor() {
		clientService.insertMajor(major);
		String findMajors = findMajors();
		return findMajors;
	}
	
	//�������й����ֶ�
	public String findPbcs(){
		pbcs=clientService.selectAllPbcs();
		return "public_char";
	}
	
	//����IDɾ�������ֶ�
	public String deletePbc(){
		clientService.deletePbc(id);
		return findPbcs();
	}
	
	//��ӹ����ֶ�
	public String insertPbc(){
		clientService.insertPbc(pbc);
		return findPbcs();
	}
	
	//��ѯ����н����Ŀ
	public String findSsds(){
		ssds=clientService.selectAllSsds();
		return "salary_item";
	}

	//����IDɾ��н����Ŀ
	public String deleteSsd(){
		clientService.deleteSsd(id);
		return findSsds();
	}
	
	//���н����Ŀ
	public String insertSsd(){
		clientService.insertSsd(ssd);
		return findSsds();
	}
	
	//��������ְ��
	public String findPbcs1(){
		pbcs =clientService.selectPbcs2();
		return "profession_design";
	}
	//����IDɾ��ְ��
	public String deletePbc1(){
		clientService.deletePbc(id);
		return findPbcs1();
	}
	private void sendClient(String jsonStr) throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(jsonStr);
	}
	//��ѯ���ݿ��е����б�
	public String findAllTables(){
		tables=clientService.selectAllTables();
		return "primary_key";
	}
	
	//����ѡ�еı�����ѯ��������
	public String findColumens(){
		datas=clientService.selectColumens(tableName);
		return "primary_key_register"; 
	}
	
	//��ӹؼ���
	public String insertColumens(){
		System.out.println(columnName.length);
		for(int i=0;i<columnName.length;i++){
			ConfigPrimaryKey  cpk=clientService.selectBycolumnName(columnName[i]);
			ConfigPrimaryKey cpk2=new ConfigPrimaryKey();
			cpk2.setKeyName(columnComment[i]);
			cpk2.setPrimaryKey(columnName[i]);
			cpk2.setPrimaryKeyStatus(1);
			cpk2.setPrimaryKeyTable(tableName);
			if(cpk==null){
				 clientService.insertCpk(cpk2);
			}else{
				if(cpk.getPrimaryKeyStatus()==2){
					clientService.insertCpk(cpk2);
				}else{
					continue;
				}
			}
			
		}
		return findAllTables();
	}

	public String updatePbc(){
		pbc.setId(9);
		clientService.updatePbc(pbc);
		return "salary_grant_mode_success";
	}
	
	
	
}
