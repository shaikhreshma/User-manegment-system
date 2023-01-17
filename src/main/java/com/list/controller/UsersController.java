package com.list.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.list.UserRepository.UsersRepository;
import com.list.entity.Users;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsersController {
@Autowired
private UsersRepository useRepo;

@PostMapping("/Users")
void saveUsers(@RequestBody Users users) {
	 useRepo.save(users);
}
@GetMapping("/Users")
public List<Users>fetchUsersList(){
	return (List<Users>)useRepo.findAll();
}

}
