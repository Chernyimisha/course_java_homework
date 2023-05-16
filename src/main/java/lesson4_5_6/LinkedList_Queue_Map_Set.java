package lesson4_5_6;

import java.util.*;

public class LinkedList_Queue_Map_Set {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(queue); // [2809]

        queue.add(1);
        queue.offer(2809);
        item = queue.poll();
        System.out.println(queue);

        queue.offer(2809);
        item = queue.poll();
        System.out.println(queue);
        queue.element();
        queue.peek();

        queue.offer(2809);
        item = queue.poll();
        System.out.println(queue);
        queue.remove(2809); // зачем очередь??
        queue.element();
        queue.peek();

//        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(1); deque.addLast(2);
//        deque.removeLast(); deque.removeLast();
//        deque.offerFirst(1); deque.offerLast(2);
//        deque.pollFirst(); deque.pollLast();
//        deque.getFirst(); deque.getLast();
//        deque.peekFirst(); deque.peekLast();

//        Stack представляет собой обработку данных по принципу LIFO.
//        Расширяет Vector пятью операциями, которые позволяют рассматривать
//        вектор как стек.
//                push(E item)
//        pop()

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1

//        Вычислить значение выражения в постфиксной форме записи
//        1 + 2 * 3 (1 + 2) * 3

        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один"); System.out.println(db);
        db.put(2, "два"); System.out.println(db);
        db.put(3, "три"); System.out.println(db);
        db.put(31, "три один"); System.out.println(db);
        db.put(13, "один три"); System.out.println(db);
        db.put(null, "!null"); System.out.println(db);
        db.put(null, null); System.out.println(db);

        for (var item1 : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item1.getKey(), item1.getValue());
        }


        //HashMap

//        put(K,V) – добавить пару если или изменить значение,если ключ имеется.
//        putIfAbsent(K,V) – произвести добавление если ключ не найден.
//        get(K) - получение значения по указанному ключу.
//        remove(K) – удаляет пару по указанному ключу.
//        containsValue(V) – проверка наличия значения.
//        containsKey(V) – проверка наличия ключа.
//        keySet() – возвращает множество ключей.
//        values() – возвращает набор значений.

//        Map<Integer,String> map1 = new HashMap<>();
//        Map<Integer,String> map2 = new HashMap<>(9);
//        Map<Integer,String> map3 = new HashMap<>(9, 1.0f);

        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap);
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

//        put(K,V) get(K) remove(K)
//        descendingMap() tailMap() headMap() lastEntry() firstEntry()

        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}

        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException
    }
}
