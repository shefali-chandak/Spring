package com.example.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbc.model.Book;
import com.example.jdbc.services.BookService;

@RestController
@RequestMapping("/")
public class BookController {
	
	@Autowired
	private BookService bookService;

	//insert=>PostMapping
	@PostMapping("/save")
	public String saveController(@RequestBody Book b) {
		int i = bookService.insertBook(b);
		if(i>0) {
			return "Record Added Successfully";
		}
		else {
			return "Try again";
		}
	}
	
	@PutMapping(path="update/{bookName}/{price}")
	public String updateContoller(@PathVariable String bookName, @PathVariable float price) {
		int i = bookService.updateBook(bookName,price);
		if(i>0) {
			return "Record Updated Successfully";
		}
		else {
			return "Try again";
		}
	}
	
	@DeleteMapping(path="delete/{id}")
	public String deleteController(@PathVariable int id) {
		bookService.deleteBook(id);
		return "Data deleted successfully";
	}
	
	@GetMapping(path="getAllBooks")
	public List<Book> fetchController(){
		return bookService.getAllBooks();
	}
}
