package OOP_seminars.OOP_seminar5_MVC.src.personal.views;

import OOP_seminars.OOP_seminar5_MVC.src.personal.model.NameAndSurnameValidator;
import OOP_seminars.OOP_seminar5_MVC.src.personal.model.User;
import OOP_seminars.OOP_seminar5_MVC.src.personal.controllers.UserController;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        readList();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case DELETE:
                        deleteUser();
                        break;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteUser() throws Exception {
        readList();
        User user = getUser();
        userController.deleteUser(user);
    }

    private void updateUser() throws Exception {
        readList();
        User user = getUser();
        User updatedUser = getNewUser();
        updatedUser.setId(user.getId());
        User savedUser = userController.updateUser(updatedUser);
        System.out.println(savedUser);
    }

    private void readList() {
        List<User> userList = userController.readAllUsers();
        for (User u: userList) {
            System.out.println(u);
        }
    }

    private void readUser() throws Exception {
        User user = getUser();
        System.out.println(user);
    }

    private User getUser() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user = userController.readUser(id);
        return user;
    }

    private void createUser() throws Exception{
        User user = getNewUser();
        userController.saveUser(user);
    }


    private User getNewUser() throws Exception{
        String firstName = prompt("Имя: ");
        new NameAndSurnameValidator(firstName).validate();
        String lastName = prompt("Фамилия: ");
        new NameAndSurnameValidator(lastName).validate();
        String phone = prompt("Номер телефона: ");
        User user = new User(firstName, lastName, phone);
        return user;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
