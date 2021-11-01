package com.mybooktracker.author;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
	
	@GetMapping("/")
	public AuthorDTO getAuthor() {
		AuthorDTO result = new AuthorDTO() ;
		result.setLastName("Hugo");
		result.setFirstName("Victor");
		result.setNationality("Français");
		return result;
	}
}
