package test.power;

import java.util.List;

import hr.entity.Right;
import hr.entity.SysRole;
import hr.mapperdao.RightMapper;
import hr.mapperdao.SysRoleMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext cxt = null;

	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		
		
		//testRolesRight();
		testselectRightForRoleId();
	}

	private static void testselectRightForRoleId() {
		RightMapper mapper = (RightMapper) cxt.getBean("rightMapper");
		
		System.out.println(mapper);
		List<Right> rights = mapper.selectRightForRoleId(1);
		
		for (Right right : rights) {
			System.out.println(right);
		}
		
	}

	private static void testRolesRight() {
		SysRoleMapper mapper = (SysRoleMapper) cxt.getBean("sysRoleMapper");
		System.out.println(mapper);
//		List<SysRole>roles = mapper.selectRoleRight(1);
//		System.out.println(roles.size());
//		SysRole role = roles.get(0);
//		for (Right r : role.getRights()) {
//			System.out.println(r);
//		}
	}
}
