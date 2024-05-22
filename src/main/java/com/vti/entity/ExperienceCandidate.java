package com.vti.entity;

public class ExperienceCandidate extends Candidate{
    private int expInYear;
    private String proSkill;

    public ExperienceCandidate(String firstName, String lastName, String phone, String email, int expInYear, String proSkill) {
        super(firstName, lastName, phone, email);
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
}
