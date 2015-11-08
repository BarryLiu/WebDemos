package hr.entity;

/**
 * 二级机构 表 
 * @author Eung-yuong Liu
 *
 */
public class ConfigFileSecondKind {
    private Integer id;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private String secondSalaryId;

    private String secondSaleId;

    public Integer getId() {
        return id;
    }

    
    @Override
	public String toString() {
		return "ConfigFileSecondKind [id=" + id + ", firstKindId="
				+ firstKindId + ", firstKindName=" + firstKindName
				+ ", secondKindId=" + secondKindId + ", secondKindName="
				+ secondKindName + ", secondSalaryId=" + secondSalaryId
				+ ", secondSaleId=" + secondSaleId + "]";
	}



	public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId == null ? null : firstKindId.trim();
    }

    public String getFirstKindName() {
        return firstKindName;
    }

    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName == null ? null : firstKindName.trim();
    }

    public String getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(String secondKindId) {
        this.secondKindId = secondKindId == null ? null : secondKindId.trim();
    }

    public String getSecondKindName() {
        return secondKindName;
    }

    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName == null ? null : secondKindName.trim();
    }

    public String getSecondSalaryId() {
        return secondSalaryId;
    }

    public void setSecondSalaryId(String secondSalaryId) {
        this.secondSalaryId = secondSalaryId == null ? null : secondSalaryId.trim();
    }

    public String getSecondSaleId() {
        return secondSaleId;
    }

    public void setSecondSaleId(String secondSaleId) {
        this.secondSaleId = secondSaleId == null ? null : secondSaleId.trim();
    }
}