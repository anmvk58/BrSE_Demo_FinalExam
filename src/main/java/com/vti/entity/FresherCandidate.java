package com.vti.entity;

public class FresherCandidate extends Candidate{
    private GraduationRank graduationRank;

    public FresherCandidate(String firstName, String lastName, String phone, String email, GraduationRank graduationRank) {
        super(firstName, lastName, phone, email);
        this.graduationRank = graduationRank;
    }

    public GraduationRank getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(GraduationRank graduationRank) {
        this.graduationRank = graduationRank;
    }
}
