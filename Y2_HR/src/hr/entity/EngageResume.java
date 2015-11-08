package hr.entity;

import java.util.Date;

/**
 * 简历管理 表
 * @author Eung-yuong Liu
 *
 */
public class EngageResume {
    private Integer id;

    private String humanName;

    private String engageType;

    private String humanAddress;

    private String humanPostcode;

    private String humanMajorKindId;

    private String humanMajorKindName;

    private String humanMajorId;

    private String humanMajorName;

    private String humanTelephone;

    private String humanHomephone;

    private String humanMobilephone;

    private String humanEmail;

    private String humanHobby;

    private String humanSpecility;

    private String humanSex;

    private String humanReligion;

    private String humanParty;

    private String humanNationality;

    private String humanRace;

    private String humanBirthday;

    private Integer humanAge;

    private String humanEducatedDegree;

    private Double humanEducatedYears;

    private String humanEducatedMajor;

    private String humanCollege;

    private String humanIdcard;

    private String humanBirthplace;

    private String demandSalaryStandard;

    private String humanHistoryRecords;

    private String remark;

    private String recomandation;

    private String humanPicture;

    private String attachmentName;

    private Integer checkStatus;

    private String register;

    private Date registTime;

    private String checker;

    private Date checkTime;

    private Integer interviewStatus;

    private Double totalPoints;

    private Integer testAmount;

    private String testChecker;

    private Date testCheckTime;

    private String passRegister;

    private Date passRegistTime;

    private String passChecker;

    private Date passCheckTime;

    private Integer passCheckStatus;

    private String passCheckcomment;

    private String passPasscomment;

    
    @Override
	public String toString() {
		return "EngageResume [id=" + id + ", humanName=" + humanName
				+ ", engageType=" + engageType + ", humanAddress="
				+ humanAddress + ", humanPostcode=" + humanPostcode
				+ ", humanMajorKindId=" + humanMajorKindId
				+ ", humanMajorKindName=" + humanMajorKindName
				+ ", humanMajorId=" + humanMajorId + ", humanMajorName="
				+ humanMajorName + ", humanTelephone=" + humanTelephone
				+ ", humanHomephone=" + humanHomephone + ", humanMobilephone="
				+ humanMobilephone + ", humanEmail=" + humanEmail
				+ ", humanHobby=" + humanHobby + ", humanSpecility="
				+ humanSpecility + ", humanSex=" + humanSex
				+ ", humanReligion=" + humanReligion + ", humanParty="
				+ humanParty + ", humanNationality=" + humanNationality
				+ ", humanRace=" + humanRace + ", humanBirthday="
				+ humanBirthday + ", humanAge=" + humanAge
				+ ", humanEducatedDegree=" + humanEducatedDegree
				+ ", humanEducatedYears=" + humanEducatedYears
				+ ", humanEducatedMajor=" + humanEducatedMajor
				+ ", humanCollege=" + humanCollege + ", humanIdcard="
				+ humanIdcard + ", humanBirthplace=" + humanBirthplace
				+ ", demandSalaryStandard=" + demandSalaryStandard
				+ ", humanHistoryRecords=" + humanHistoryRecords + ", remark="
				+ remark + ", recomandation=" + recomandation
				+ ", humanPicture=" + humanPicture + ", attachmentName="
				+ attachmentName + ", checkStatus=" + checkStatus
				+ ", register=" + register + ", registTime=" + registTime
				+ ", checker=" + checker + ", checkTime=" + checkTime
				+ ", interviewStatus=" + interviewStatus + ", totalPoints="
				+ totalPoints + ", testAmount=" + testAmount + ", testChecker="
				+ testChecker + ", testCheckTime=" + testCheckTime
				+ ", passRegister=" + passRegister + ", passRegistTime="
				+ passRegistTime + ", passChecker=" + passChecker
				+ ", passCheckTime=" + passCheckTime + ", passCheckStatus="
				+ passCheckStatus + ", passCheckcomment=" + passCheckcomment
				+ ", passPasscomment=" + passPasscomment + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName == null ? null : humanName.trim();
    }

