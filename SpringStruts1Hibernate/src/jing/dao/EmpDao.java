package jing.dao;

import java.util.List;

import jing.entity.Emp;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmpDao extends BaseDao<Emp>{
	public EmpDao() {
		super(Emp.class);
	}
	@SuppressWarnings("unchecked")
	public List<Emp> selectAll() {
		return template.findByCriteria(DetachedCriteria.forClass(Emp.class));
	}
 
	
	
}
