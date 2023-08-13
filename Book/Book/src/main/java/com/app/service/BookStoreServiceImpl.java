package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.entities.BookStore;
import com.app.repository.BookStoreRepository;

@Service
@Transactional
public class BookStoreServiceImpl implements  BookStoreService {
	
	@Autowired
	private BookStoreRepository bookrepo;

	@Override
	public List<BookStore> getAllBooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

	@Override
	public ApiResponse addBookDetail(BookStore transientBook) {
		String msg="Adding Book Failed";
		BookStore book=bookrepo.save(transientBook);
		if(book != null)
		{
			msg="Book added Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse updateBook(Long id, BookStore detachedBook) {
		String msg="Updating  Book  Failed";
		BookStore book=bookrepo.save(detachedBook);
		if(book != null)
		{
			msg="Book details updated Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public String removeBook(Long id) {
		String mesg="Id invalid cannot delete record";
		if(bookrepo.existsById(id))
		{
			bookrepo.deleteById(id);
			mesg="Deleted Successfully";
		}
		
		return mesg;
	
	}

	@Override
	public BookStore getBookById(Long id) {
		// TODO Auto-generated method stub
		return bookrepo.findById(id).orElseThrow(null);
	}
	
	
}
