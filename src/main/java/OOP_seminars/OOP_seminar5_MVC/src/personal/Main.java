package OOP_seminars.OOP_seminar5_MVC.src.personal;

import OOP_seminars.OOP_seminar5_MVC.src.personal.controllers.UserController;
import OOP_seminars.OOP_seminar5_MVC.src.personal.model.FileOperation;
import OOP_seminars.OOP_seminar5_MVC.src.personal.model.FileOperationImpl;
import OOP_seminars.OOP_seminar5_MVC.src.personal.model.Repository;
import OOP_seminars.OOP_seminar5_MVC.src.personal.model.RepositoryFile;
import OOP_seminars.OOP_seminar5_MVC.src.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
