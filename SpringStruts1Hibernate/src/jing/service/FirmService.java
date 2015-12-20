package jing.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jing.dao.DeptDao;
import jing.dao.EmpDao;
import jing.entity.Dept;
import jing.entity.Emp;

/**
 * ��˾service
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

	public void addEmp(HttpServletRequest request) throws ParseException {
		Emp emp = getEmpForScope(request);
		empDao.save(emp);
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

}
