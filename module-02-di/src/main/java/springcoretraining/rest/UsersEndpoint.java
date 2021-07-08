package springcoretraining.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springcoretraining.user.User;
import springcoretraining.user.UserRepository;

import java.util.List;

@RestController
public class UsersEndpoint {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private String someText;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    @GetMapping("/string")
    public String getString() {
        return someText;
    }
}