package test;

import java.sql.Connection;
import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.stat.Statistics;

import jing.entity.Emp;

public class Test {

	// Statement
	// PreparedStatement
	// 后者会把预编译的SQL都存起来，提供给当次Connection的下一个操作使用
	// insert into xxx values(?,?)

	public static void test1() {
		Connection con;
		// con.setReadOnly(true);

		Session session = SessionFactoryUtils.getSession();
		// Transaction tx = session.beginTransaction();
		Emp emp = (Emp) session.get(Emp.class, 7788);
		// session.get(Emp.class, 7369);
		// emp.setEname("SCOTT");

		// tx.commit();
		session.close();
	}

	// 不能保证在缓存之前的数据以后
	// 其他请求没有向这个表添加新的数据
	// select * from emp where empno=2
	public static void test2() {
		Session session = SessionFactoryUtils.getSession();
		Criteria criteria = session.createCriteria(Emp.class);
		criteria.list();
		session.close();
	}

	public static void test3() {
		Session session = SessionFactoryUtils.getSession();
		String hql = "from Emp where empno=7788";
		Query query = session.createQuery(hql);

		query.setCacheable(true);

		query.uniqueResult();
		session.close();
	}
	
	public static void test4() {
		Session session = SessionFactoryUtils.getSession();
		Criteria criteria = session.createCriteria(Emp.class);

		criteria.setCacheable(true);

		criteria.add(Restrictions.idEq(7788));
		criteria.uniqueResult();
		session.close();
	}

	public static void main(String[] args) {
//		test1();
//		test1();
		//SessionFactory factory = SessionFactoryUtils.getSessionFactory();
		//System.out.println(factory);
//		Statistics statistics = factory.getStatistics();
//		System.out.println(statistics);
		Integer.parseInt(null);

	}

}
