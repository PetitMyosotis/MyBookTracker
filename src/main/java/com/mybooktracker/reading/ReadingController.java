package com.mybooktracker.reading;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reading")
public class ReadingController {

	@GetMapping("/")
	public ReadingDTO setReading() {
		ReadingDTO result = new ReadingDTO();
		result.setNumberOfPages(45);
		result.setDate(null);
		return result;
		
	}

}
