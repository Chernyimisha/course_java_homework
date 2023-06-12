package OOP_seminars.terrarium;

import OOP_seminars.terrarium.amphibians.Frog;
import OOP_seminars.terrarium.invertebrates.Birdman;
import OOP_seminars.terrarium.reptiles.Crocodiles;

public class main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new Frog("Masha")).addAnimal(new Crocodiles("Petja")).addAnimal(new Birdman("Boss"));

        System.out.println(terrarium);

        System.out.println(terrarium.getSounds());

        System.out.println("----Наш чемпион по плаванию----");
        System.out.println(terrarium.getFastestSwimmer());

    }
}
