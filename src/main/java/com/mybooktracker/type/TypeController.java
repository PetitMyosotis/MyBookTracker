package com.mybooktracker.type;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/type")
public class TypeController {

	@GetMapping("/")
	public TypeDTO getType() {
		TypeDTO result = new TypeDTO();
		result.setFinish("finish");
		return null;
		
		
	}

}
