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

	// 查询所有一级菜单
	public String findFirsts() {
		// 查询一级分类种类
		firsts = clientService.selectAllFirsts();
		return "first_kind";
	}

	// 根据ID删除一级菜单
	public String deleteFirst() {
		clientService.deleteFirst(id);
		return "first_delete_success";
	}

	// 添加一级菜单
	public String insertFirst() {
		clientService.insertFirst(first);
		return "first_kind_register_success";
	}

	// 根绝ID查找一级菜单
	public String findFirstById() {
		first = clientService.findFirstById(id);
		return "first_kind_change";
	}

	// 根据id修改一级菜单
	public String updateFirst() {
		clientService.updateFirst(first);
		return "first_kind_change_success";
	}

	// 查询所有二级菜单
	public String findSeconds() {
		seconds = clientService.selectAllSeconds();
		return "second_kind";
	}

	// 根据ID删除二级菜单
	public String deleteSecond() {
		clientService.deleteSecond(id);
		return "second_delete_success";
	}

	// 添加二级菜单
	public String insertSecond() {
		clientService.insertSecond(second);
		return "second_kind_register_success";
	}

	// 根绝ID查找二级菜单
	public String findSecondById() {
		second = clientService.findSecondById(id);
		return "second_kind_change";
	}

	// 根据id修二级菜单
	public String updateSecond() {
		clientService.updateSecond(second);
		return "second_kind_change_success";
	}

	// 查询一级菜单跳转到二级添加页面
	public String findFirsts2() {
		firsts = clientService.selectAllFirsts();
		return "second_kind_register";
	}

	// 查询所有三级菜单
	public String findThirds() {
		thirds = clientService.selectAllThirds();
		return "third_kind";
	}

	// 根据ID删除三级菜单
	public String deleteThird() {
		clientService.deleteThird(id);
		return "third_delete_success";
	}

	// 查询一级菜单跳转到三级添加页面
	public String findFirsts3() {
		firsts = clientService.selectAllFirsts();
		return "third_kind_register";
	}

	// 根据一级ID查询二级菜单
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

	// 添加三级菜单
	public String insertThird() {
		clientService.insertThird(third);
		return "third_kind_register_success";
	}

	// 根绝ID查找三级菜单
	public String findThirdById() {
		third = clientService.findThirdById(id);
		return "third_kind_change";
	}

	// 根据id修二级菜单
	public String updateThird() {
		clientService.updateThird(third);
		return "third_kind_change_success";
	}

	// 查找所有职位分类
	public String findMajorKinds() {
		majorKinds = clientService.selectAllMajorKinds();
		return "major_kind";
	}

	// 根据ID删除职位分类
	public String deleteMajorKind() {
		clientService.deleteMajorKind(id);
		String findMajorKinds = findMajorKinds();
		return findMajorKinds;
	}

	// 添加职位分类
	public String insertMajorKind() {
		clientService.insertMajorKind(majorkind);
		String findMajorKinds = findMajorKinds();
		return findMajorKinds;
	}

	// 查询所有职位
	public String findMajors() {
		majors = clientService.selectAllMajors();
		return "major";
	}

	// 根据ID删除职位
	public String deleteMajor() {
		clientService.deleteMajor(id);
		String findMajors = findMajors();
		return findMajors;
	}

	// 查找所有职位分类2
	public String findMajorKinds1() {
		majorKinds = clientService.selectAllMajorKinds();
		return "major_add";
	}

	// 添加新的职位
	public String insertMajor() {
		clientService.insertMajor(major);
		String findMajors = findMajors();
		return findMajors;
	}
	
	//查找所有公共字段
	public String findPbcs(){
		pbcs=clientService.selectAllPbcs();
		return "public_char";
	}
	
	//根据ID删除公共字段
	public String deletePbc(){
		clientService.deletePbc(id);
		return findPbcs();
	}
	
	//添加公共字段
	public String insertPbc(){
		clientService.insertPbc(pbc);
		return findPbcs();
	}
	
	//查询所有薪酬项目
	public String findSsds(){
		ssds=clientService.selectAllSsds();
		return "salary_item";
	}

	//根据ID删除薪酬项目
	public String deleteSsd(){
		clientService.deleteSsd(id);
		return findSsds();
	}
	
	//添加薪酬项目
	public String insertSsd(){
		clientService.insertSsd(ssd);
		return findSsds();
	}
	
	//查找所有职称
	public String findPbcs1(){
		pbcs =clientService.selectPbcs2();
		return "profession_design";
	}
	//根据ID删除职称
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
	//查询数据库中的所有表
	public String findAllTables(){
		tables=clientService.selectAllTables();
		return "primary_key";
	}
	
	//根据选中的表名查询所有列明
	public String findColumens(){
		datas=clientService.selectColumens(tableName);
		return "primary_key_register"; 
	}
	
	//添加关键字
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
