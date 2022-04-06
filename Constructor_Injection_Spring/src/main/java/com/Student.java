package com;

public class Student
{
    private int id;
    private String name;
    private int std;
    private Address address;

    public Student(int id, String name, int std, Address address) {
        this.id = id;
        this.name = name;
        this.std = std;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", std=" + std +
                ", address=" + address +
                '}';
    }
}
