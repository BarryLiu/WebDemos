package hr.action.power;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;

import hr.entity.Right;
import hr.entity.SysRole;
import hr.entity.User;
import hr.service.power.PowerService;
import hr.utils.HrUtils;

public class PowerAction {
	private PowerService powerService;

	private Integer page;
	private Integer rows;
	private User users;
	private SysRole sysRole;
	
	private List<User> userList;
	private List<SysRole> roles;
	private List<Right> rights;
	private Integer count;
//  �����û����� =======================1
	public String userList(){
		count = powerService.selectUsersCount();
		return "user_list";
	}
	public String loadList() throws IOException{ // aJax ���س� �û�������
		Map<String,Object> data = powerService.selectUsers(page,rows);
		String jsonStr = new Gson().toJson(data);
		System.out.println(jsonStr);
		HrUtils.sendClient(jsonStr);
		return null;
	}
	
	public String userDelet(){// ɾ���û�
		powerService.deleteUserById(users.getId());
		return userList();
	}
	public String userSelectOne(){ // �༭�û�ǰ ����id ��ѯ����
		users = powerService.selectUserById(users.getId());
		roles = powerService.selectTrueRoles();
		return "user_edit";
	}
	public String doUserEdit(){  // �༭�û�
		System.out.println(users);
		
		powerService.updateUser(users);
		return "success";
	}
	public String toUserAdd(){  //��������û�����
		roles = powerService.selectTrueRoles();
		return "user_add";
	}
	public String testName() throws IOException{ // aJax ����׼�����������˺ſ��ã� 
		
		String str= powerService.testName(users.getUserName());
		ServletActionContext.getResponse().getWriter().print(str);
		return null;
	}
	public String userAdd(){// ����û�
		System.out.println(users);
		powerService.insertUser(users);
		return "success";
	}
	
	
	
	
	
	
	
	
// ��ɫ���� ===========================================2
	
	public String roleList(){
		count = powerService.seleRoleCount();
		return "right_list";
	}
	public String loadListRole() throws IOException{ // ajAx �õ����� ��ɫ����
		
		Map<String,Object> data = powerService.selectRoles(page,rows);
		String jsonStr = new Gson().toJson(data);
		System.out.println(jsonStr);
		HrUtils.sendClient(jsonStr);
		
		return null;
	}
	
	public String roleDelete(){ // ɾ����ɫ 
		powerService.deleteRoleById(sysRole.getId());
		return "success";
	}
	public String toRoleEdit(){// ���� �޸Ľ�ɫ��ҳ��ȥ
		sysRole = powerService.selectRoleById(sysRole.getId()); 
		rights = powerService.selectRitghts();
		
		List<Right> roleRights=powerService.selectRightForRole(sysRole.getId());
		sysRole.setRights(roleRights);
		return "right_list_information";
	}
	
	public String doRoleEdit(){	 // ִ���޸Ľ�ɫ       1�� �޸������ɫ role��  2���޸� �����ɫ�Ŀ���Ȩ�� ��role.rights     
		System.out.println(sysRole);	//1
		powerService.updateSysRole(sysRole);
		
		// 2
		powerService.deleteSysRoleRights(sysRole.getId()); //�޸ĵ�ǰ��ɫǰ�Ƚ����е����
		powerService.insertSysRoleRights(sysRole.getId());	//��ӵ�ǰ��ɫ��Ȩ��
		
		return "success";
	}
	
	
	public String roleAdd(){ // ��ӽ�ɫ
		System.out.println(sysRole);
		
		powerService.insertSysRole(sysRole);
		
		return "success";
	}
	
	
	
	
	
	
	
	
	public void setPowerService(PowerService powerService) {
		this.powerService = powerService;
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
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public SysRole getSysRole() {
		return sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public List<SysRole> getRoles() {
		return roles;
	}
	public void setRoles(List<SysRole> roles) {
		this.roles = roles;
	}
	public List<Right> getRights() {
		return rights;
	}
	public void setRights(List<Right> rights) {
		this.rights = rights;
	}
	
	
}
