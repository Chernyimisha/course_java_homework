package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.util.Collections.list;


public class MainClassFromLessonTwo {
    public static void main(String[] args) {
        // Даны буквы A, B и число n. Написать метод, который сформирует строку с чередованием данных букв по-очереди
        // с n-количеством букв.
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Введите число n: ");
//        int n = myScanner.nextInt();
//
//        stringCreate(n);
        task5vorkInFile("M:\\РАБОТА МИША\\Курс Python\\java_seminars\\java-practic20230413");
//        System.out.print("Введите строку из латинских букв без пробелов: ");
//        String str = myScanner.nextLine();
//        System.out.println(str);
//        stringCompress(str);

    }

    private static void stringCompress(String letter) {
        //сжать строку "faaaabbbcdd", чтоюы было "a4b3cd2"

        //ВАРИАНТ ЧЕРЕЗ МАССИВ (МОЙ ВАРИАНТ)

//        StringBuilder result = new StringBuilder();
//        int temp = 1;
//        String[] arr_char = letter.split("");
//        for (int i = 1; i < arr_char.length; i++) {
//            if (Objects.equals(arr_char[i], arr_char[i - 1])){
//                temp++;
//            }
//            else if (temp != 1){
//                result.append(arr_char[i - 1]).append(temp);
//                temp = 1;
//            }
//            else {
//                    result.append(arr_char[i - 1]);
//                    temp = 1;
//                }
//        }
//        result.append(arr_char[arr_char.length-1]).append(temp);
//        System.out.println(result);


        //ВАРИАНТ БЕЗ МАССИВА (МОЙ ВАРИАНТ)

//        String result = "";
//        int count = 1;
//        for (int i = 1; i < letter.length(); i++) {
//            if (letter.charAt(i) == letter.charAt(i - 1)) count++;
//            else if (count != 1) {
//                result += Character.toString(letter.charAt(i - 1)) + count;
//                count = 1;
//            } else {
//                result += Character.toString(letter.charAt(i - 1));
//                count = 1;
//            }
//        }
//        result += Character.toString(letter.charAt(letter.length() - 1)) + count;
//        System.out.println(result);

        //ВАРИАНТ БЕЗ МАССИВА (МОЙ ВАРИАНТ С ОПТИМИЗАЦИЕЙ ПРЕПОДАВАТЕЛЯ)

        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < letter.length(); i++) {
            if (letter.charAt(i) != letter.charAt(i - 1)){
                result.append(letter.charAt(i - 1));
                if (count!=1){
                    result.append(count);
                    count = 1;
                }
            }
            else count++;
        }
        result.append(letter.charAt(letter.length() - 1)).append(count);
        System.out.println(result);
    }


    private static void stringCreate(int number) {

        // РЕШЕНИЕ С ПРОСТЫМ ЦИКЛОМ

//        String result = "";
//
//        for (int i = 0; i < number; i++) {
//            if (i % 2 == 0) result += "A";
//            else result += "B";
//        }
//        System.out.println(result);

        // РЕШЕНИЕ С СТРИНГБИЛДЕРОМ

//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < number; i++) {
//            if (i % 2 == 0) result.append("A");
//            else result.append("B");
//        }
//        System.out.println(result);

        // РЕШЕНИЕ ЧЕРЕЗ МЕТОД REPEAT

        char a = 'A';
        char b = 'B';
        String str = "" + a + b;
        str = str.repeat(number/2) + ((number%2 == 1) ? a : "");
        System.out.println(str);
    }

    private static void task5vorkInFile(String pathDir) {
        File file = new File(pathDir);//привязываем файл к нашему коду
        if (!((file.exists()) || file.isDirectory())){//проверяем есть ли этот файл или является ли он директорией
            return;//просто выходим из метода
        }
        StringBuilder sb = new StringBuilder();
        for (String fileName : file.list()){
            sb.append(fileName).append(System.lineSeparator());
        }
        System.out.println(sb);

        try(PrintWriter pw = new PrintWriter("src/main/resources/files/filesNames.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

}
