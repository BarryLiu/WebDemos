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
 * ¹«Ë¾Action
 * @author BarryLiu
 *
 */
public class FirmAction extends DispatchAction{
	private FirmService firmService;
	public void setFirmService(FirmService firmService) {
		this.firmService = firmService;
	}
	

	public ActionForward findAll(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Emp> emps=firmService.queryAllEmps();
		request.setAttribute("emps", emps);
		return mapping.findForward("list");
	}
	 
	public ActionForward remove(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String empno = request.getParameter("empno");
		if(empno!=null)
			firmService.removeEmp(Integer.parseInt(empno));
		return findAll(mapping, form, request, response);
	}
	public ActionForward toModify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Dept> depts=firmService.queryAllDepts();
		request.setAttribute("depts", depts);
		return mapping.findForward("modify");
	}
	public ActionForward modify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		firmService.modifyEmp(request);
		return findAll(mapping, form, request, response);
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
		
		return findAll(mapping, form, request, response);
	}
	
	
	
	
}
