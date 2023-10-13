package example;

public class InternCandidate extends Candidate{
    private String major;
    private int term;
    private String universityName;

    public InternCandidate(String id, String firstname, String lastname, String dob, String address, String phone, String email, String major, int term, String universityName) {
        super(id, firstname, lastname, dob, address, phone, email, 3);
        this.major = major;
        this.term = term;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return this.getId() + "   " + this.getLastname() + " " + this.getFirstname() + "    " + this.getRange();
    }
}
