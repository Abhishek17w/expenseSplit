package com.expenseSplit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expenseSplit.demo.entity.User;
import com.expenseSplit.demo.service.UserService;

@RestController
public class ExpenseController {
	
	@Autowired
    UserService userService;
	
	 @PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		userService.createUser(user);
		return user;
	}
}
