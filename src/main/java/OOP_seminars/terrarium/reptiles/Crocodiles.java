package OOP_seminars.terrarium.reptiles;

import OOP_seminars.terrarium.interfaces.Soundable;
import OOP_seminars.terrarium.interfaces.SpeedSwimming;

public class Crocodiles extends Reptiles implements SpeedSwimming, Soundable {
    public Crocodiles(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }
    @Override
    public String toString() {
        return String.format("Crocodiles: %s, Feed: %s, SpeedSwimming: %d", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public String getSound() {
        return "Р-рр-рр";
    }
}
