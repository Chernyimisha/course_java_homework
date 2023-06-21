package hometask;

public class OOP_lesson_5_practice {
    //    Написать программу сложения двух чисел.
//    Почти как раньше, но лучше!
    public static void main(String[] args) {

        Numbers num1 = new Numbers("1", 5);
        Numbers num2 = new Numbers("2", 25);

        Calculator sum = new Calculator();
        System.out.println(sum.sumNumbers(num1, num2));

    }
}
