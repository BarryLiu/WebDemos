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
	public String removeEmp(Emp emp,HttpServletRequest request) throws Exception {
		String empno = emp.getEmpno()+"";
		if (empno != null&&!"".equals(empno))
			firmService.removeEmp(Integer.parseInt(empno));
		return findAllEmp(request);
	}

	/** 跳到修改员工,查询所有部门 */
	@RequestMapping("/toModifyEmp")
	public String toModifyEmp(ModelMap map,Emp e) throws Exception {
		List<Dept> depts = firmService.queryAllDepts();
		Emp emp = firmService.queryEmpByNo(e.getEmpno()+"");
		map.put("emp", emp);
		map.put("depts", depts);
		return "/modifyEmp.jsp";
	}

	/** 修改员工 */
	@RequestMapping("/modifyEmp")
	public String modifyEmp(Emp emp,HttpServletRequest request) throws Exception {
		firmService.modifyEmp(emp);
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
	public String addEmp(Emp emp,HttpServletRequest request) throws Exception {
		firmService.addEmp(emp,request);
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
	public String addDept(Dept dept,HttpServletRequest request) throws Exception {
		firmService.addDept(dept);

		return findAllDept(request);
	}

	/** 跳到修改部门页面 */
	@RequestMapping("/toModifyDept")
	public String toModifyDept(Dept d,HttpServletRequest request,ModelMap map) throws Exception {
		Dept dept = firmService.queryDeptByNo(d.getDeptno()+"");
		map.put("dept", dept);
		return "/modifyDept.jsp";
	}

	/** 修改部门 */
	@RequestMapping("/modifyDept")
	public String modifyDept(Dept dept,HttpServletRequest request) throws Exception {
		firmService.modifyDept(dept);
		return findAllDept(request);
	}

	/** 删除部门 */
	@RequestMapping("/removeDept")
	public String removeDept(Dept dept,HttpServletRequest request) throws Exception {
		String delDeptMsg = firmService.removeDept(dept.getDeptno());
		request.setAttribute("delDeptMsg", delDeptMsg);
		return findAllDept(request);
	}
}
