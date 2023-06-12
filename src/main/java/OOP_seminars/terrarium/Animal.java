package OOP_seminars.terrarium;

import OOP_seminars.terrarium.interfaces.Soundable;

public abstract class Animal {

    public String name;

    public Animal (String name) {
        this.name = name;
    }

    public abstract String feed();



    @Override
    public String toString() {
        return String.format("Name: %s", name);
    }
}
