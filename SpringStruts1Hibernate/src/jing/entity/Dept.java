package jing.entity;

import java.util.Set;

public class Dept {

	private Integer deptno;
	private String dname;
	private String loc;

	// 关联属性
	// 表示一个部门拥有多个员工
	// 在部门表中，是没有任何一列与该属性对应的
	private Set<Emp> emps;

	// dept.getEmps();

	public Set<Emp> getEmps() {
		return emps;
	}

	// 只输出自己的属性，关联属性不要输出！！！
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc
				+ "]";
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
