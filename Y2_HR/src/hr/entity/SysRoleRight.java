package hr.entity;

public class SysRoleRight {
    private Integer id;

    private Integer roleId;

    private Integer rightId;

     
    public SysRoleRight(Integer roleId, Integer rightId) {
		super();
		this.roleId = roleId;
		this.rightId = rightId;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }
}