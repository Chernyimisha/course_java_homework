package OOP_seminars.OOP_seminar5_MVC.src.personal.views;

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
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private void readList() {
        List<User> userList = userController.readAllUsers();
        for (User u: userList) {
            System.out.println(u);
        }
    }

    private void readUser() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user = userController.readUser(id);
        System.out.println(user);
    }

    private void createUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
