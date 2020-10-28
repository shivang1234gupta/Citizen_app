package com.myapp.android.citizen;

public class EmployeeVerClass {
    String employeeName;
    String employerName;
    String employeePos;
    String employerDob;
    String employeeMob;
    String employerMobile;
    String employeeAdress;
    String employerAdress;
    String id;

    public EmployeeVerClass() {
    }

    public EmployeeVerClass(String employeeName, String employerName, String employeePos,
                            String employerDob, String employeeMob, String employerMobile, String employeeAdress,
                            String employerAdress, String id) {
        this.employeeName = employeeName;
        this.employerName = employerName;
        this.employeePos = employeePos;
        this.employerDob = employerDob;
        this.employeeMob = employeeMob;
        this.employerMobile = employerMobile;
        this.employeeAdress = employeeAdress;
        this.employerAdress = employerAdress;
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployeePos() {
        return employeePos;
    }

    public void setEmployeePos(String employeePos) {
        this.employeePos = employeePos;
    }

    public String getEmployerDob() {
        return employerDob;
    }

    public void setEmployerDob(String employerDob) {
        this.employerDob = employerDob;
    }

    public String getEmployeeMob() {
        return employeeMob;
    }

    public void setEmployeeMob(String employeeMob) {
        this.employeeMob = employeeMob;
    }

    public String getEmployerMobile() {
        return employerMobile;
    }

    public void setEmployerMobile(String employerMobile) {
        this.employerMobile = employerMobile;
    }

    public String getEmployeeAdress() {
        return employeeAdress;
    }

    public void setEmployeeAdress(String employeeAdress) {
        this.employeeAdress = employeeAdress;
    }

    public String getEmployerAdress() {
        return employerAdress;
    }

    public void setEmployerAdress(String employerAdress) {
        this.employerAdress = employerAdress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
