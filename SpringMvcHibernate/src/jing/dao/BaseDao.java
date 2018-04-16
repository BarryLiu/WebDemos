package jing.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * BaseDao 
 * 实现了Hibernate对entity的简单操作 继承Dao 只需指明操作的类
 * 只支持对单个表的操作
 * @author BarryLiu
 * @param <T>
 */
@Repository
public class BaseDao<T> {
	protected Class<T> objectClass;
	@Autowired
	protected HibernateTemplate template;

	private BaseDao(){}
	public BaseDao(Class objectClass){
		this.objectClass=objectClass;
	}
	
	/**
	 * 查询全部  
	 * @return
	 */
	public List<T> getAll() {
		template.flush();
		template.clear();
		return  template.loadAll(objectClass);
	}

	/**
	 * 根据自定义  “Hql” 语句    方式 来查询  
	 * @param hql   hql  语句
	 * @param pramas   sql 语句中 ？　的值
	 * @return
	 */
	public List<T> getByHql(String hql,String ...pramas ){
		return template.find(hql, pramas);
	}
	/**
	 * 根据自定义 “sql”  语句   方式 来查询     
	 * @param sql  sql 语句
	 * @param pramas   sql 语句中 ？　的值　　
	 * @return　　
	 */
	public List<Object[]> getBySql(String sql,String ... pramas){
		
		Session session = template.getSessionFactory().openSession();
		SQLQuery query = session.createSQLQuery(sql);
		if(pramas!=null){
			for (int i = 0; i < pramas.length; i++) {
				query.setString(i, pramas[i]);
			}
		}
		List<Object[]> list = query.list();
		return list;
	}
	
	/**
	 *   根据id 查询
	 * @param sid 传入 要查询的对象的id
	 * @return  这个对象
	 */
	public T getById(String sid) {
		try{
			int id=Integer.parseInt(sid);
			return (T) template.get(objectClass, id);
		}catch(Exception e){
			return (T) template.get(objectClass, sid);
		}
	}
	/**
	 *  传入对象修改（*对象要有id）   
	 * @param entity  
	 */
	public void update(T entity) {
		template.update(entity);
	}
	/**
	 * 增加 一条记录 （*要有id 值）
	 * @param entity
	 */
	public void save(T entity) {
		template.save(entity);
	}
	/**
	 * 根据id 删除
	 * @param sid
	 */
	public void delete(String sid) {
		T entity = getById(sid);
		template.delete(entity);
	}
	/**
	 * 传入对象删除 
	 * @param entity
	 */
	public void delete(T entity){
		template.delete(entity);
	}
	/**
	 * 得到表记录的条数 	HQL 
	 * @param whereStr  如果有条件的话  传入 where条件 eg： where  ......
	 * @return 
	 */
	public int getTotalCount(String whereStr) {
		if(whereStr==null)
			whereStr="";
		 List<T> list = template.find("from "+objectClass.getSimpleName()+" "+whereStr);
		return list.size();
	}

}