package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        EmployeeDao d = (EmployeeDao) applicationContext.getBean("dao");
        Employee e = new Employee();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("********Employee Details Using Hibernate Templates***********");
        do {
            System.out.println("Enter choice: \n1.Insert\n2.Update\n3.Delete\n4.Fetch\n5.Exit");
            int ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    System.out.println("Enter Employee name,salary");
                    e = new Employee();
                   // e.setId(Integer.parseInt(br.readLine()));
                    e.setEname(br.readLine());
                    e.setSalary(Float.parseFloat(br.readLine()));
                    d.insertEmp(e);
                    System.out.println("done successfully");
                    break;
                case 2:
                    System.out.println("Enter employee id and salary::");
                    int n = Integer.parseInt(br.readLine());
                    Float s = Float.valueOf(br.readLine());
                    d.updateEmp(n,s);
                    System.out.println("Updated record successfully");
                    break;

                case 3:
                    System.out.println("Enter record to be deleted");
                    int n1 = Integer.parseInt((br.readLine()));
                    d.deleteEmp(n1);
                    System.out.println("Record deleted successfully");

                case 4:
                    d.fetchEmp().forEach(System.out::println);

                    break;

                case 5:
                    System.out.println("Have a wonderful day !!!");
                    System.exit(0);

                    break;


            }

        }while (true);
    }
}

