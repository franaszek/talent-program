package springcoretraining.user;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserRepositoryCacheXml implements UserRepository {

    private List<User> users = Arrays.asList(new User("Jan", "Kowalski", 24));

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(String firstName, String lastName, int age) {
        users.add(new User(firstName, lastName, age));
    }
}
