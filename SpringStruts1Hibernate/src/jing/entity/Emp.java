package jing.entity;

import java.util.Date;

/**
 * 员工表
 * 
 * @author BarryLiu
 *
 */
public class Emp {
	/** 员工编号 */
	private Integer empno;
	/** 员工名称 */
	private String ename;
	/** 员工工作 */
	private String job;
	/** 上级编号 */
	private Integer mgr;
	/** 加入时间 */
	private Date hiredate;
	/** 工资 */
	private Float sal;
	/** 奖金 */
	private Float comm;

	public Emp(Integer empno, String ename, String job, Integer mgr,
			Date hiredate, Float sal, Float comm) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
	}

	public Emp() {
	}

	// 与Emp表中的外键对应:并不是OOP的表示方式
	// private Integer deptno;

	// OOP的表示方式：这里有一个员工与一个部门对应
	// 关联属性
	private Dept dept;

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + "]";
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	public Float getComm() {
		return comm;
	}

	public void setComm(Float comm) {
		this.comm = comm;
	}

	// public Integer getDeptno() {
	// return deptno;
	// }
	//
	// public void setDeptno(Integer deptno) {
	// this.deptno = deptno;
	// }

	public static void main(String[] args) {
		// 已经获取到了一个Emp实例
		Emp emp = new Emp();
		// 并不能获取到一个完整的部门实例
		// emp.getDeptno();
		// Hibernate会自动查询出这个员工对应的部门信息
		emp.getDept();
	}

}
