package jing.dao;

import java.util.List;

import jing.entity.Dept;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *  ��ѯ���ű�
 * @author BarryLiu
 */
public class DeptDao extends BaseDao<Dept>{
	
	public DeptDao() {
		super(Dept.class);
	}
	
}
