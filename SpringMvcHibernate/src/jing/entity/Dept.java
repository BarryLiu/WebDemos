package jing.entity;

import java.util.Set;

/**
 * 部门
 * @author BarryLiu
 *
 */
public class Dept {

	/**部门编号	 */
	private Integer deptno;
	/**部门名称	*/
	private String dname;
	/**部门地址	*/
	private String loc;

	// 关联属性
	// 表示一个部门拥有多个员工
	// 在部门表中，是没有任何一列与该属性对应的
	private Set<Emp> emps;

	// dept.getEmps();

	 

	public Set<Emp> getEmps() {
		return emps;
	}

	public Dept() {
		super();
	}

	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
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
