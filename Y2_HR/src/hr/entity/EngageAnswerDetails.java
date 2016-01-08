package hr.entity;

public class EngageAnswerDetails {
    private Integer id;

    private String answerNumber;

    private String subjectId;

    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(String answerNumber) {
        this.answerNumber = answerNumber == null ? null : answerNumber.trim();
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}