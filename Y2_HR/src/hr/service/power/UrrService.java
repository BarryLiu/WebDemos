package hr.service.power;

import hr.dto.Node;
import hr.entity.Right;
import hr.entity.SysRole;
import hr.entity.User;
import hr.entity.UserExample;
import hr.entity.UserExample.Criteria;
import hr.service.BaseService;
import hr.utils.HrUtils;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

public class UrrService extends BaseService{

	/**
	 * ��½����� ��ߵ�����  (ȫ������)
	 * @param id 
	 * @return
	 */
	public List<Node> initMenu(Integer id) {
		List<Right> rights = rightMapper.selectChilds(id);
		List<Node> nodes = HrUtils.ConvertChildren(rights);
		return nodes;
	}
	
	/**
	 * ��½����� ��ߵ�����  �����ݵ�ǰ��¼���û�����)
	 * @param id 
	 * @return
	 */
	public List<Node> selectCurrUserRight(int id) {

		User currUser = (User) ServletActionContext.getRequest().getSession().getAttribute("currUser");
		if(currUser==null) return null;
		SysRole role = currUser.getSysRole();
		List<Right> rights = role.getRights();
		List<Right> currRights = new ArrayList<Right>();
		for (Right right : rights) {
			if(Integer.valueOf(right.getParentId())==id){
				currRights.add(right);
			}
		}
		List<Node> nodes = HrUtils.ConvertChildren(currRights);
		return nodes;
	}
	

	/**
	 * ��½  �����½�ɹ��ͷ��� success  ʧ�ܼ�����  fail 
	 * @param user
	 * @return
	 */
	public String login(User user) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(user.getUserName()).andUserPasswordEqualTo(
				user.getUserPassword());

		List<User> users = userMapper.selectByExample(example);
		
		String jsonStr= null;
		if(users.size()>=1){ 	// ��½�ɹ��� �� ��role ����Լ���ɫ��Ȩ�޲�ѯ����
			jsonStr = "success";
			User currUser = users.get(0);
			if(currUser.getUserRoleId() != null && currUser.getUserRoleId()!=0 ){
				SysRole role = sysRoleMapper.selectByPrimaryKey(currUser.getUserRoleId());
				List<Right> rights = rightMapper.selectRightForRoleId(role.getId());
				role.setRights(rights);
				currUser.setSysRole(role);
				ServletActionContext.getRequest().getSession().setAttribute("currUser", currUser);
			}else{
				jsonStr="noRight";
			}
		}else{
			jsonStr="fail";
		}
		return jsonStr;
	}

	
}
