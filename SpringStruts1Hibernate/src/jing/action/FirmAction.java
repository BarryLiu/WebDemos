package jing.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jing.entity.Dept;
import jing.entity.Emp;
import jing.service.FirmService;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 * 部门
 * @author BarryLiu
 *
 */
public class FirmAction extends DispatchAction{
	private FirmService firmService;
	public void setFirmService(FirmService firmService) {
		this.firmService = firmService;
	}
	
	/**查询所有的员工*/
	public ActionForward findAllEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Emp> emps=firmService.queryAllEmps();
		request.setAttribute("emps", emps);
		return mapping.findForward("listEmp");
	}
	 
	public ActionForward removeEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String empno = request.getParameter("empno");
		if(empno!=null)
			firmService.removeEmp(Integer.parseInt(empno));
		return findAllEmp(mapping, form, request, response);
	}
	public ActionForward toModifyEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Dept> depts=firmService.queryAllDepts();
		Emp emp=firmService.queryEmpByNo(request.getParameter("empno"));
		request.setAttribute("depts", depts);
		request.setAttribute("emp", emp);
		return mapping.findForward("modifyEmp");
	}
	public ActionForward modifyEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		firmService.modifyEmp(request);
		return findAllEmp(mapping, form, request, response);
	}
	
	public ActionForward toAddEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Dept> depts=firmService.queryAllDepts();
		request.setAttribute("depts", depts);
		return mapping.findForward("addEmp");
	}
	
	public ActionForward addEmp(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		 firmService.addEmp(request);
		
		return findAllEmp(mapping, form, request, response);
	}
	
	
	
	//=============================部门操作
	
	/**查询所有的员工*/
	public ActionForward findAllDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Dept> depts=firmService.queryAllDepts();
		request.setAttribute("depts", depts);
		return mapping.findForward("listDept");
	}
	
	public ActionForward addDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		firmService.addDept(request); 
		
		return findAllDept(mapping, form, request, response);
	}
	public ActionForward toModifyDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		Dept dept =firmService.queryDeptByNo(request.getParameter("deptno"));
		request.setAttribute("dept", dept);
		return mapping.findForward("modifyDept");
	}
	public ActionForward modifyDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		firmService.modifyDept(request);
		return findAllDept(mapping, form, request, response);
	}
	public ActionForward removeDept(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String delDeptMsg = firmService.removeDept(request);
		request.setAttribute("delDeptMsg", delDeptMsg);
		return findAllDept(mapping, form, request, response);
	}
	
	
	
}
