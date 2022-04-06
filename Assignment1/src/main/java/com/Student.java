package com;

public class Student {
    private String sname;
    private String qualification;
    private float aggregate;

    public Student(String sname, String qualification, float aggregate) {
        this.sname = sname;
        this.qualification = qualification;
        this.aggregate = aggregate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", qualification='" + qualification + '\'' +
                ", aggregate=" + aggregate +
                '}';
    }
}
