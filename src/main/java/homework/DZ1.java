package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;
public class DZ1 {
    public static void main(String[] args) {
        //task1
        int[] newArr = createArr(5, 8);
        System.out.println(Arrays.toString(newArr));

        task2();

        task3();

        task4();
        int[] newArr2 = new int[]{3, 5, 6, 1};
        task5(newArr2, 2);
    }
    //Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    //одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    private static int[] createArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    //Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    private static void task2() {
        int[] nums = new int[]{49, 69, 51, 38, 21, 15};
        int maxElem = 0;
        int minElem = 0;
        minElem = maxElem = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxElem) maxElem = nums[i];
            else if (nums[i] < minElem) minElem = nums[i];
        }
        System.out.printf("Минимальный элемент: %d, максимальный элемент: %d \n", minElem, maxElem);

    }

    private static void task3() {
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
        //диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        //индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int [][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, x = matrix[i].length - 1; j < matrix[i].length; j++, x--) {
                if (i == j || i == x) matrix[i][j] = 1;
                else matrix[i][j] = 0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static void task4() {
        //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
        //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
        //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
        //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

         LocalDateTime now = LocalDateTime.now();
         Calendar calendar = new GregorianCalendar();
         System.out.println(calendar);
         System.out.println(now);
         System.out.println("Введите имя!");
         Scanner in = new Scanner(System.in);
         String name = in.nextLine();
         in.close();
         System.out.println("Привет, " + name);
         if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
             System.out.println("Доброе утро, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
             System.out.println("Добрый день, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
             System.out.println("Добрый вечер, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
             System.out.println("Доброй ночи, " + name + "!");
         }
    }

    private static void task5(int[] arr, int shift) {
        //** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        //при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
        //Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
        //(на один вправо) -> [3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n
        //в какую сторону сдвиг можете выбирать сами.

            System.out.println("Массив до сдвига:\t\t" + Arrays.toString(arr));
            System.out.println("Значение n = " + shift);

            int length = arr.length;

            if (shift > 0) {
                for (int i = 0; i < shift; i++) {
                    int buffer = arr[length - 1];
                    System.arraycopy(arr, 0, arr, 1, length - 1);
                    arr[0] = buffer;
                }
            } else if (shift < 0) {
                for (int i = 0; i < -shift; i++) {
                    int buffer = arr[0];
                    System.arraycopy(arr, 1, arr, 0, length - 1);
                    arr[length - 1] = buffer;
                }
            }
            System.out.print("Массив после сдвига:\t" + Arrays.toString(arr) + "\n\n");
        }
}