    public String getEngageType() {
        return engageType;
    }

    public void setEngageType(String engageType) {
        this.engageType = engageType == null ? null : engageType.trim();
    }

    public String getHumanAddress() {
        return humanAddress;
    }

    public void setHumanAddress(String humanAddress) {
        this.humanAddress = humanAddress == null ? null : humanAddress.trim();
    }

    public String getHumanPostcode() {
        return humanPostcode;
    }

    public void setHumanPostcode(String humanPostcode) {
        this.humanPostcode = humanPostcode == null ? null : humanPostcode.trim();
    }

    public String getHumanMajorKindId() {
        return humanMajorKindId;
    }

    public void setHumanMajorKindId(String humanMajorKindId) {
        this.humanMajorKindId = humanMajorKindId == null ? null : humanMajorKindId.trim();
    }

    public String getHumanMajorKindName() {
        return humanMajorKindName;
    }

    public void setHumanMajorKindName(String humanMajorKindName) {
        this.humanMajorKindName = humanMajorKindName == null ? null : humanMajorKindName.trim();
    }

    public String getHumanMajorId() {
        return humanMajorId;
    }

    public void setHumanMajorId(String humanMajorId) {
        this.humanMajorId = humanMajorId == null ? null : humanMajorId.trim();
    }

    public String getHumanMajorName() {
        return humanMajorName;
    }

    public void setHumanMajorName(String humanMajorName) {
        this.humanMajorName = humanMajorName == null ? null : humanMajorName.trim();
    }

    public String getHumanTelephone() {
        return humanTelephone;
    }

    public void setHumanTelephone(String humanTelephone) {
        this.humanTelephone = humanTelephone == null ? null : humanTelephone.trim();
    }

    public String getHumanHomephone() {
        return humanHomephone;
    }

    public void setHumanHomephone(String humanHomephone) {
        this.humanHomephone = humanHomephone == null ? null : humanHomephone.trim();
    }

    public String getHumanMobilephone() {
        return humanMobilephone;
    }

    public void setHumanMobilephone(String humanMobilephone) {
        this.humanMobilephone = humanMobilephone == null ? null : humanMobilephone.trim();
    }

    public String getHumanEmail() {
        return humanEmail;
    }

    public void setHumanEmail(String humanEmail) {
        this.humanEmail = humanEmail == null ? null : humanEmail.trim();
    }

    public String getHumanHobby() {
        return humanHobby;
    }

    public void setHumanHobby(String humanHobby) {
        this.humanHobby = humanHobby == null ? null : humanHobby.trim();
    }

    public String getHumanSpecility() {
        return humanSpecility;
    }

    public void setHumanSpecility(String humanSpecility) {
        this.humanSpecility = humanSpecility == null ? null : humanSpecility.trim();
    }

    public String getHumanSex() {
        return humanSex;
    }

    public void setHumanSex(String humanSex) {
        this.humanSex = humanSex == null ? null : humanSex.trim();
    }

    public String getHumanReligion() {
        return humanReligion;
    }

    public void setHumanReligion(String humanReligion) {
        this.humanReligion = humanReligion == null ? null : humanReligion.trim();
    }

    public String getHumanParty() {
        return humanParty;
    }

    public void setHumanParty(String humanParty) {
        this.humanParty = humanParty == null ? null : humanParty.trim();
    }

    public String getHumanNationality() {
        return humanNationality;
    }

    public void setHumanNationality(String humanNationality) {
        this.humanNationality = humanNationality == null ? null : humanNationality.trim();
    }

    public String getHumanRace() {
        return humanRace;
    }

    public void setHumanRace(String humanRace) {
        this.humanRace = humanRace == null ? null : humanRace.trim();
    }

    public String getHumanBirthday() {
        return humanBirthday;
    }

    public void setHumanBirthday(String humanBirthday) {
        this.humanBirthday = humanBirthday == null ? null : humanBirthday.trim();
    }

    public Integer getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(Integer humanAge) {
        this.humanAge = humanAge;
    }

    public String getHumanEducatedDegree() {
        return humanEducatedDegree;
    }

