package com.bean;


import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Transactional()
public class EmployeeDao {
    private HibernateTemplate ht;


    public HibernateTemplate getHt() {
        return ht;
    }

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    @Override
    public String toString() {
        return "EmployeeDao{" +
                "ht=" + ht +
                '}';
    }

    public  int insertEmp(Employee e){
        return (int) ht.save(e);
    }

    public int updateEmp(int n,float s){
        return  ht.bulkUpdate("update Employee SET salary='"+s+"' where id='"+n+"'");
    }

    public  int deleteEmp(int n){
        return ht.bulkUpdate("delete from Employee where id='"+n+"'");

    }
    public List<Employee> fetchEmp(){
        return ht.loadAll(Employee.class);
    }

}
