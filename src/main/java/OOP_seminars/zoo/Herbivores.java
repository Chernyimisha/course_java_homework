package OOP_seminars.zoo;

public abstract class Herbivores extends Animal {
    public Herbivores(String name){
        super(name);
    }
    @Override
    public String feed() {
        return "grass";
    }
}
