package example;

public class ExperiencedCandidate extends Candidate{
    private int expInYear;
    private String proSkill;

    public ExperiencedCandidate(String id, String firstname, String lastname, String dob, String address, String phone, String email, int expInYear, String proSkill) {
        super(id, firstname, lastname, dob, address, phone, email, 1);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return this.getId() + "   " + this.getLastname() + " " + this.getFirstname() + "    " + this.getRange();
    }
}
