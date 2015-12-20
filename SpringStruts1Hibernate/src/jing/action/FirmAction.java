package jing.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jing.entity.Dept;
import jing.entity.Emp;
import jing.form.FirmForm;
import jing.service.FirmService;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 * 公司 Action
 * 
 * @author BarryLiu
 *
 */
public class FirmAction extends DispatchAction {
	private FirmService firmService;

	public void setFirmService(FirmService firmService) {
		this.firmService = firmService;
	}

	/** 查询所有的员工 */
	public ActionForward findAllEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		List<Emp> emps = firmService.queryAllEmps();
		request.setAttribute("emps", emps);
		return mapping.findForward("listEmp");
	}

	/** 删除员工 */
	public ActionForward removeEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String empno = request.getParameter("empno");
		if (empno != null)
			firmService.removeEmp(Integer.parseInt(empno));
		return findAllEmp(mapping, form, request, response);
	}

	/** 跳到修改员工,查询所有部门 */
	public ActionForward toModifyEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Dept> depts = firmService.queryAllDepts();
		Emp emp = firmService.queryEmpByNo(request.getParameter("empno"));
		request.setAttribute("depts", depts);
		request.setAttribute("emp", emp);
		return mapping.findForward("modifyEmp");
	}

	/** 修改员工 */
	public ActionForward modifyEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		firmService.modifyEmp(request);
		return findAllEmp(mapping, form, request, response);
	}

	/** 跳到添加员工 */
	public ActionForward toAddEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Dept> depts = firmService.queryAllDepts();
		request.setAttribute("depts", depts);
		return mapping.findForward("addEmp");
	}

	/** 跳到添加部门 */
	public ActionForward addEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FirmForm firm = (FirmForm) form;
		firmService.addEmp(request, firm);

		return findAllEmp(mapping, form, request, response);
	}

	// =============================部门操作

	/** 查询所有的部门 */
	public ActionForward findAllDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		List<Dept> depts = firmService.queryAllDepts();
		request.setAttribute("depts", depts);
		return mapping.findForward("listDept");
	}

	/** 添加部门 */
	public ActionForward addDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		firmService.addDept(request);

		return findAllDept(mapping, form, request, response);
	}

	/** 跳到修改部门页面 */
	public ActionForward toModifyDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Dept dept = firmService.queryDeptByNo(request.getParameter("deptno"));
		request.setAttribute("dept", dept);
		return mapping.findForward("modifyDept");
	}

	/** 修改部门 */
	public ActionForward modifyDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		firmService.modifyDept(request);
		return findAllDept(mapping, form, request, response);
	}

	/** 删除部门 */
	public ActionForward removeDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String delDeptMsg = firmService.removeDept(request);
		request.setAttribute("delDeptMsg", delDeptMsg);
		return findAllDept(mapping, form, request, response);
	}

}
