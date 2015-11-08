package hr.entity;

/**
 * ¹Ø¼ü×Ö ±í
 * @author Eung-yuong Liu
 *
 */
public class ConfigPrimaryKey {
    private Integer id;

    private String primaryKeyTable;

    private String primaryKey;

    private String keyName;

    private Integer primaryKeyStatus;

    
    
    @Override
	public String toString() {
		return "ConfigPrimaryKey [id=" + id + ", primaryKeyTable="
				+ primaryKeyTable + ", primaryKey=" + primaryKey + ", keyName="
				+ keyName + ", primaryKeyStatus=" + primaryKeyStatus + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimaryKeyTable() {
        return primaryKeyTable;
    }

    public void setPrimaryKeyTable(String primaryKeyTable) {
        this.primaryKeyTable = primaryKeyTable == null ? null : primaryKeyTable.trim();
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey == null ? null : primaryKey.trim();
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public Integer getPrimaryKeyStatus() {
        return primaryKeyStatus;
    }

    public void setPrimaryKeyStatus(Integer primaryKeyStatus) {
        this.primaryKeyStatus = primaryKeyStatus;
    }
}