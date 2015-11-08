package hr.entity;

/**
 * 三级机构 表 
 * @author Eung-yuong Liu
 *
 */
public class ConfigFileThirdKind {
    private Integer id;

    private String secondKindId;

    private String secondKindName;

    private String thirdKindId;

    private String thirdKindName;

    private String thirdKindSaleId;

    private String thirdKindIsRetail;

    private String firstKindId;

    private String firstKindName;

    
    
    @Override
	public String toString() {
		return "ConfigFileThirdKind [id=" + id + ", secondKindId="
				+ secondKindId + ", secondKindName=" + secondKindName
				+ ", thirdKindId=" + thirdKindId + ", thirdKindName="
				+ thirdKindName + ", thirdKindSaleId=" + thirdKindSaleId
				+ ", thirdKindIsRetail=" + thirdKindIsRetail + ", firstKindId="
				+ firstKindId + ", firstKindName=" + firstKindName + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getThirdKindId() {
        return thirdKindId;
    }

    public void setThirdKindId(String thirdKindId) {
        this.thirdKindId = thirdKindId == null ? null : thirdKindId.trim();
    }

    public String getThirdKindName() {
        return thirdKindName;
    }

    public void setThirdKindName(String thirdKindName) {
        this.thirdKindName = thirdKindName == null ? null : thirdKindName.trim();
    }

    public String getThirdKindSaleId() {
        return thirdKindSaleId;
    }

    public void setThirdKindSaleId(String thirdKindSaleId) {
        this.thirdKindSaleId = thirdKindSaleId == null ? null : thirdKindSaleId.trim();
    }

    public String getThirdKindIsRetail() {
        return thirdKindIsRetail;
    }

    public void setThirdKindIsRetail(String thirdKindIsRetail) {
        this.thirdKindIsRetail = thirdKindIsRetail == null ? null : thirdKindIsRetail.trim();
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
}