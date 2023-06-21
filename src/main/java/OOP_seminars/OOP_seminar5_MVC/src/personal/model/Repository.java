package OOP_seminars.OOP_seminar5_MVC.src.personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
}
