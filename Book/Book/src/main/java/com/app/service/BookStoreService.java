package com.app.service;

import java.util.List;


import com.app.dto.ApiResponse;
import com.app.entities.BookStore;


public interface BookStoreService {
	
	//get
	List<BookStore> getAllBooks();

	//add
	ApiResponse addBookDetail(BookStore transientBook);

	//update
	ApiResponse updateBook(Long id, BookStore detachedBook);
	
	//delete by id
	String removeBook(Long id);

	//get Book by id
	BookStore getBookById(Long id);
	
	

}
