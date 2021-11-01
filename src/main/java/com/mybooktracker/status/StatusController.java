package com.mybooktracker.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {
	
	@GetMapping("/")
	public StatusDTO getStatus() {
		StatusDTO result = new StatusDTO();
		result.setManga("Roman");
		return result;
		
		
	}

}
