package OOP_seminars.zoo;

public class Duck extends Bird implements FlySpeed{

    public Duck(String name){
        super(name);
    }
    @Override
    public String sound() {
        return "Кря";
    }

    @Override
    public String feed() {
        return "Все ем";
    }

    @Override
    public int getRunSpeed() {
        return 6;
    }

    @Override
    public String toString() {
        return String.format("Duck: %s, Speed: %d, FlySpeed: %d", super.toString(), getRunSpeed(), getFlySpeed());
    }

    @Override
    public int getFlySpeed() {
        return 80;
    }
}
