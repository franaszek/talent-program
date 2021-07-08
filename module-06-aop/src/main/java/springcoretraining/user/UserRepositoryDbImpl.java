package springcoretraining.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryDbImpl implements UserRepository {

    private final List<User> users = new ArrayList<>();

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(String firstName, String lastName, int age) {
        users.add(new User(firstName, lastName, age));
    }
}
