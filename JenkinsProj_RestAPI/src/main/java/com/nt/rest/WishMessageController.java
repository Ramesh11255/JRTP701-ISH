package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WishMessageController {

	@GetMapping("/wish")
	public ResponseEntity<String> showWishMessage(){
		return new ResponseEntity<String>("Hi ramesh Good Morning", HttpStatus.OK);
	}
}
