package hometask;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class lesson1Task {
    //    Задача 1.
    //    Задана натуральная степень k. Сформировать случайным
    //    образом список коэффициентов (значения от 0 до 100)
    //    многочлена многочлен степени k.
    //   *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
    //    Задача 2.
    //    Даны два файла, в каждом из которых находится запись
    //    многочлена. Сформировать файл содержащий сумму
    //    многочленов.
    public static void main(String[] args) {
        //task3();
        //task4();
        //task5();
        task6();
        //task7();
        //task8(3, 2);
    }

    private static void task3() {
        //Вывести в консоль текущие системные дату и время
        Date date = new Date();
        System.out.println(date.toString());
    }

    private static void task4() {
        //    Задача 4.
        //Написать программу, которая запросит пользователя ввести имя в консоли.
        //Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name:\n");
        String name = iScanner.nextLine();
        System.out.printf("Привет,\n%s!", name);
        iScanner.close();
    }

    private static void task5() {
        //Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1],
        //вывести максимальное количество подряд идущих 1.
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 1, 0, 1};
        int count = 0;
        int maxCount = 0;
        for (int j : arr) {
            if (j == 1) {
                count++;
                if (count > maxCount) {
                maxCount = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.printf("Макс. серия единиц составляет: %s%n", Math.max(maxCount, count));
    }

//    private static void task6() {
//        //Дан массив nums = {3, 2, 3, 2, 3} и число val = 3.
//        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные-равны ему.
//        int[] nums = new int[]{2, 2, 3, 3, 2, 3, 2, 3, 2};
//        int val = 3;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val) {
//                for (int j = i; j < nums.length; j++) {
//                    if (nums[j] != val) {
//                        nums[i] = nums[j];
//                        nums[j] = val;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }
    private static void task6() {
        //Дан массив nums = {3, 2, 3, 2, 3} и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные-равны ему.
        Random random = new Random();
        int[] arr = new int[20];
        final int VAL = 3;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(1, 6);
        }
        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if (arr[right] == VAL){
                right--;
            } else if (arr[left] != VAL) {
                left++;
            } else {
                arr[left] = arr[right];
                arr[right] = VAL;

                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task7() {
        //Во фразе "Добро пожаловать на курс JAVA" переставить слова в обратном порядке.
        String str = "Добро пожаловать на курс JAVA";
        String[] arr = str.split(" ");
        System.out.println(str);
        System.out.println(Arrays.toString(arr));
        String temp = "";
        int i = 0;
        while (i < arr.length/2) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-i-1] = temp;
            i++;
        }
//        String result = "";
//        for (String word: arr){
//            result += word + " ";
//        }
        for (String word: arr){
            System.out.print(word + " ");
        }
    }

    private static void task8(int a, int b) {
        // Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
        System.out.println(Math.pow(a, b));
    }
}



