package OOP_seminars.terrarium;

import OOP_seminars.terrarium.interfaces.Soundable;
import OOP_seminars.terrarium.interfaces.SpeedSwimming;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private final List<Animal> terrarium = new ArrayList<>();

    public Terrarium addAnimal(Animal animal) {
        terrarium.add(animal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("----Животные нашего террариума:----\n");
        for (Animal animal : terrarium) {
            builder.append(animal).append('\n');
        }
        return builder.toString();
    }

    private List<SpeedSwimming> getSwimmers() {
        List<SpeedSwimming> swimmers = new ArrayList<>();
        for (Animal animal : terrarium) {
            if (animal instanceof SpeedSwimming) {
                swimmers.add((SpeedSwimming) animal);
            }
        }
        return swimmers;
    }

    public SpeedSwimming getFastestSwimmer() {
        List<SpeedSwimming> swimmers = getSwimmers();
        SpeedSwimming fastestSwimmer = swimmers.get(0);
        for (SpeedSwimming swimmer : swimmers) {
            if (swimmer.getSwimSpeed() > fastestSwimmer.getSwimSpeed()) {
                fastestSwimmer = swimmer;
            }
        }
        return fastestSwimmer;
    }

    private List<Soundable> getSoundable() {
        List<Soundable> soundables = new ArrayList<>();
        for (Animal animal: terrarium) {
            if(animal instanceof Soundable) {
                soundables.add((Soundable) animal);
            }
        }
        return soundables;
    }

    public String getSounds() {
        StringBuilder builder = new StringBuilder("----Звуки животных:----\n");
        for (Soundable animal: getSoundable()) {
            builder.append(animal.getSound()).append('\n');
        }
        return builder.toString();
    }
}
