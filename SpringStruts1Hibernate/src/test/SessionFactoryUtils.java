package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtils {

	public static SessionFactory factory;

	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();

		// 可以写在ServletContextListener的销毁方法中
		// factory.close();
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static Session getSession() {
		// 每次调用都会创建一个新的session实例
		return factory.openSession();
	}

}
