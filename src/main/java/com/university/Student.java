package com.university;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String enrollmentDate;
    private String dateOfBirth;

    public Student(String firstName, String lastName, String email, String enrollmentDate, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
        this.dateOfBirth = dateOfBirth;
    }
    public Student(){
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.enrollmentDate = "";
        this.dateOfBirth = "";
    }
    public String getEmail() {
        return email;
    }
    public String setFirstName(String firstName){
        return this.firstName = firstName;
    }
    public String setLastName(String lastName){
        return this.lastName = lastName;
    }
    public String setEmail(String email){
        return this.email = email;
    }
    public String setEnrollmentDate(String enrollmentDate){
        return this.enrollmentDate = enrollmentDate;
    }
    public String setDateOfBirth(String dateOfBirth){
        return this.dateOfBirth = dateOfBirth;
    }
}
