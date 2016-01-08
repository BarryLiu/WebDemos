package test;

import java.util.List;

import hr.entity.HumanFile;
import hr.entity.User;
import hr.entity.UserExample;
import hr.entity.UserExample.Criteria;
import hr.mapperdao.UserMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext cxt = null;

	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");

		// testfindHumanFiles();
		//testLogin();
		testNumber();
		
	}

	private static void testNumber() {
		int rows= 5;
		int count =2;
		
		//int pageCount =  Math(count/(rows*1.0));
		System.out.println(Math.ceil(count/(rows*1.0)));
	}

	private static void testLogin() {

		UserMapper userMapper = (UserMapper) cxt.getBean("userMapper");

		System.out.println("userMapper:  " + userMapper);

		User user = new User();
		user.setUserName("admin");
		user.setUserPassword("123");

		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(user.getUserName());
		criteria.andUserPasswordEqualTo(user.getUserPassword());
		  

		List<User> lists = userMapper.selectByExample(example);

		System.out.println(lists.get(0));
	}

}
