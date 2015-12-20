package jing.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jing.entity.Dept;
import jing.entity.Emp;
import jing.service.FirmService;

/**
 * 公司 Action
 * 
 * @author BarryLiu
 *
 */
public class FirmAction {
	private FirmService firmService;
	
	public void setFirmService(FirmService firmService) {
		this.firmService = firmService;
	}
	
	private HttpServletRequest request;
	/** 查询所有的员工 */
	public String findAllEmp() throws Exception {

		List<Emp> emps = firmService.queryAllEmps();
		request.setAttribute("emps", emps);
		return "";
	}

	/** 删除员工 */
	public String removeEmp() throws Exception {
		String empno = request.getParameter("empno");
		if (empno != null)
			firmService.removeEmp(Integer.parseInt(empno));
		return findAllEmp();
	}

	/** 跳到修改员工,查询所有部门 */
	public String toModifyEmp() throws Exception {
		List<Dept> depts = firmService.queryAllDepts();
		Emp emp = firmService.queryEmpByNo(request.getParameter("empno"));
		request.setAttribute("depts", depts);
		request.setAttribute("emp", emp);
		return "";
	}

	/** 修改员工 */
	public String modifyEmp() throws Exception {
		firmService.modifyEmp(request);
		return findAllEmp();
	}

	/** 跳到添加员工 */
	public String toAddEmp() throws Exception {
		List<Dept> depts = firmService.queryAllDepts();
		request.setAttribute("depts", depts);
		return "";
	}

	/** 跳到添加部门 */
	public String addEmp() throws Exception {
//		firmService.addEmp(request,  );

		return findAllEmp();
	}

	// =============================部门操作

	/** 查询所有的部门 */
	public String findAllDept() throws Exception {

		List<Dept> depts = firmService.queryAllDepts();
		request.setAttribute("depts", depts);
		return "";
	}

	/** 添加部门 */
	public String addDept() throws Exception {
		firmService.addDept(request);

		return findAllDept();
	}

	/** 跳到修改部门页面 */
	public String toModifyDept() throws Exception {
		Dept dept = firmService.queryDeptByNo(request.getParameter("deptno"));
		request.setAttribute("dept", dept);
		return "";
	}

	/** 修改部门 */
	public String modifyDept() throws Exception {
		firmService.modifyDept(request);
		return findAllDept();
	}

	/** 删除部门 */
	public String removeDept() throws Exception {
		String delDeptMsg = firmService.removeDept(request);
		request.setAttribute("delDeptMsg", delDeptMsg);
		return findAllDept();
	}

}
