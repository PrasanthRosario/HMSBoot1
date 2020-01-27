package global.coda.hms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import global.coda.hms.model.UserRecord;
import global.coda.hms.service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/")
	public List<UserRecord> getAllUser(){
		return userService.getAllUsers();
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord){
		userService.addUser(userRecord);
	}
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public Optional<UserRecord> getUser(@PathVariable int id){
		return userService.getUser(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id){
		return userService.deleteUser(id);
	}
}