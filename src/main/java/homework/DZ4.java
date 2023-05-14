package homework;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    private static void task2() {
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");

        reverseList(wordsList);
        System.out.println(wordsList);
    }

    private static void reverseList(LinkedList<String> list) {
        int pos = 0;
        String temp = "";

        while (pos < list.size()){
            temp = list.pollLast();
            list.add(pos, temp);
            pos++;
        }
    }

    private static void task1() {
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

        Scanner in = new Scanner(System.in);
        ArrayDeque<String> str = new ArrayDeque<String>();
        String inputStr = "";

        while (true){
            System.out.println();
            System.out.print("Введите строку: ");
            inputStr = in.nextLine();

            if(inputStr.equalsIgnoreCase("print")) System.out.println(str);
            else if (inputStr.equalsIgnoreCase("revert")) str.removeFirst();
            else if (inputStr.equalsIgnoreCase("exit")) break;
            else str.addFirst(inputStr);
        }
    }
}
