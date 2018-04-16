package jing.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jing.dao.DeptDao;
import jing.dao.EmpDao;
import jing.entity.Dept;
import jing.entity.Emp;

/**
 * 公司 service
 * 
 * @author BarryLiu
 */
@Service
public class FirmService {
	@Autowired
	private EmpDao empDao;
	@Autowired
	private DeptDao deptDao;

	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	public DeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	public List<Emp> queryAllEmps() {
		List<Emp> emps = empDao.selectAll();
		return emps;
	}

	public void removeEmp(int empno) {
		empDao.delete(String.valueOf(empno));
	}

	public List<Dept> queryAllDepts() {
		return deptDao.getAll();
	}

	public void addEmp(Emp emp,HttpServletRequest request) throws ParseException {
		String deptno = request.getParameter("deptno");
		Dept dept = deptDao.getById(deptno);
		emp.setDept(dept);
		empDao.save(emp);
	}

	public void modifyEmp(Emp emp) throws ParseException {
		empDao.update(emp);
	}

	public Emp queryEmpByNo(String empno) {
		if(empno==null)
			return null;
		return empDao.getById(empno);
	}

	public Dept queryDeptByNo(String deptno) {
		if(deptno==null)
			return null;
		return deptDao.getById(deptno);
	}

	public void modifyDept(Dept dept) {
		deptDao.update(dept);
	}

	public String removeDept(Integer dno) {
		
		Dept dept = deptDao.getById(dno+"");
		if(dept==null)
			return "没有该部门";
		if(dept.getEmps().size()>0)
			return "删除部门前要先删除部门下的员工";
		deptDao.delete(dept);
		return "删除成功";
	}

	public void addDept(Dept dept) {
//		Dept dept = getDeptForScope(request);
		deptDao.save(dept);
	}

	private Dept getDeptForScope(HttpServletRequest request) {
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		Integer dno=null;
		if(deptno!=null)
			dno=Integer.valueOf(deptno);
		Dept dept =new Dept(dno, dname, loc);
		return dept;
	}

}
