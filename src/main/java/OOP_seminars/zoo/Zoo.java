package OOP_seminars.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Radio radio = new Radio();
    private List<Animal> zoo = new ArrayList<>();

    public Zoo addAnimal(Animal someAnimal){
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : zoo){
            sb.append(animal).append('\n');
        }
        return sb.toString();
    }

    private List<Soundable> getSondable(){
        List<Soundable> result = new ArrayList<>(zoo);
            result.add(radio);
            return result;
    }

    public String getSound(){
        StringBuilder sb = new StringBuilder();
        for (Soundable sd: getSondable()){
            sb.append(sd.sound()).append('\n');
        }
        return sb.toString();
    }

    private List<RunSpeed> runners(){
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal: zoo){
            if (animal instanceof RunSpeed){
                runners.add((RunSpeed) animal);
            }
        }
        return runners;
    }

    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners = runners();
        RunSpeed result = runners.get(0);
        for (RunSpeed item : runners){
            if (item.getRunSpeed() > result.getRunSpeed()){
                result = item;
            }
        }
        return result;
    }

    public List<FlySpeed> flyers(){
        List<FlySpeed> flyers = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof FlySpeed){
                flyers.add((FlySpeed) animal);
            }
        }
        return flyers;
    }
}
