package com.bookStore.Controller;


import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;


@RestController
public class BookController {
	
	
	@Autowired
	private BookRepository bookRepository;
	
	
	@PostMapping("/add")
	public Book addProducts(@RequestBody Book book) {
		
		return bookRepository.save(book);
		
	}
	
	
	@GetMapping("/allbooks")
	public 	List<Book> getAllUsers(){
		
		return bookRepository.findAll();
		
	}
	
	@GetMapping("/getbook/{id}")
	public Book getBook(@PathVariable long id) {
	    return bookRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
	}
	//hbasjsbjjb

}
