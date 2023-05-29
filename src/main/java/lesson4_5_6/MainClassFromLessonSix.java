package lesson4_5_6;

import java.util.*;

public class MainClassFromLessonSix {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
    }

    private static void ex5() {
//        Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//        а) информационной системой ветеринарной клиники
//        б) архивом выставки котов
//        в) информационной системой Театра кошек Ю. Д. Куклачёва
//        Можно записать в текстовом виде, необязательно реализовывать в java.
        Cat cat = new Cat(2, "Vasya", "persian", true);
        System.out.println(cat.toString());

        Cat cat1 = new Cat(5, "Masha", "persian", false);
        System.out.println(cat1.toString());

        Cat cat2 = new Cat(2, "Vasya", "persian", true);
        System.out.println(cat2.toString());

        VetCat cat3 = new VetCat(2, "Victor", "persian", true,  "blanc", false);
        System.out.println(cat3.toString());

        ShowCat cat4 = new ShowCat(3, "Bazilio", "persian", true, 1, "champion");
        System.out.println(cat4.toString());

        TheatreCat cat5 = new TheatreCat(4, "Vasya", "persian", true, 1, "high jump");
        System.out.println(cat5.toString());

        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        System.out.println(cats);

    }

    private static void ex4() {
//        Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//        Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
//        значений в данном массиве и верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

        int[] array = new int[1000];

        array = getArray(array);
        double result = countProcentUniqueValues(array);
        System.out.printf("%f", result);
    }

    private static double countProcentUniqueValues(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array){
            set.add(i);
        }
        return set.size() * 100.0 / array.length;
    }

    private static int[] getArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(24);
        }
        return arr;
    }

    private static void ex3() {
//        Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//        Распечатайте содержимое данного множества.
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);
        for (Object item: set) {
            System.out.print(item + " ");//негарантированно выдает элементы по порядку
        }
    }

    private static void ex2() {
//        Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//        Распечатайте содержимое данного множества.
        Set<Integer> linkedSet = new LinkedHashSet<>(Arrays.asList(1, 3, 2, 3, 2, 4, 5, 6, 3));
        for (Object item: linkedSet) {
            System.out.print(item + " ");//запоминает порядок элементов в том порядке в котором они туда попали
        }
    }

    private static void ex1() {
//        Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//        Распечатайте содержимое данного множества.
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 3, 2, 3, 2, 4, 5, 6, 3));
        for (Object item: treeSet) {
            System.out.print(item + " ");//гарантированно будет выдавать элементы по порядку
        }
    }
}
