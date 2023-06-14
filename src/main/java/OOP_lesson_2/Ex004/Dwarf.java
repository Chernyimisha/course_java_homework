package OOP_lesson_2.Ex004;

import OOP_lesson_2.Ex005.v2.Hero;

import java.util.ArrayList;
import java.util.List;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp) {
        super();
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }

    public static class Program {
        public static void main(String[] args) {

            //#region team1
            List<Hero> team1 = new ArrayList<>();
            team1.add(new OOP_lesson_2.Ex005.v2.Healers.Druid());
            team1.add(new OOP_lesson_2.Ex005.v2.Healers.Shaman());
            team1.add(new OOP_lesson_2.Ex005.v2.Warriors.Paladin());
            team1.add(new OOP_lesson_2.Ex005.v2.Healers.Druid());

            // team1.get(0).attack

            var h = team1.get(0);

            if (h instanceof OOP_lesson_2.Ex005.v2.Warriors.Warrior) {
                ((OOP_lesson_2.Ex005.v2.Warriors.Warrior) h).attack(null);
            }
            else if (h instanceof OOP_lesson_2.Ex005.v2.Healers.Healer) {
                ((OOP_lesson_2.Ex005.v2.Healers.Healer) h).healing(null);
            } else {
                //....
            }
            //#endregion

            //#region team2
            List<OOP_lesson_2.Ex005.v2.Warriors.Warrior> team2 = new ArrayList<>();
            //team2.add(new Druid());
            team2.add(new OOP_lesson_2.Ex005.v2.Warriors.Paladin());
            team2.add(new OOP_lesson_2.Ex005.v2.Warriors.Knight());

            team2.get(0).attack(null);

            List<OOP_lesson_2.Ex005.v2.Healers.Healer> team3 = new ArrayList<>();
            //team2.add(new Paladin());
            team3.add(new OOP_lesson_2.Ex005.v2.Healers.Druid());
            team3.add(new OOP_lesson_2.Ex005.v2.Healers.Shaman());

            team3.get(0).healing(null);


            //#endregion



        }
    }
}