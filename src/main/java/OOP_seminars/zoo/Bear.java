package OOP_seminars.zoo;

public class Bear extends Predator implements RunSpeed{
    public Bear(String name){
        super(name);
    }

    @Override
    public String sound() {
        return "Rear";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d", super.toString(), getRunSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 40;
    }
}
