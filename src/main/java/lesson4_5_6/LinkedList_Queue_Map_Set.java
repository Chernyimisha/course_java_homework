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

//        Set
//        HashSet
//        isEmpty() – проверка на пустоту.
//        add(V) – добавление элемента в коллекцию.
//        remove(V) – удаление элемента из коллекцию.
//        contains(V) – проверка на включение элемента в коллекции.
//        clear() – удаление всех элементов коллекции.
//        size() – возвращает количество элементов коллекции.

        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);
        for (var item5 : set) System.out.println(item5); // null 1 1234 123
        set.clear();
        System.out.println(set); // []

//        HashSet как синоним множества
//        addAll(Coll) – объединение множеств.
//        retainAll(Coll) – пересечение множеств.
//        removeAll(Coll) – разность множеств.
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]

//        first()
//        last()
//        headSet(E)
//        tailSet(E)
//        subSet(E1, E2)
        var a6 = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b6 = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        System.out.println(a6); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b6); // [2, 3, 5, 7, 11, 13, 17]
//        System.out.println(a.headSet(4)); // [1, 2, 3]
//        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
//        System.out.println(a.subSet(3, 5)); // [3, 4]

//        TreeSet

//    ● В основе HashMap.
//    ● Упорядочен по возрастанию.
//    ● null’ов быть не может.

        var a7 = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b7= new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        System.out.println(a7); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b7); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.contains(1)); // true

//        LinkedHashSet

//    ● В основе HashMap.
//    ● Помнит порядок.
//    Использовать, когда нужен HashSet с запоминанием порядка элемента.
//        isEmpty() – проверка на пустоту.
//        add(V) – добавление элемента в коллекцию.
//        remove(V) – удаление элемента из коллекцию.
//        contains(V) – проверка на включение элемента в коллекции.
//        clear() – удаление всех элементов коллекции.
//        size() – возвращает количество элементов коллекции.

        var a8 = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b8 = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
        a.add(28);
        System.out.println(a8); // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b8); // [13, 3, 17, 7, 2, 11, 5]


    }
}
