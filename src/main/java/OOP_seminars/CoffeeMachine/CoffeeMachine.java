package OOP_seminars.CoffeeMachine;

import java.util.ArrayList;
import java.util.List;


public class CoffeeMachine {
    private List<Coffee> cafes = new ArrayList<>();
    private double money = 0;

    public CoffeeMachine addCoffee(Coffee cafe) {
        cafes.add(cafe);
        return this;
    }

    public Coffee searchCoffee(String name) {
        for (Coffee item : cafes) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Coffee sell(String name) throws Exception {
        Coffee target = searchCoffee(name);
        try {
            if (!target.sellCounter()){
                cafes.remove(target);
            }
            this.money += target.getPrice();
        } catch (NullPointerException e) {
            throw new Exception("Товар не найден", e);
        }
        return target;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Coffee item : cafes) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("Выручка составляет %.2f рублей", money));
        return res.toString();
    }
}
