package OOP_seminars.terrarium.amphibians;

import OOP_seminars.terrarium.interfaces.Soundable;
import OOP_seminars.terrarium.interfaces.SpeedSwimming;

public class Frog extends Amphibians implements SpeedSwimming, Soundable {
    public Frog(String name) {
        super(name);
    }




    @Override
    public String feed() {
        return "insects";
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Frog: %s, Feed: %s, SpeedSwimming: %d", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public String getSound() {
        return "Ква-ква-ква";
    }
}
