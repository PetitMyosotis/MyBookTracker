package com.mybooktracker.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@GetMapping("/")
	public BookDTO getBook() {
		BookDTO result = new BookDTO() ;
		result.setAuthor(null);
		result.setTitle("Les Misérables");
		result.setNumberOfPages(2598);
		result.setReading(null);
		result.setType(null);
		return result;
	}

}
