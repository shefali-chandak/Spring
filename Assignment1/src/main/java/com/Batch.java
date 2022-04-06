package com;

import java.util.List;

public class Batch {
    private String courseName;
    private int batchCode;
    private List<Student> student;

    public Batch(String courseName, int batchCode, List<Student> student) {
        this.courseName = courseName;
        this.batchCode = batchCode;
        this.student = student;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "courseName='" + courseName + '\'' +
                ", batchCode=" + batchCode +
                ",\nstudent=" + student +
                '}';
    }
}
