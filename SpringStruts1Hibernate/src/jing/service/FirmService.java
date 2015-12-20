package jing.service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jing.dao.DeptDao;
import jing.dao.EmpDao;
import jing.entity.Dept;
import jing.entity.Emp;

/**
 * ¹«Ë¾service
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

	public void addEmp(HttpServletRequest request) {
		Emp emp = getEmpForScope(request);
		empDao.save(emp);
	}

	private Emp getEmpForScope(HttpServletRequest request) {
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String mgr = request.getParameter("mgr");
		String hiredate = request.getParameter("hiredate");
		String sal = request.getParameter("sal");
		String comm = request.getParameter("comm");
		String deptno = request.getParameter("deptno");

		Emp emp = new Emp(null, ename, job, Integer.valueOf(mgr), new Date(
				hiredate), Float.valueOf(sal), Float.valueOf(comm));
		if (empno != null && !"".equals(empno))
			emp.setEmpno(Integer.valueOf(empno));
		if (deptno != null && !"".equals(deptno)) {
			Dept dept = deptDao.getById(deptno);
			emp.setDept(dept);
		}
		return emp;
	}

	public void modifyEmp(HttpServletRequest request) {
		Emp emp = getEmpForScope(request);
		empDao.update(emp);
	}

}
