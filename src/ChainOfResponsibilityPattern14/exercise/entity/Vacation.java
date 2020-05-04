package ChainOfResponsibilityPattern14.exercise.entity;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 17:01
 * @Describe
 */

public class Vacation {

    private String applicant;
    private int days;
    private String reason;

    public Vacation(String applicant, int days, String reason) {
        this.applicant = applicant;
        this.days = days;
        this.reason = reason;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
