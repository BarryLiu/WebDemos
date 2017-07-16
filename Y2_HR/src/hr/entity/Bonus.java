package hr.entity;

import java.util.Date;

public class Bonus {
    private Integer id;

    private Integer majorKindId;

    private String majorKindName;

    private Integer majorId;

    private String majorName;

    private Integer humanId;

    private String humanName;

    private String bonusItem;

    private Double bonusWorth;

    private Integer bonusDegree;

    private String remark;

    private String register;

    private String checker;

    private Date registTime;

    private Date checkTime;

    private Integer checkStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(Integer majorKindId) {
        this.majorKindId = majorKindId;
    }

    public String getMajorKindName() {
        return majorKindName;
    }

    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName == null ? null : majorKindName.trim();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public Integer getHumanId() {
        return humanId;
    }

    public void setHumanId(Integer humanId) {
        this.humanId = humanId;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName == null ? null : humanName.trim();
    }

    public String getBonusItem() {
        return bonusItem;
    }

    public void setBonusItem(String bonusItem) {
        this.bonusItem = bonusItem == null ? null : bonusItem.trim();
    }

    public Double getBonusWorth() {
        return bonusWorth;
    }

    public void setBonusWorth(Double bonusWorth) {
        this.bonusWorth = bonusWorth;
    }

    public Integer getBonusDegree() {
        return bonusDegree;
    }

    public void setBonusDegree(Integer bonusDegree) {
        this.bonusDegree = bonusDegree;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }
}