package hr.entity;

/**
 * 职位分类 表
 * @author Eung-yuong Liu
 *
 */
public class ConfigMajorKind {
    private Integer id;

    private String majorKindId;

    private String majorKindName;

    
    @Override
	public String toString() {
		return "ConfigMajorKind [id=" + id + ", majorKindId=" + majorKindId
				+ ", majorKindName=" + majorKindName + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(String majorKindId) {
        this.majorKindId = majorKindId == null ? null : majorKindId.trim();
    }

    public String getMajorKindName() {
        return majorKindName;
    }

    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName == null ? null : majorKindName.trim();
    }
}