package com.user.controller;

import com.user.model.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/home")
	public String Home() {
		return "Hello world";
	}
	
	@PostMapping("/add")
	public ResponseEntity<User> add(@RequestBody User user) {
		User user1 = userService.save(user); 
		
		return  ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	@GetMapping("/all")
	public List<User> gelall() {
		return  userService.getAlluser();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getByID(@PathVariable int id) {
		User getbyId = userService.getbyId(id);
//		String url = "http://localhost:9092/rating/user/"+id;
//		ResponseEntity<Object> forEntity = this.restTemplate.getForEntity(url,Object.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(getbyId);

	}
	
	@DeleteMapping("/deletebyid/{id}")
	public Object deletebyid(@PathVariable int id) {
		return userService.deletebyId(id);
	}
	
	
}
