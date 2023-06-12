package OOP_seminars.zoo;

public abstract class Predator extends Animal {
    public Predator (String name){
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }
}
