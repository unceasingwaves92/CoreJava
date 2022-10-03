package com.emexo.comparable;

public class Student implements Comparable<Student> {

    private int studentId;
    private String studentName;
    private String email;
    private long mobNo;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    public int compareTo(Student student) {
        // ascending order for studentID
      //  return this.getStudentId()-student.getStudentId();
        // descending order for studentID
      //  return student.getStudentId()-this.getStudentId();
        // ascending order for studentName
        //return this.getStudentName().compareTo(student.getStudentName());
        // descending order for studentName
        return student.getStudentName().compareTo(this.getStudentName());
    }
}
