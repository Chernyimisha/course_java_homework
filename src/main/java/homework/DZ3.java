package homework;

import java.util.*;


public class DZ3 {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    private static void task1() {

//        1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
//        Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}

        List<String> list = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.println(list);
        String elem = "";

        for (int i = 0; i < list.size(); i++) {
            elem = list.get(i);
            if (elem.matches("\\d+||-?\\d+||")) {

                list.remove(i);
                i--;
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static void task2() {
//       2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на
//          0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//          Напишите метод для заполнения данной структуры(можно через консоль).
//                Пример:
//       "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
//       "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
//        "Детектив", "Десять негритят".
//        "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".

        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        Scanner iScannerInt = new Scanner(System.in);
        Scanner iScannerStr = new Scanner(System.in);

        int number = 1;
        String temp = "";
        int posGenre = 0;

        while (number != 0) {
            System.out.println("Введите признак операции (1 - для ввода наименования жанра, 2 - для ввода названия книги, 0 - для выхода из меню): ");
            number = iScannerInt.nextInt();

            if (number == 1) {
                System.out.println("Введите наименование жанра: ");
                temp = iScannerStr.nextLine();
                int listSize = list.size();
                if (list.size() == 0) {
                    list.add(new ArrayList<String>());
                    list.get(0).add(temp);
                } else {
                    if (!checkElem(list, temp)) {
                        list.add(new ArrayList<String>());
                        list.get(listSize).add(temp);
                    }
                }
            } else if (number == 2) {
                System.out.println("Введите наименование жанра: ");
                temp = iScannerStr.nextLine();
                if (checkElem(list, temp)){
                    while (!Objects.equals(temp, "0")) {
                        posGenre = searchPosGenre(list, temp);
                        System.out.println("Введите название книги (для выхода из меню нажмите <0>): ");
                        temp = iScannerStr.nextLine();
                        if (list.size() == 0) {
                            System.out.println("Сначала необходимо зарегистрировать наименование жанра!");
                            break;
                        } else if (!Objects.equals(temp, "0")) {
                            if (!checkElem(list, temp)) {
                                list.get(posGenre).add(temp);
                            }
                        }
                    }
                } else System.out.println("Сначала необходимо зарегистрировать наименование жанра!");
            } else if ( number != 0) System.out.println("Введен некорректный признак операции!");
        }
        print2DArrayList(list);
    }

    private static int searchPosGenre(ArrayList<ArrayList<String>> x, String str) {
        int result = 0;
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).contains(str)) result = i;
        }
        return result;
    }

    private static boolean checkElem(ArrayList<ArrayList<String>> x, String str) {
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).contains(str)) return true;
        }
        return false;
    }

    private static void print2DArrayList(ArrayList<ArrayList<String>> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.printf("\n");
            for (int j = 0; j < x.get(i).size(); j++) {
                if (j == x.get(i).size() - 1) {
                    System.out.printf("'%s'.", x.get(i).get(j));
                } else System.out.printf("'%s', ", x.get(i).get(j));
            }
        }
    }

}
