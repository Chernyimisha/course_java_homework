package OOP_seminars.terrarium.amphibians;

import OOP_seminars.terrarium.Animal;

public abstract class Amphibians extends Animal {
    public Amphibians (String name){
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Amphibian: %s", super.toString());
    }


}
