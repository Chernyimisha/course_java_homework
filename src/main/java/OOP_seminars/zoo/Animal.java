package OOP_seminars.zoo;

public abstract class Animal implements Soundable {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract String sound();
    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, Food: %s", name, feed());
    }
}
