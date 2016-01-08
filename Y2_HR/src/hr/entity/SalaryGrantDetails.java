package hr.entity;

public class SalaryGrantDetails {
    private Integer id;

    private String salaryGrantId;

    private String humanId;

    private String humanName;

    private Double bounsSum;

    private Double saleSum;

    private Double deductSum;

    private Double salaryStandardSum;

    private Double salaryGrantDetailscol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalaryGrantId() {
        return salaryGrantId;
    }

    public void setSalaryGrantId(String salaryGrantId) {
        this.salaryGrantId = salaryGrantId == null ? null : salaryGrantId.trim();
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId == null ? null : humanId.trim();
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName == null ? null : humanName.trim();
    }

    public Double getBounsSum() {
        return bounsSum;
    }

    public void setBounsSum(Double bounsSum) {
        this.bounsSum = bounsSum;
    }

    public Double getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(Double saleSum) {
        this.saleSum = saleSum;
    }

    public Double getDeductSum() {
        return deductSum;
    }

    public void setDeductSum(Double deductSum) {
        this.deductSum = deductSum;
    }

    public Double getSalaryStandardSum() {
        return salaryStandardSum;
    }

    public void setSalaryStandardSum(Double salaryStandardSum) {
        this.salaryStandardSum = salaryStandardSum;
    }

    public Double getSalaryGrantDetailscol() {
        return salaryGrantDetailscol;
    }

    public void setSalaryGrantDetailscol(Double salaryGrantDetailscol) {
        this.salaryGrantDetailscol = salaryGrantDetailscol;
    }
}