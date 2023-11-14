package org.bookmyshowproject.controller;

import org.bookmyshowproject.model.User;
import org.bookmyshowproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieticketbooking/user")
public class UserController {
	@Autowired
	public UserService userService;

	@PostMapping("/add")
	public User addNewUser(@RequestBody User user) {
		System.out.println("User Name :::: " + user.getName());
		return userService.addUser(user);
	}

	@GetMapping("/id")
	public void getUser(/* @RequestParam int id */) {
		System.out.println("In getUser");
		//return userService.getId(id);
	}

}
