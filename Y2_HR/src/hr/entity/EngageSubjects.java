package hr.entity;

import java.util.Date;

public class EngageSubjects {
    private Integer id;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private String register;

    private Date registTime;

    private String derivation;

    private String content;

    private String keyA;

    private String keyB;

    private String keyC;

    private String keyD;

    private String keyE;

    private String correctKey;

    private String changer;

    private Date changeTime;

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

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation == null ? null : derivation.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getKeyA() {
        return keyA;
    }

    public void setKeyA(String keyA) {
        this.keyA = keyA == null ? null : keyA.trim();
    }

    public String getKeyB() {
        return keyB;
    }

    public void setKeyB(String keyB) {
        this.keyB = keyB == null ? null : keyB.trim();
    }

    public String getKeyC() {
        return keyC;
    }

    public void setKeyC(String keyC) {
        this.keyC = keyC == null ? null : keyC.trim();
    }

    public String getKeyD() {
        return keyD;
    }

    public void setKeyD(String keyD) {
        this.keyD = keyD == null ? null : keyD.trim();
    }

    public String getKeyE() {
        return keyE;
    }

    public void setKeyE(String keyE) {
        this.keyE = keyE == null ? null : keyE.trim();
    }

    public String getCorrectKey() {
        return correctKey;
    }

    public void setCorrectKey(String correctKey) {
        this.correctKey = correctKey == null ? null : correctKey.trim();
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer == null ? null : changer.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}