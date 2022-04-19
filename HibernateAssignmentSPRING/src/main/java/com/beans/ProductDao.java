package com.beans;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Transactional
public class ProductDao {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public String toString() {
        return "ProductDao{" +
                "hibernateTemplate=" + hibernateTemplate +
                '}';
    }

    public void insertProduct() throws IOException {
        Product product=new Product();
        System.out.println("Enter product name, brand name and price: ");
        product.setProduct_name(bufferedReader.readLine());
        product.setBrand_name(bufferedReader.readLine());
        product.setPrice(Float.parseFloat(bufferedReader.readLine()));
        hibernateTemplate.save(product);
    }

    public void updateProduct() throws IOException {
        System.out.println("Enter field to be updated:\n1.product_name\n2.brand_name\n3.price");
        int s = Integer.parseInt(bufferedReader.readLine());
        switch (s){
            case 1:
                System.out.println("Enter product id and product_name::");
                int id = Integer.parseInt(bufferedReader.readLine());
                String pn = bufferedReader.readLine();
                hibernateTemplate.bulkUpdate("update Product SET product_name='"+pn+"' where id='"+id+"'");
                break;
            case 2:
                System.out.println("Enter product id and brand_name::");
                id = Integer.parseInt(bufferedReader.readLine());
                String bn = bufferedReader.readLine();
                hibernateTemplate.bulkUpdate("update Product SET brand_name='"+bn+"' where id='"+id+"'");
                break;
            case 3:
                System.out.println("Enter product id and price::");
                id = Integer.parseInt(bufferedReader.readLine());
                float price = Float.valueOf(bufferedReader.readLine());
                hibernateTemplate.bulkUpdate("update Product SET price='"+price+"' where id='"+id+"'");
                break;
            default:
                System.out.println("Enter proper option");
        }
    }

    public  int deleteProduct() throws IOException {
        System.out.println("Enter product id to be deleted::");
        int id = Integer.parseInt(bufferedReader.readLine());
        return hibernateTemplate.bulkUpdate("delete from Product where id='"+id+"'");

    }
    public List<Product> fetchProduct(){
        return hibernateTemplate.loadAll(Product.class);
    }
}
