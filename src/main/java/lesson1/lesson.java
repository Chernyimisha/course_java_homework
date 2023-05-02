
package lesson1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class lesson {
    public static void main(String[] args) throws IOException {

        // ТИПЫ ДАННЫХ
        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = '2';
        System.out.println(Character.isDigit(ch)); // false

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        String msg = "Hello world";
        System.out.println(msg); // Hello world

        // НЕЯВНАЯ ТИПИЗАЦИЯ

        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456

        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double

        // ТИПЫ-ОБЕРТКИ

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        // ОДНОМЕРНЫЕ МАССИВЫ

        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr.length); // 5
        // МНОГОМЕРНЫЕ МАССИВЫ
        int[] arr1[] = new int[3][5];
        for (int[] line : arr1) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        int[][] arr2 = new int[3][5];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%d ", arr2[i][j]);
            }
            System.out.println();
        }
        // ПРЕОБРАЗОВАНИЯ

        int i = 123;
        double d5 = i;
        System.out.println(i); // 123
        System.out.println(d5); // 123.0
        d5 = 3.1415;
        i = (int) d5;
        System.out.println(d5); // 3.1415
        System.out.println(i); // 3
        d5 = 3.9415;
        i = (int) d5;
        System.out.println(d5); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
//        b = Byte.parseByte("1234");
//        System.out.println(b); // NumberFormatException: Value out of range

//        int[] i9 = new int[10];
//        double[] d = i9; // ИЗУЧАЕМ ковариантность и контравариантность

        // ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        //iScanner.close();

        // НЕКОТОРЫЕ ПРИМИТИВЫ

        //Scanner iScanner2 = new Scanner(System.in);
        System.out.print("int i2: ");
        int x = iScanner.nextInt();
        System.out.print("double i2: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        //iScanner.close();

        // ПРОВЕРКА НА СООТВЕТСТВИЕ ПОЛУЧАЕМОГО ТИПА
        //Scanner iScanner3 = new Scanner(System.in);
        System.out.print("int i2: ");
        boolean flag = iScanner.hasNextInt();// has позволяет не улететь программе в ошибку
        System.out.println(flag);
        int i1 = iScanner.nextInt();
        System.out.println(i1);
        iScanner.close();

        // ФОРМАТИРОВАННЫЙ ВЫВОД

        int a1 = 1, b1 = 2;
        int c = a1 + b1;
        String res = a1 + " + " + b1 + " = " + c;// КОНКАТЕНАЦИЯ СТРОК
        System.out.println(res);

        int a2 = 1, b2 = 2;
        int c2 = a2 + b2;
        String res2 = String.format("%d + %d = %d \n", a2, b2, c2);
        System.out.printf("%d + %d = %d \n", a2, b2, c2);
        System.out.println(res2);

        // Виды спецификаторов

//        %d: целочисленных значений
//        %x: для вывода шестнадцатеричных чисел
//        %f: для вывода чисел с плавающей точкой
//        %e: для вывода чисел в экспоненциальной форме,
//        например, 3.1415e+01
//        %i4: для вывода одиночного символа
//        %s: для вывода строковых значений
        float pi1 = 3.1415f;
        System.out.printf("%f\n", pi1); // 3,141500
        System.out.printf("%.2f\n", pi1); // 3,14
        System.out.printf("%.3f\n", pi1); // 3,141
        System.out.printf("%e\n", pi1); // 3,141500e+00
        System.out.printf("%.2e\n", pi1); // 3,14e+00
        System.out.printf("%.3e\n", pi1); // 3,141e+00

        // ФУНКЦИИ И МЕТОДЫ
        sayHi();
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
        getType(name);

        // УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ

        int s = 1;
        int pr = 2;
        int we = 3;
        if (s > pr) we = s;
        else we = pr;

        System.out.println(we);

        int i5 = 1;
        int i6 = 2;
        int i7 = 0;
        if (i5 > i6) i7 = i5;
        if (i6 > i5) i7 = i6;
        System.out.println(i7);

        int i8 = 1;
        int i9 = 2;
        int min = i8 < i9 ? i8 : i9;
        System.out.println(min);


        int mounth = 321;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);


        // ЦИКЛЫ

        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        int s5 = 0;
        for (int t = 1; t <= 10; t++) {
            s5 += t;
        }
        System.out.println(s);

        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        int[] arr5 = new int[10];
        for (int item : arr5) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        // РАБОТА С ФАЙЛАМИ

        // Создание и запись\ дозапись
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append("line 2");
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Чтение, Вариант посимвольно

        FileReader fr = new FileReader("file.txt");
        int c5;
        while ((c5 = fr.read()) != -1) {
            char c51 = (char) c5;
            if (c51 == '\n') {
                System.out.print(c51);
            } else {
                System.out.print(c51);
            }
        }

        // Вариант построчно

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();

    }
        private static void sayHi () {
            System.out.println("hi!");
        }

        static int sum ( int f, int v){
            return f + v;
        }

        static double factor ( int n){
            if (n == 1) return 1;
            return n * factor(n - 1);
        }

        static String getType (Object o){
            return o.getClass().getSimpleName();
        }

}