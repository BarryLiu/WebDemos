package hr.entity;

public class User {
    private Integer id;

    private String userName;

    private String userTrueName;

    private String userPassword;

    private Integer userRoleId;
    
    
    
    //πÿ¡™ Ù–‘
    private SysRole sysRole;
    
    
    
    
    @Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userTrueName="
				+ userTrueName + ", userPassword=" + userPassword
				+ ", userRoleId=" + userRoleId + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserTrueName() {
        return userTrueName;
    }

    public void setUserTrueName(String userTrueName) {
        this.userTrueName = userTrueName == null ? null : userTrueName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
    
}