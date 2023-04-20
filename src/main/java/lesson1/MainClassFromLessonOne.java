package lesson1;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class MainClassFromLessonOne {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
        method5();
    }

    private static void method1() {
        //Вывести в консоль текущие системные дату и время
        Date date = new Date();
        System.out.println(date.toString());
    }

    private static void method2() {
        //Написать программу, которая запросит пользователя ввести имя в консоли.
        //Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String name = myScanner.nextLine();
        //System.out.println(String.format("Привет, %s!", name));
        System.out.printf("Привет, %s!%n", name);
    }

    private static void method3() {
        //Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1],
        //вывести максимальное количество подряд идущих 1.
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 1, 1};
        int count = 0;
        int maxCount = 0;
        for (int j : arr) {
            if (j == 1) count++;
            else if (count > maxCount) {
                maxCount = count;
                count = 0;
            }
        }
        if (count > maxCount) maxCount = count;
        System.out.println(maxCount);
    }

    private static void method4() {
        //Дан массив nums = {3, 2, 2, 3} и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные-равны ему.
        int[] nums = new int[]{3, 3, 2, 3, 2, 3};
        int val = 3;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length-1; j++) {
                        nums[j] = nums[j + 1];
                        nums[j + 1] = val;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void method5() {
        //Во фразе "Добро пожаловать на курс JAVA" переставить слова в обратном порядке.
        String str = "Добро пожаловать на курс JAVA";
        String[] arr = str.split(" ");
        String temp = "";
        for (int k = 0; k < arr.length; k++) {
            temp = arr[k];
            arr[k] = arr[arr.length-k-1];
            arr[arr.length-k-1] = temp;
        }
        System.out.println(Arrays.toString(new String[]{str}));
    }
}