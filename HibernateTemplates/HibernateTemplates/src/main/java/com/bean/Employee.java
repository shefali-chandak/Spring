package com.bean;

import javax.persistence.*;

@Entity
@Table(name ="empdetails")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String ename;
    private  Float salary;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
}
