package springcoretraining.user;

import java.util.List;

public interface UserRepository {
    List<User> getUsers();

    public void addUser(String firstName, String lastName, int age);
}
