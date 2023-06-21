package hometask;

public class Calculator {
    private String name;

    private Numbers num1;

    private Numbers num2;

    public int sumNumbers(Numbers num1, Numbers num2){

        int result =  num1.getValue() + num2.getValue();

        return result;
    }

//    @Override
//    public String toString() {
//        return String.format("%s: %d", name, sumNumbers(num1, num2));
//    }
}
