package example;

public class FresherCandidate extends Candidate{
    private String graduation_date;
    private String graduation_rank;
    private String education;

    public FresherCandidate(String id, String firstname, String lastname, String dob, String address, String phone, String email, String graduation_date, String graduation_rank, String education) {
        super(id, firstname, lastname, dob, address, phone, email, 2);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
