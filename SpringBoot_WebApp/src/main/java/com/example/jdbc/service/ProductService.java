package com.example.jdbc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.jdbc.model.Product;
import com.example.jdbc.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository pr;
	
	//insertion
	public void insert(Product p) {
		pr.save(p); //jpa repository
	}
	
	//update/edit
	public Product getProduct(int id) {
		return pr.getById(id);
	}
	
	public List<Product> getAllProducts(){
		List<Product> l =pr.findAll();
		for(Product p : l) {
			System.out.println(p);
		}
		return l;
	}
	
	public void delete(int id) {
		pr.deleteById(id);
	}
	
	
	public List<Product> fetchsort(){
    	return pr.findAll(Sort.by("price"));
    }
    public Page<Product> fetchPagination(int off,int pageSize){
    	return pr.findAll(PageRequest.of(off, pageSize));
    }
}
