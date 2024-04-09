package in.asterisc.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.asterisc.model.User;
import in.asterisc.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = userService.createUser(user);
        return ResponseEntity.created(URI.create("/users/" + newUser.getId())).body(newUser);
    }
	
	@GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		 return userService.getUserById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
	     User updatedUser = userService.updateUser(id, userDetails);
	     return ResponseEntity.ok(updatedUser);
	 }

	/*@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	       return ResponseEntity.noContent().build();
	  }*/


}
