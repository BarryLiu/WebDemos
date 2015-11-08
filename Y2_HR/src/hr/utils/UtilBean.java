package hr.utils;


public class UtilBean {

	private String endDate;
	private String startDate;
	private String primarKey;
	private String datePropertyName;
	 
 
	 
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getPrimarKey() {
		return primarKey;
	}
	public void setPrimarKey(String primarKey) {
		this.primarKey = primarKey;
	}
	public String getDatePropertyName() {
		return datePropertyName;
	}
	public void setDatePropertyName(String datePropertyName) {
		this.datePropertyName = datePropertyName;
	}
	@Override
	public String toString() {
		return "UtilBean [endDate=" + endDate + ", startDate=" + startDate
				+ ", primarKey=" + primarKey + ", datePropertyName="
				+ datePropertyName + "]";
	}
	
	
}
