package org.baeldung.reactweb.controller;

import org.baeldung.reactweb.model.User;
import org.baeldung.reactweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/user/events")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	Flux<User> getUser(){
		return userService.getUserDetails();
		
	}
}
