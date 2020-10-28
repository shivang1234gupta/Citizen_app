package com.myapp.android.citizen;

public class Character {
    String applicant;
    String mobile;
    String dob;
    String adress;
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Character(String applicant, String mobile, String dob, String adress) {
        this.applicant = applicant;
        this.mobile = mobile;
        this.dob = dob;
        this.adress = adress;
    }

    public Character() {
    }
}
