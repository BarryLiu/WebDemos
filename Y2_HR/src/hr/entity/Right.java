package hr.entity;

public class Right {
    private Integer id;

    private String rightName;

    private String rightPath;

    private String parentId;

    private String rightType;

    
    
    
    @Override
	public String toString() {
		return "Right [id=" + id + ", rightName=" + rightName + ", rightPath="
				+ rightPath + ", parentId=" + parentId + ", rightType="
				+ rightType + "]";
	}

	public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName == null ? null : rightName.trim();
    }

    public String getRightPath() {
        return rightPath;
    }

    public void setRightPath(String rightPath) {
        this.rightPath = rightPath == null ? null : rightPath.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType == null ? null : rightType.trim();
    }
}