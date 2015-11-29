package jing.dao;

import java.util.List;

import jing.entity.Dept;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class DeptDao {

	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@SuppressWarnings("unchecked")
	public List<Dept> findAll() {
		// session.createCriteria(Dept.class);
		// 离线条件对象
		DetachedCriteria criteria = DetachedCriteria.forClass(Dept.class);
		return template.findByCriteria(criteria);
	}

	public void update(Dept dept) {
		template.update(dept);
	}

}
