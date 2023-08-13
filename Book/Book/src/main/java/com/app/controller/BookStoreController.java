package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.BookStore;
import com.app.service.BookStoreService;

@RestController
@RequestMapping("/bookstore")
public class BookStoreController {
	
	@Autowired
	private BookStoreService bookService;
	
	public BookStoreController() {
		System.out.println("in ctor of "+getClass());
	}
	
	@GetMapping
	public List<BookStore> showAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@PostMapping
	public ResponseEntity<?> addBook(@RequestBody BookStore transientBook)
	{
		return new ResponseEntity<>(bookService.addBookDetail(transientBook),HttpStatus.CREATED);
	}
	
	   @GetMapping("/{id}")
	    public BookStore getBusById(@PathVariable Long id) {
	        return bookService.getBookById(id);
	    }

	@PutMapping("/{id}")
	public ResponseEntity<?> updateBookStore(@PathVariable Long id, @RequestBody BookStore detachedBook)
	{
		return new ResponseEntity<>(bookService.updateBook(id,detachedBook),HttpStatus.CREATED);
	}
	
	
	
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable Long id)
	{
		return bookService.removeBook(id);
	}
	

}
