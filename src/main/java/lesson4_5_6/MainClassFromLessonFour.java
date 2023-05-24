package lesson4_5_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MainClassFromLessonFour {
    public static void main(String[] args) {
        List list = List.of(new String(), new ArrayList<>(), new boolean[]{}, 1);
        System.out.println(list);
        ex0();
        ex1();
    }

    private static void ex1() {

    }

    static void ex0() {
        final int SIZE = 100_000_000;
        Random random = new Random();

        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(random.nextInt());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Integer> arrayList = new ArrayList<>(SIZE);
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(random.nextInt());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }
}
