package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("book");
        Book book = new Book();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter choice: \n1.Insert\n2.Update\n3.Delete\n4.Fetch All\n5.Fetch By Criteria\n6.fetchByLike\n7.fetch By Range\n8.Exit");
            int choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice){
                case 1:
                    System.out.println("Enter book id, book name, author name and price");
                    book.setBookName(bufferedReader.readLine());
                    book.setAuthorName(bufferedReader.readLine());
                    book.setPrice(Float.valueOf(bufferedReader.readLine()));
                    int i = bookDao.insertRecord(book);
                    System.out.println("Data inserted");
                    break;

                case 2:
                    System.out.println("Enter bookName and price to be updated : ");
                    String bookName = bufferedReader.readLine();
                    float price = Float.valueOf(bufferedReader.readLine());
                    bookDao.updateRecord(bookName,price);
                    System.out.println("Data updated");
                    break;

                case 3:
                    System.out.println("Enter bid to be deleted : ");
                    int bid = Integer.parseInt(bufferedReader.readLine());
                    bookDao.deleteRecord(bid);
                    System.out.println("Data deleted");
                    break;
                case 4:
                    List<Book> l = bookDao.fetchRecordsMapper();
                    for (Book b : l){
                        System.out.println(b);
                    }
                    break;
                case 5:
                    System.out.println("Enter bid : ");
                    int bid1 = Integer.parseInt(bufferedReader.readLine());
                    List<Book> list = bookDao.fetchByCriteria(bid1);
                    for (Book b : list){
                        System.out.println(b);
                    }
                    break;
                case 6:
                    List<Book> list2 = bookDao.fetchByLike();
                    for (Book b : list2){
                        System.out.println(b);
                    }
                    break;
                case 7:
                    int begin = Integer.parseInt(bufferedReader.readLine());
                    int end = Integer.parseInt(bufferedReader.readLine());
                    List<Book> list3 = bookDao.fetchByRange(begin,end);
                    for (Book b : list3){
                        System.out.println(b);
                    }
                    break;
                case 8:
                    System.out.println("THANKYOU!!!");
                    System.exit(0);
                    break;
             }
        }while (true);

    }
}
