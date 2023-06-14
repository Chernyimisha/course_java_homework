package OOP_seminars.seminar_3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Programm {
    public static void main(String[] args) {

//        User user = new User("Прошкин", "Михаил", 38);
//        System.out.println(user);

        Personal personal = new Personal();
        personal.addUsers(new User("Прошкин", "Михаил", 38))
                .addUsers(new User("Прошкина", "Юлия", 38))
                .addUsers(new User("Фролов", "Павел", 23))
                .addUsers(new User("Маскаева", "Ирина", 44));

        Personal personal2 = new Personal();
        personal2.addUsers(new User("Таньков", "Дмитрий", 25));

        User user1 = new User("Попова", "Света", 22);
        user1.setSubordinate(personal);

        personal2.addUsers(user1);
        User boss = new User("Босс", "Большой", 56);



        for (User user: personal) {
            System.out.println(user);
        }

        for (int i = 0; i < personal.userList.size(); i++) {
            System.out.println(personal.userList.get(i));
        }

        List<User> user = personal.toList();
        Collections.sort(user);
        System.out.println("<<<<<<>>>>>>");
        System.out.println(user);

    }
}
