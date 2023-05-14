package lesson4_5_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    }
}
