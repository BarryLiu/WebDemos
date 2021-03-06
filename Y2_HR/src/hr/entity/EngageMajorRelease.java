package hr.entity;

import java.util.Date;

/**
 * 职位发表登记表
 * @author Eung-yuong Liu
 *
 */
public class EngageMajorRelease {
    private Integer id;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private String thirdKindId;

    private String thirdKindName;

    private String majorKindId;

    private String majorKindName;

    private String majorId;

    private String majorName;

    private Integer humanAmount;

    private String engageType;

    private Date deadline;

    private String register;

    private String changer;

    private Date registTime;

    private Date changeTime;

    private String majorDescribe;

    private String engageRequired;
    

    @Override
	public String toString() {
		return "EngageMajorRelease [id=" + id + ", firstKindId=" + firstKindId
				+ ", firstKindName=" + firstKindName + ", secondKindId="
				+ secondKindId + ", secondKindName=" + secondKindName
				+ ", thirdKindId=" + thirdKindId + ", thirdKindName="
				+ thirdKindName + ", majorKindId=" + majorKindId
				+ ", majorKindName=" + majorKindName + ", majorId=" + majorId
				+ ", majorName=" + majorName + ", humanAmount=" + humanAmount
				+ ", engageType=" + engageType + ", deadline=" + deadline
				+ ", register=" + register + ", changer=" + changer
				+ ", registTime=" + registTime + ", changeTime=" + changeTime
				+ ", majorDescribe=" + majorDescribe + ", engageRequired="
				+ engageRequired + "]";
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

    public Integer getHumanAmount() {
        return humanAmount;
    }

    public void setHumanAmount(Integer humanAmount) {
        this.humanAmount = humanAmount;
    }

    public String getEngageType() {
        return engageType;
    }

    public void setEngageType(String engageType) {
        this.engageType = engageType == null ? null : engageType.trim();
    }

    public Date getDeadline() {
    	System.out.println("getDeadline....."+deadline);
        return deadline;
    }

    public void setDeadline(Date deadline) {
    	System.out.println("setDeadline....."+deadline);
        this.deadline = deadline;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer == null ? null : changer.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getMajorDescribe() {
        return majorDescribe;
    }

    public void setMajorDescribe(String majorDescribe) {
        this.majorDescribe = majorDescribe == null ? null : majorDescribe.trim();
    }

    public String getEngageRequired() {
        return engageRequired;
    }

    public void setEngageRequired(String engageRequired) {
        this.engageRequired = engageRequired == null ? null : engageRequired.trim();
    }
}