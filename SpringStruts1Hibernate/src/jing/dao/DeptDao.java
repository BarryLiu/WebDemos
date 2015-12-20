package jing.dao;

import java.util.List;

import jing.entity.Dept;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *  查询部门表
 * @author BarryLiu
 */
public class DeptDao extends BaseDao<Dept>{
	
	public DeptDao() {
		super(Dept.class);
	}
	
}
