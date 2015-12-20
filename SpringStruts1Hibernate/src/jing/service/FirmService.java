package jing.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;

import jing.dao.DeptDao;
import jing.dao.EmpDao;
import jing.entity.Dept;
import jing.entity.Emp;
import jing.form.FirmForm;

/**
 * 公司 service
 * 
 * @author BarryLiu
 */
public class FirmService {
	private EmpDao empDao;
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

	public void addEmp(HttpServletRequest request,FirmForm firm) throws ParseException {
		System.out.println("firm:"+firm);
		
		Date date=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate"));
		firm.getEmp().setHiredate(date);
		//Emp emp = getEmpForScope(request);
		empDao.save(firm.getEmp());
	}

	private Emp getEmpForScope(HttpServletRequest request) throws ParseException {
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String mgr = request.getParameter("mgr");
		String hiredate = request.getParameter("hiredate");
		String sal = request.getParameter("sal");
		String comm = request.getParameter("comm");
		String deptno = request.getParameter("deptno");
		
		Date date=new SimpleDateFormat("yyyy-MM-dd").parse(hiredate);
		Emp emp = new Emp(null, ename, job, Integer.valueOf(mgr), date, Float.valueOf(sal), Float.valueOf(comm));
		if (empno != null && !"".equals(empno))
			emp.setEmpno(Integer.valueOf(empno));
		if (deptno != null && !"".equals(deptno)) {
			Dept dept = deptDao.getById(deptno);
			emp.setDept(dept);
		}
		return emp;
	}

	public void modifyEmp(HttpServletRequest request) throws ParseException {
		Emp emp = getEmpForScope(request);
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

	public void modifyDept(HttpServletRequest request) {
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		Dept dept =new Dept(Integer.valueOf(deptno), dname, loc);
		deptDao.update(dept);
	}

	public String removeDept(HttpServletRequest request) {
		String deptno = request.getParameter("deptno");
		
		Dept dept = deptDao.getById(deptno);
		if(dept==null)
			return "没有该部门";
		if(dept.getEmps().size()>0)
			return "删除部门前要先删除部门下的员工";
		deptDao.delete(dept);
		return "删除成功";
	}

	public void addDept(HttpServletRequest request) {
		Dept dept = getDeptForScope(request);
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
