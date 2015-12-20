package jing.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class BaseDao<T> {
	protected Class<T> objectClass;
	protected HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	private BaseDao(){}
	public BaseDao(Class objectClass){
		this.objectClass=objectClass;
	}
	
	/**
	 * ��ѯȫ��  
	 * @return
	 */
	public List<T> getAll() {
		template.flush();
		template.clear();
		return  template.loadAll(objectClass);
	}

	/**
	 * �����Զ���  ��Hql�� ���    ��ʽ ����ѯ  
	 * @param hql   hql  ���
	 * @param pramas   sql ����� ������ֵ
	 * @return
	 */
	public List<T> getByHql(String hql,String ...pramas ){
		return template.find(hql, pramas);
	}
	/**
	 * �����Զ��� ��sql��  ���   ��ʽ ����ѯ     
	 * @param sql  sql ���
	 * @param pramas   sql ����� ������ֵ����
	 * @return����
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
	 *   ����id ��ѯ
	 * @param sid ���� Ҫ��ѯ�Ķ����id
	 * @return  �������
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
	 *  ��������޸ģ�*����Ҫ��id��   
	 * @param entity  
	 */
	public void update(T entity) {
		template.update(entity);
	}
	/**
	 * ���� һ����¼ ��*Ҫ��id ֵ��
	 * @param entity
	 */
	public void save(T entity) {
		template.save(entity);
	}
	/**
	 * ����id ɾ��
	 * @param sid
	 */
	public void delete(String sid) {
		T entity = getById(sid);
		template.delete(entity);
	}
	/**
	 * �������ɾ�� 
	 * @param entity
	 */
	public void delete(T entity){
		template.delete(entity);
	}
	/**
	 * �õ����¼������ 	HQL 
	 * @param whereStr  ����������Ļ�  ���� where���� eg�� where  ......
	 * @return 
	 */
	public int getTotalCount(String whereStr) {
		if(whereStr==null)
			whereStr="";
		 List<T> list = template.find("from "+objectClass.getSimpleName()+" "+whereStr);
		return list.size();
	}

}