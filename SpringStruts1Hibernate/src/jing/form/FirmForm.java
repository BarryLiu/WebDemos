package jing.form;

import jing.entity.Dept;
import jing.entity.Emp;

import org.apache.struts.action.ActionForm;

public class FirmForm extends ActionForm{
	private Emp emp=new Emp();
	private Dept dept=new Dept();
	
	 
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "FirmForm [emp=" + emp + ", dept=" + dept  + "]";
	}
	
	
}
