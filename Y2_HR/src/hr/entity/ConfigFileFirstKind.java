package hr.entity;

/**
 * 一级机构 表 
 * @author Eung-yuong Liu
 *
 */
public class ConfigFileFirstKind {
    private Integer id;

    private String firstKindId;

    private String firstKindName;

    private String firstKindSalaryId;

    private String firstKindSaleId;

    
    @Override
	public String toString() {
		return "ConfigFileFirstKind [id=" + id + ", firstKindId=" + firstKindId
				+ ", firstKindName=" + firstKindName + ", firstKindSalaryId="
				+ firstKindSalaryId + ", firstKindSaleId=" + firstKindSaleId
				+ "]";
	}

	public Integer getId() {
        return id;
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

    public String getFirstKindSalaryId() {
        return firstKindSalaryId;
    }

    public void setFirstKindSalaryId(String firstKindSalaryId) {
        this.firstKindSalaryId = firstKindSalaryId == null ? null : firstKindSalaryId.trim();
    }

    public String getFirstKindSaleId() {
        return firstKindSaleId;
    }

    public void setFirstKindSaleId(String firstKindSaleId) {
        this.firstKindSaleId = firstKindSaleId == null ? null : firstKindSaleId.trim();
    }
}