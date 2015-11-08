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
//  进入用户管理 =======================1
	public String userList(){
		count = powerService.selectUsersCount();
		return "user_list";
	}
	public String loadList() throws IOException{ // aJax 加载出 用户的数据
		Map<String,Object> data = powerService.selectUsers(page,rows);
		String jsonStr = new Gson().toJson(data);
		System.out.println(jsonStr);
		HrUtils.sendClient(jsonStr);
		return null;
	}
	
	public String userDelet(){// 删除用户
		powerService.deleteUserById(users.getId());
		return userList();
	}
	public String userSelectOne(){ // 编辑用户前 根据id 查询出来
		users = powerService.selectUserById(users.getId());
		roles = powerService.selectTrueRoles();
		return "user_edit";
	}
	public String doUserEdit(){  // 编辑用户
		System.out.println(users);
		
		powerService.updateUser(users);
		return "success";
	}
	public String toUserAdd(){  //跳到添加用户界面
		roles = powerService.selectTrueRoles();
		return "user_add";
	}
	public String testName() throws IOException{ // aJax 测试准备插入数据账号可用？ 
		
		String str= powerService.testName(users.getUserName());
		ServletActionContext.getResponse().getWriter().print(str);
		return null;
	}
	public String userAdd(){// 添加用户
		System.out.println(users);
		powerService.insertUser(users);
		return "success";
	}
	
	
	
	
	
	
	
	
// 角色管理 ===========================================2
	
	public String roleList(){
		count = powerService.seleRoleCount();
		return "right_list";
	}
	public String loadListRole() throws IOException{ // ajAx 得到所有 角色数据
		
		Map<String,Object> data = powerService.selectRoles(page,rows);
		String jsonStr = new Gson().toJson(data);
		System.out.println(jsonStr);
		HrUtils.sendClient(jsonStr);
		
		return null;
	}
	
	public String roleDelete(){ // 删除角色 
		powerService.deleteRoleById(sysRole.getId());
		return "success";
	}
	public String toRoleEdit(){// 跳到 修改角色的页面去
		sysRole = powerService.selectRoleById(sysRole.getId()); 
		rights = powerService.selectRitghts();
		
		List<Right> roleRights=powerService.selectRightForRole(sysRole.getId());
		sysRole.setRights(roleRights);
		return "right_list_information";
	}
	
	public String doRoleEdit(){	 // 执行修改角色       1。 修改这个角色 role，  2。修改 这个角色的可用权限 ，role.rights     
		System.out.println(sysRole);	//1
		powerService.updateSysRole(sysRole);
		
		// 2
		powerService.deleteSysRoleRights(sysRole.getId()); //修改当前角色前先将所有的清空
		powerService.insertSysRoleRights(sysRole.getId());	//添加当前角色的权限
		
		return "success";
	}
	
	
	public String roleAdd(){ // 添加角色
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
