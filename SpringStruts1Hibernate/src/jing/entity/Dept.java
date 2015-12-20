package jing.entity;

import java.util.Set;

/**
 * ����
 * @author BarryLiu
 *
 */
public class Dept {

	/**���ű��	 */
	private Integer deptno;
	/**��������	*/
	private String dname;
	/**���ŵ�ַ	*/
	private String loc;

	// ��������
	// ��ʾһ������ӵ�ж��Ա��
	// �ڲ��ű��У���û���κ�һ��������Զ�Ӧ��
	private Set<Emp> emps;

	public Dept(){
		
	}
	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	// dept.getEmps();

	public Set<Emp> getEmps() {
		return emps;
	}

	// ֻ����Լ������ԣ��������Բ�Ҫ���������
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
