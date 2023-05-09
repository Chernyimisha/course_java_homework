package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_JAVA {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o); // java.lang.Integer
        o = 1.2;
        GetType(o); // java.lang.Double
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));


        int[] a = new int[]{1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i : a) {
            System.out.printf("%d ", i);
        } // 1 9
        for (int j : b) {
            System.out.printf("%d ", j);
        }
        // 0 9 0 0 0 0 0 0 0 0

        int[] a2 = new int[]{0, 9};
        for (int i : a2) {
            System.out.printf("%d ", i);
        }
        a = AddItem(a, 2);
        a = AddItem(a, 3);
        for (int j : a) {
            System.out.printf("%d ", j);
        }

        ArrayList list = new ArrayList();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);

        List list5 = new ArrayList();
        list.add(2809);
        list.add("string line");
        for (Object o2 : list5) {
            System.out.println(o2);
            // Проблема извлечения данных
        }

        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]

        StringBuilder daySb = new StringBuilder("28");
        StringBuilder monthSb = new StringBuilder("9");
        StringBuilder yearSb = new StringBuilder("1990");
        StringBuilder[] dateSb = { daySb, monthSb, yearSb };
        List<StringBuilder> dSb = Arrays.asList(dateSb);
        System.out.println(dSb);

        Character value = null;
        List<Character> list6 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list6);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list7 = List.copyOf(list6);


        List<Integer> list8 = List.of(1, 12, 123, 1234, 12345);
        for (int item : list8) { System.out.println(item); }
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            System.out.println(col.next());
        }

        List<Integer> list9 = List.of(1, 12, 123, 1234, 12345);
        for (int item : list9) { System.out.println(item); }
        Iterator<Integer> col1 = list.iterator();
        while (col1.hasNext()) {
            System.out.println(col1.next());
            col1.next();
            col1.remove();
        }

    }
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object)((Double) a + (Double) b);
        } else if(a instanceof Integer && b instanceof Integer) {
            return (Object)((Integer) a + (Integer) b);
        } else return 0;
    }

    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
//        операции с коллекциями

//        add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
//        get(pos) – возвращает элемент из списка по указанной позиции
//        indexOf(item) – первое вхождение или -1
//        lastIndexOf(item) – последнее вхождение или -1
//        remove(pos) – удаление элемента на указанной позиции и его возвращение
//        set(int pos, T item) – gjvtoftn значение item элементу, который находится на позиции pos
//        void sort(Comparator) – сортирует набор данных по правилу
//        subList(int start, int end) – получение набора данных от позиции start до end
//
//        clear() – очистка списка
//        toString() – «конвертация» списка в строку
//        Arrays.asList – преобразует массив в список
//        containsAll(col) – проверяет включение всех элементов из col
//        removeAll(col) – удаляет элементы, имеющиеся в col
//        retainAll(col) – оставляет элементы, имеющиеся в col
//        toArray() – конвертация списка в массив Object’ов
//        toArray(type array) – конвертация списка в массив type
//        List.copyOf(col) – возвращает копию списка на основе имеющегося
//        List.of(item1, item2,...) – возвращает неизменяемый список
}
