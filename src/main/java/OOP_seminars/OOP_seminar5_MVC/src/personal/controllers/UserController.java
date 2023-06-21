package OOP_seminars.OOP_seminar5_MVC.src.personal.controllers;

import OOP_seminars.OOP_seminar5_MVC.src.personal.model.Repository;
import OOP_seminars.OOP_seminar5_MVC.src.personal.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> readAllUsers(){
        return repository.getAllUsers();
    }
}
