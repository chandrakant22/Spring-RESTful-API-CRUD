package in.asterisc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.asterisc.model.User;
import in.asterisc.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;

	//Create
	public User createUser(User user) {
        return userRepository.save(user);
    }
    
	//GetAll
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //GetOneUser 
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    
//  public Optional<User> getUserById(Long id) {
//      return userRepository.findById(id);
//  }

    public User updateUser(Long id, User u) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));

        user.setName(u.getName());
        user.setEmail(u.getEmail());

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
    userRepository.deleteById(id);
    }
}
    
    



