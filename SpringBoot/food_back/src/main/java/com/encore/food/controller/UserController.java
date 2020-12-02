package com.encore.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encore.food.domain.UserDTO;
import com.encore.food.service.UserService;

@RestController
@RequestMapping("food")
@CrossOrigin(origins={"*"}, maxAge=6000)
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/registerUser")
	public ResponseEntity<Object> registerUser(@RequestBody UserDTO userDTO) throws Exception{
		boolean result = userService.registerUser(userDTO);
		if(!result) return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		else return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/idCheck/{id}")
	public ResponseEntity idCheck(@PathVariable String id) throws Exception{
		return new ResponseEntity(userService.idCheck(id), HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody UserDTO userDTO) throws Exception{
		UserDTO loginUser = userService.login(userDTO);
		if(loginUser != null) {
			return new ResponseEntity<UserDTO>(loginUser, HttpStatus.OK);
		}else return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
}
