package hr.service.power;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import hr.entity.Right;
import hr.entity.SysRole;
import hr.entity.SysRoleExample;
import hr.entity.SysRoleRight;
import hr.entity.SysRoleRightExample;
import hr.entity.User;
import hr.entity.UserExample;
import hr.service.BaseService;
import hr.utils.HrUtils;

public class PowerService extends BaseService{

	public Map<String,Object> selectUsers(Integer page, Integer rows) {
		if( page == null || page <=0)page=1;
		List<User> users = userMapper.selectUser((page - 1) * rows,rows);
		Map<String, Object> data = new HashMap<String, Object>();
		int total = userMapper.countByExample(null);
		data.put("total", total);
		data.put("rows", users);
		return data;
	}

	public void deleteUserById(Integer userId) {
		userMapper.deleteByPrimaryKey(userId);
	}

	public User selectUserById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	public void updateUser(User user) {
		userMapper.updateByPrimaryKey(user);
	}

	public Integer selectUsersCount() {
		return userMapper.countByExample(null);
	}

	public void insertUser(User users) {
		userMapper.insert(users);
	}

	

	
// 角色管理   
	
	
	
	public Integer seleRoleCount() {
		return sysRoleMapper.countByExample(null);
	}

	public Map<String, Object> selectRoles(Integer page, Integer rows) {
//		List<SysRole> roles = sysRoleMapper.selectByExample(null);
		if( page == null || page <=0)page=1;
		List<SysRole> roles = sysRoleMapper.selectRole((page - 1) * rows,rows);
		Map<String, Object> data = new HashMap<String, Object>();
		int total = userMapper.countByExample(null);
		data.put("total", total);
		data.put("rows", roles);
		return data;
	}

	public void deleteRoleById(Integer roleId) {
		sysRoleMapper.deleteByPrimaryKey(roleId);
	}

	public SysRole selectRoleById(Integer roleId) {
		return sysRoleMapper.selectByPrimaryKey(roleId);
	}

	public void insertSysRole(SysRole sysRole) {
		sysRoleMapper.insert(sysRole);
	}

	public void updateSysRole(SysRole sysRole) {
		sysRoleMapper.updateByPrimaryKey(sysRole);
	}
	/**查询所有可用的 角色*/
	public List<SysRole> selectTrueRoles() {
		SysRoleExample example = new SysRoleExample();
		example.createCriteria().andRoleFlagEqualTo(1);
		return sysRoleMapper.selectByExample(example);
	}

	public String testName(String userName) {
		 UserExample example =new UserExample();
		 example.createCriteria().andUserNameEqualTo(userName);
		List<User> users = userMapper.selectByExample(example);
		
		if(users.size()==0)
			return null;
		
		return "fall";
	}

	public List<Right> selectRitghts() {
		return rightMapper.selectByExample(null);
	}

	public List<Right> selectRightForRole(Integer rid) {
		return rightMapper.selectRightForRoleId(rid);
	}

	 
	/**根据角色的id 删除所有与 权限表的关系*/
	public void deleteSysRoleRights(int rid) {
		SysRoleRightExample example =new SysRoleRightExample();
		example.createCriteria().andRoleIdEqualTo(rid);
		sysRoleRightMapper.deleteByExample(example);
	}
	/**添加当前角色的权限*/
	public void insertSysRoleRights(int rid) {
		HrUtils.showParams();
		HttpServletRequest request = ServletActionContext.getRequest();
		String[] rightCodes = request.getParameterValues("rightCodes");
		System.out.println(rightCodes);
		
		if(rightCodes!=null){
			SysRoleRight roleRight =null;
			for (String rightId : rightCodes) {
				roleRight = new SysRoleRight(rid,Integer.valueOf(rightId));
				sysRoleRightMapper.insert(roleRight);
			}
		}
	}

	
	
}
