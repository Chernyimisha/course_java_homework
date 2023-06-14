package OOP_seminars.MyLinkedList;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.add(2, "0");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }


    }
}
