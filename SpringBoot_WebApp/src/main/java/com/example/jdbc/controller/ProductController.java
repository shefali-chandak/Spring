package com.example.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.jdbc.model.Product;
import com.example.jdbc.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	@RequestMapping(path="/addproducts")
	public String show_Add_product_Page_Controller(Model m) {
		Product p = new Product();
		m.addAttribute("pro", p);
		return "add_product";
	}
	
	//open index.html as home page
	@RequestMapping(path="/")
	public String show_index_Page_Controller(Model m) {
		List<Product> l =ps.getAllProducts();
		m.addAttribute("p1", l);
		return "index"; //index.html
	}
	
	@RequestMapping(path="/save" ,method=RequestMethod.GET)
	public String insert_Controller(@ModelAttribute("pro") Product p ) {
		ps.insert(p);
		return "redirect:/";
	}
	
	@RequestMapping(path="edit/{id}")
	public ModelAndView showDetailsToEdit(@PathVariable(name="id") int id) {
		ModelAndView mav= new ModelAndView("edit_product");
		Product p = ps.getProduct(id);
		mav.addObject("pro", p);
		return mav;
	}
	
	@RequestMapping(path = "delete/{id}")
    public String delete_Controller(@PathVariable(name = "id") int id){
        ps.delete(id);
        return "redirect:/";
    }
	
	@RequestMapping(path = "sort")
    public String show_By_Sort(Model model) {
    	List<Product> product=ps.fetchsort();
    	model.addAttribute("p2", product);
    	return "sort";
    }
    
    @RequestMapping(path = "page")
    public String show_By_Page(Model model) {
    	int pageSize=5,off=0;
    	Page<Product> page=ps.fetchPagination(off, pageSize);
    	List<Product> product=page.getContent();
    	model.addAttribute("p3", product);
    	return "paging";
    }
}
