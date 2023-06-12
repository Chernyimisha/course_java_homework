package OOP_seminars.terrarium.invertebrates;

import OOP_seminars.terrarium.Animal;

public abstract class Invertebrates extends Animal {

    public Invertebrates (String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Invertebrates: %s", super.toString());
    }

}
