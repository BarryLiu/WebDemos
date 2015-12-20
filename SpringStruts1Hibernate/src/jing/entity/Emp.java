package jing.entity;

import java.util.Date;

/**
 * Ա����
 * 
 * @author BarryLiu
 *
 */
public class Emp {
	/** Ա����� */
	private Integer empno;
	/** Ա������ */
	private String ename;
	/** Ա������ */
	private String job;
	/** �ϼ���� */
	private Integer mgr;
	/** ����ʱ�� */
	private Date hiredate;
	/** ���� */
	private Float sal;
	/** ���� */
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

	// ��Emp���е������Ӧ:������OOP�ı�ʾ��ʽ
	// private Integer deptno;

	// OOP�ı�ʾ��ʽ��������һ��Ա����һ�����Ŷ�Ӧ
	// ��������
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
		// �Ѿ���ȡ����һ��Empʵ��
		Emp emp = new Emp();
		// �����ܻ�ȡ��һ�������Ĳ���ʵ��
		// emp.getDeptno();
		// Hibernate���Զ���ѯ�����Ա����Ӧ�Ĳ�����Ϣ
		emp.getDept();
	}

}
