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

		// ����д��ServletContextListener�����ٷ�����
		// factory.close();
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static Session getSession() {
		// ÿ�ε��ö��ᴴ��һ���µ�sessionʵ��
		return factory.openSession();
	}

}
