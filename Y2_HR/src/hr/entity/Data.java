package hr.entity;

public class Data {
	private Integer id;
	private String tableName;
	private String tableComment;
	
	private String columnName;
	private String columnComment;
	private String dataType;
	
	private Integer  ordinalPosition;

	
	
	@Override
	public String toString() {
		return "Data [id=" + id + ", tableName=" + tableName
				+ ", tableComment=" + tableComment + ", columnName="
				+ columnName + ", columnComment=" + columnComment
				+ ", dataType=" + dataType + ", ordinalPosition="
				+ ordinalPosition + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(Integer ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}
	
	
	
}
