package OOP_lesson_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void m1() {
                System.out.println(">>>m1");
            }

            @Override
            public void m2() {
                System.out.println(">>>m2");
            }
        };
        foo.m1();
        foo.m2();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1525);
        list.add(6575676);
        list.add(234);

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }




    }
}
