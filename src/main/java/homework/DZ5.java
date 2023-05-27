package homework;

import java.util.*;

public class DZ5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
//  1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//     Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов

        ArrayList<String> phoneList = new ArrayList<>();
        Map<String, List<String>> phoneBook = new HashMap<>(20);

        phoneBook.put("Иван Иванов", phoneList);
        phoneBook.put("Анна Мусина", phoneList);
        phoneBook.put("Анна Крутова", phoneList);
        phoneBook.put("Иван Юрин", phoneList);
        phoneBook.put("Петр Лыков", phoneList);
        phoneBook.put("Павел Чернов", phoneList);
        phoneBook.put("Петр Чернышов", phoneList);
        phoneBook.put("Мария Федорова", phoneList);
        phoneBook.put("Марина Светлова", phoneList);
        phoneBook.put("Мария Савина", phoneList);
        phoneBook.put("Мария Рыкова", phoneList);
        phoneBook.put("Марина Лугова", phoneList);
        phoneBook.put("Анна Владимирова", phoneList);
        phoneBook.put("Иван Мечников", phoneList);
        phoneBook.put("Петр Петин", phoneList);
        phoneBook.put("Иван Ежов", phoneList);

        phoneBook.get("Петр Петин").add("8955959995");

        System.out.println(phoneBook);

        Scanner in = new Scanner(System.in);

//        while (true) {
//            System.out.println("Введите имя и фамилию сотрудника: ");
//            String inputEmployee = in.nextLine();
//            if(employeeList.contains(inputEmployee)){
//                System.out.println("Введите номер телефона: ");
//                String inputPhone = in.nextLine();
//
//                phoneList.add(inputPhone);
//                phoneBook.put(inputEmployee, phoneList);
//            }
//        }

    }

    private static void task2() {
//  2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.


    }

    private static void task3() {
//  3**. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга (обратите внимание на алгоритм backtracking(поиск с возвратом)).


    }
}