    public void setHumanEducatedDegree(String humanEducatedDegree) {
        this.humanEducatedDegree = humanEducatedDegree == null ? null : humanEducatedDegree.trim();
    }

    public Double getHumanEducatedYears() {
        return humanEducatedYears;
    }

    public void setHumanEducatedYears(Double humanEducatedYears) {
        this.humanEducatedYears = humanEducatedYears;
    }

    public String getHumanEducatedMajor() {
        return humanEducatedMajor;
    }

    public void setHumanEducatedMajor(String humanEducatedMajor) {
        this.humanEducatedMajor = humanEducatedMajor == null ? null : humanEducatedMajor.trim();
    }

    public String getHumanCollege() {
        return humanCollege;
    }

    public void setHumanCollege(String humanCollege) {
        this.humanCollege = humanCollege == null ? null : humanCollege.trim();
    }

    public String getHumanIdcard() {
        return humanIdcard;
    }

    public void setHumanIdcard(String humanIdcard) {
        this.humanIdcard = humanIdcard == null ? null : humanIdcard.trim();
    }

    public String getHumanBirthplace() {
        return humanBirthplace;
    }

    public void setHumanBirthplace(String humanBirthplace) {
        this.humanBirthplace = humanBirthplace == null ? null : humanBirthplace.trim();
    }

    public String getDemandSalaryStandard() {
        return demandSalaryStandard;
    }

    public void setDemandSalaryStandard(String demandSalaryStandard) {
        this.demandSalaryStandard = demandSalaryStandard == null ? null : demandSalaryStandard.trim();
    }

    public String getHumanHistoryRecords() {
        return humanHistoryRecords;
    }

    public void setHumanHistoryRecords(String humanHistoryRecords) {
        this.humanHistoryRecords = humanHistoryRecords == null ? null : humanHistoryRecords.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRecomandation() {
        return recomandation;
    }

    public void setRecomandation(String recomandation) {
        this.recomandation = recomandation == null ? null : recomandation.trim();
    }

    public String getHumanPicture() {
        return humanPicture;
    }

    public void setHumanPicture(String humanPicture) {
        this.humanPicture = humanPicture == null ? null : humanPicture.trim();
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName == null ? null : attachmentName.trim();
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(Integer interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public Double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Double totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Integer getTestAmount() {
        return testAmount;
    }

    public void setTestAmount(Integer testAmount) {
        this.testAmount = testAmount;
    }

    public String getTestChecker() {
        return testChecker;
    }

    public void setTestChecker(String testChecker) {
        this.testChecker = testChecker == null ? null : testChecker.trim();
    }

    public Date getTestCheckTime() {
        return testCheckTime;
    }

    public void setTestCheckTime(Date testCheckTime) {
        this.testCheckTime = testCheckTime;
    }

    public String getPassRegister() {
        return passRegister;
    }

    public void setPassRegister(String passRegister) {
        this.passRegister = passRegister == null ? null : passRegister.trim();
    }

    public Date getPassRegistTime() {
        return passRegistTime;
    }

    public void setPassRegistTime(Date passRegistTime) {
        this.passRegistTime = passRegistTime;
    }

    public String getPassChecker() {
        return passChecker;
    }

    public void setPassChecker(String passChecker) {
        this.passChecker = passChecker == null ? null : passChecker.trim();
    }

    public Date getPassCheckTime() {
        return passCheckTime;
    }

    public void setPassCheckTime(Date passCheckTime) {
        this.passCheckTime = passCheckTime;
    }

    public Integer getPassCheckStatus() {
        return passCheckStatus;
    }

    public void setPassCheckStatus(Integer passCheckStatus) {
        this.passCheckStatus = passCheckStatus;
    }

    public String getPassCheckcomment() {
        return passCheckcomment;
    }

    public void setPassCheckcomment(String passCheckcomment) {
        this.passCheckcomment = passCheckcomment == null ? null : passCheckcomment.trim();
    }

    public String getPassPasscomment() {
        return passPasscomment;
    }

    public void setPassPasscomment(String passPasscomment) {
        this.passPasscomment = passPasscomment == null ? null : passPasscomment.trim();
    }
}