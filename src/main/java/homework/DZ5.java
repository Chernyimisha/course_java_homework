package homework;

import java.util.*;
import java.util.stream.Collectors;

public class DZ5 {
    public static void main(String[] args) {
        //task1();
        //task2();
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

        List<String> employeeList = List.of(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, List<String>> phoneBook = new HashMap<>();
        createPhoneBook(employeeList, phoneBook);
        Scanner in = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.println("Введите" +
                    " 1 - для вывода на печать телефонной книги," +
                    " 2 - для добавления/удаления номера телефона," +
                    " 0 - для выхода из меню: ");

            number = in.nextInt();

            if (number == 1) printPhoneBook(phoneBook);
            else if (number == 2) addDelNumberPhoneBook(phoneBook);
            else if (number == 0) break;
            else System.out.println("Введен некорректный признак операции");
        }
    }


    private static void addDelNumberPhoneBook(Map<String, List<String>> map) {
        Scanner iScannerStr = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String employee = "";
        String numberPhone = "";
        String number = "";
        int numberDelete = 0;
        while (true) {
            System.out.println("Введите фамилию, имя сотрудника. Для выхода из меню введите <0>:");
            employee = iScannerStr.nextLine();
            if (Objects.equals(employee, "0")) break;
            else if (map.containsKey(employee)) {
                System.out.println("Введите <1> для добавления номера телефона" +
                        " <2> - для удаления номера телефона: ");
                number = iScannerStr.nextLine();
                if (Objects.equals(number, "1")) {
                    System.out.println("Введите номер телефона сотрудника: ");
                    numberPhone = iScannerStr.nextLine();
                    map.get(employee).add(numberPhone);
                } else if (Objects.equals(number, "2")) {
                    System.out.printf("%s\t->\t%s%n", employee, String.join(", ", map.get(employee)));
                    System.out.println("Введите порядковый номер телефона для удаления (например, 1, 2, 3 и т.д.): ");
                    numberDelete = in.nextInt();
                    numberPhone = map.get(employee).get(numberDelete-1);
                    map.get(employee).remove(numberDelete - 1);
                    System.out.printf("%s успешно удален из книги\n", numberPhone);
                } else System.out.println("Введен некорректный признак операции");
            } else System.out.println("Такого сотрудника нет в списках!");
        }
    }

    private static void printPhoneBook(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!entry.getValue().isEmpty())
                System.out.printf("%s\t->\t%s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }

    private static void createPhoneBook(List<String> list, Map<String, List<String>> map) {
        for (String item : list) {
            map.put(item, new ArrayList<>());
        }
    }

    private static void task2() {
//  2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
        List<String> namesList = List.of(
                "Иван", "Светлана", "Кристина", "Анна", "Анна", "Иван", "Петр", "Павел", "Петр", "Мария",
                "Марина", "Мария", "Мария", "Марина", "Анна", "Иван", "Петр", "Иван", "Анна", "Иван", "Петр", "Павел"
        );
        Map<String, Integer> namesMap= new HashMap<>();
        countNamesInMap(namesList, namesMap);
        System.out.println(namesMap);
        sortedPrintMap(namesMap);

    }

    private static void sortedPrintMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        for (String key : sortedMap.keySet()) {
            System.out.printf("%s\t->\t%s%n", key, sortedMap.get(key));
        }
    }


    private static void countNamesInMap(List<String> list, Map<String, Integer> map) {
        int count = 1;
        for (String item: list){
            if (!map.containsKey(item)){
                map.put(item, count);
            } else{
                count = map.get(item);
                map.put(item, count+1);
                count = 1;
            }
        }
    }

    private static void task3() {
//  3**. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга (обратите внимание на алгоритм backtracking(поиск с возвратом)).
        int[] queens = new int[8];
        findPosition(0, queens);

        // Вывод доски в консоль
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("X\t");
                } else {
                    System.out.print("o\t");
                }
            }
            System.out.println();
        }
    }

    // Функция для поиска расстановки ферзей
    private static boolean findPosition(int row, int[] queens) {
        if (row == 8) { // Если удалось расставить всех 8 ферзей, вернуть true
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                // Проверка на наличие конфликта по вертикали, диагонали и антидиагонали
                if (queens[i] == col || queens[i] == col - row + i || queens[i] == col + row - i) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                queens[row] = col; // Сохранить расстановку ферзя в массив
                if (findPosition(row + 1, queens)) { // Рекурсивный вызов для следующего ряда
                    return true;
                }
            }
        }
        return false;
    }
}


