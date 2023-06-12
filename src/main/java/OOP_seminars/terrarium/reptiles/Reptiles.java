package OOP_seminars.terrarium.reptiles;

import OOP_seminars.terrarium.Animal;

public abstract class Reptiles extends Animal {
    public Reptiles (String name){
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Reptiles, %s", super.toString());
    }
}
