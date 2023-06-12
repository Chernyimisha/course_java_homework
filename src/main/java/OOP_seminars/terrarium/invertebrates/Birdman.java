package OOP_seminars.terrarium.invertebrates;

import OOP_seminars.terrarium.interfaces.Soundable;
import OOP_seminars.terrarium.interfaces.SpeedSwimming;

public class Birdman extends Invertebrates implements SpeedSwimming, Soundable {
    public Birdman(String name) {
        super(name);
    }


    @Override
    public String feed() {
        return "meat and small spiders";
    }

    @Override
    public String toString() {
        return String.format("Birdman: %s, Feed: %s", super.toString(), feed());
    }


    @Override
    public String getSound() {
        return "Ш-ш-ш";
    }

    @Override
    public int getSwimSpeed() {
        return 0;
    }
}
