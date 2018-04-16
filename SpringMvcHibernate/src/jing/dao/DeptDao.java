package jing.dao;

import java.util.List;

import jing.entity.Dept;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *   查询部门表
 * @author BarryLiu
 */
@Repository
public class DeptDao extends BaseDao<Dept>{
	
	public DeptDao() {
		super(Dept.class);
	}
	
}
