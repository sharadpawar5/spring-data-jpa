package com.sp.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public void save(Book book){
		this.bookRepository.save(book);
	}
}
