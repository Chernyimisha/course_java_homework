package lesson3;

import java.util.*;

;

public class MainClassFromLessonThree {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    private static void ex2() {
        String[] planets = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        List<String> list = new ArrayList<>();
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 100; i++) {
            list.add(planets[random.nextInt((planets.length))]);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        String temp = list.get(0);
        for (String item : list) {
            if (item == temp) {
                count++;
            } else {
                System.out.printf("%s : %d\n", temp, count);
                count = 0;
                temp = item;
            }
        }
        System.out.printf("%s : %d\n", temp, count);

        temp = list.get(0);

        //блок кода описывающего удаление повторяющихся элементов.

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != temp){
                temp = list.get(i);
            }
            else{
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    private static void ex1() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        list.sort(Comparator.naturalOrder());
        //Collection.sort(list, Comparator.reverseOrder());

        int temp = list.get(0);

        System.out.println(list);

        //блок кода описывающего удаление повторяющихся элементов.

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != temp){
                temp = list.get(i);
            }
            else{
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
