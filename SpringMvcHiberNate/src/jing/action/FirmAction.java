package jing.action;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jing.entity.Dept;
import jing.entity.Emp;
import jing.service.FirmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公司 Action
 * 
 * @author BarryLiu
 *
 */
@Controller
@RequestMapping("/firm")
public class FirmAction {
	@Autowired
	private FirmService firmService;
	
	/** 查询所有的员工 */
	@RequestMapping("/findAllEmp")
	public String findAllEmp(HttpServletRequest request) throws Exception {
		List<Emp> emps = firmService.queryAllEmps();
		request.setAttribute("emps", emps);
		return "/listEmp.jsp";
	}

	/** 删除员工 */
	@RequestMapping("/removeEmp")
	public String removeEmp(HttpServletRequest request) throws Exception {
		String empno = request.getParameter("empno");
		if (empno != null)
			firmService.removeEmp(Integer.parseInt(empno));
		return findAllEmp(request);
	}

	/** 跳到修改员工,查询所有部门 */
	@RequestMapping("/toModifyEmp")
	public String toModifyEmp(HttpServletRequest request) throws Exception {
		List<Dept> depts = firmService.queryAllDepts();
		Emp emp = firmService.queryEmpByNo(request.getParameter("empno"));
		request.setAttribute("depts", depts);
		request.setAttribute("emp", emp);
		return "/modifyEmp.jsp";
	}

	/** 修改员工 */
	@RequestMapping("/modifyEmp")
	public String modifyEmp(HttpServletRequest request) throws Exception {
		firmService.modifyEmp(request);
		return findAllEmp(request);
	}

	/** 跳到添加员工 */
	@RequestMapping("/toAddEmp")
	public String toAddEmp(ModelMap map) throws Exception {
		List<Dept> depts = firmService.queryAllDepts();
		map.put("depts", depts);
		return "/addEmp.jsp";
	}

	/** 跳到添加部门 */
	@RequestMapping("/addEmp")
	public String addEmp(HttpServletRequest request) throws Exception {
//		firmService.addEmp(request,  );

		return findAllEmp(request);
	}

	// =============================部门操作

	/** 查询所有的部门 */
	@RequestMapping("/findAllDept")
	public String findAllDept(HttpServletRequest request) throws Exception {
		List<Dept> depts = firmService.queryAllDepts();
		request.setAttribute("depts", depts);
		return "/listDept.jsp";
	}

	/** 添加部门 */
	@RequestMapping("/addDept")
	public String addDept(HttpServletRequest request) throws Exception {
		firmService.addDept(request);

		return findAllDept(request);
	}

	/** 跳到修改部门页面 */
	@RequestMapping("/toModifyDept")
	public String toModifyDept(HttpServletRequest request) throws Exception {
		Dept dept = firmService.queryDeptByNo(request.getParameter("deptno"));
		request.setAttribute("dept", dept);
		return "/modifyDept.jsp";
	}

	/** 修改部门 */
	@RequestMapping("/modifyDept")
	public String modifyDept(HttpServletRequest request) throws Exception {
		firmService.modifyDept(request);
		return findAllDept(request);
	}

	/** 删除部门 */
	@RequestMapping("/removeDept")
	public String removeDept(HttpServletRequest request) throws Exception {
		String delDeptMsg = firmService.removeDept(request);
		request.setAttribute("delDeptMsg", delDeptMsg);
		return findAllDept(request);
	}
}
