package hr.entity;

/**
 * Ö°Î» ±í
 * @author Eung-yuong Liu
 *
 */
public class ConfigMajor {
    private Integer id;

    private Integer majorKindId;

    private String majorKindName;

    private String majorId;

    private String majorName;

    private Integer testAmount;

    
    
    @Override
	public String toString() {
		return "ConfigMajor [id=" + id + ", majorKindId=" + majorKindId
				+ ", majorKindName=" + majorKindName + ", majorId=" + majorId
				+ ", majorName=" + majorName + ", testAmount=" + testAmount
				+ "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(Integer majorKindId) {
        this.majorKindId = majorKindId;
    }

    public String getMajorKindName() {
        return majorKindName;
    }

    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName == null ? null : majorKindName.trim();
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId == null ? null : majorId.trim();
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public Integer getTestAmount() {
        return testAmount;
    }

    public void setTestAmount(Integer testAmount) {
        this.testAmount = testAmount;
    }
}