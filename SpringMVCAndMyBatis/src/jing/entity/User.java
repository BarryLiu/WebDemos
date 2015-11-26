package jing.entity;

public class User {
	private Integer userId;
	private String userName;
	private String password;
	private String filePath;
	
	public User() {
		super();
	}
	public User(Integer userId, String userName, String password,
			String filePath) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.filePath = filePath;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", filePath=" + filePath + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}
