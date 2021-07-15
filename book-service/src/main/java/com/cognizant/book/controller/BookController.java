package com.cognizant.book.controller;

import java.util.List;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.cognizant.book.entity.Book;
@RestController
@RequestMapping("/book")
public class BookController {

 private static final Book[] books = {
		 new Book(1, "JavaCICD" ," James",2000),
		 new Book(1, "Angular" ," Gini",300)
 };
	
	@GetMapping(produces = MediaType.APPLICATION_JSON)
	public Book[] getAllBooks()
	{	return books;	}
	
	
}
