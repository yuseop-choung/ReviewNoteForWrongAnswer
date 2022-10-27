package com.yuseop.review_note.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewControllerTest {
	
	@GetMapping("/test/hello")
	public String Hello() {
		return "<h1> Hello World!</h1>";
	}
}
