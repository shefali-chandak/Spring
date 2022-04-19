package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ProductDao productDao = (ProductDao) applicationContext.getBean("dao");
        Product p;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("********Product Details Using Hibernate Templates***********");
        do {
            System.out.println("Enter choice: \n1.Insert\n2.Update\n3.Delete\n4.Fetch\n5.Exit");
            int ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    productDao.insertProduct();
                    System.out.println("Record inserted successfully");
                    break;
                case 2:
                    productDao.updateProduct();
                    System.out.println("record updated successfully");
                    break;
                case 3:
                    productDao.deleteProduct();
                    System.out.println("Record deleted successfully");
                    break;
                case 4:
                    productDao.fetchProduct().forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Have a wonderful day !!!");
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}