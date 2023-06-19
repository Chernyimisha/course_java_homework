package OOP_seminars.seminar_4;

import OOP_seminars.seminar_4.shilds.Hoplon;
import OOP_seminars.seminar_4.shilds.NullShield;
import OOP_seminars.seminar_4.shilds.Paveza;
import OOP_seminars.seminar_4.warriors.Archer;
import OOP_seminars.seminar_4.warriors.Infantryman;
import OOP_seminars.seminar_4.warriors.Warrior;
import OOP_seminars.seminar_4.weapons.meleeWeapon.Axe;
import OOP_seminars.seminar_4.weapons.meleeWeapon.Sword;
import OOP_seminars.seminar_4.weapons.rangedWeapon.Bow;
import OOP_seminars.seminar_4.weapons.rangedWeapon.CrossBow;


public class Program {
    public static void main(String[] args) {

        Team<Warrior> horns = new Team<>();
        Team<Archer> hooves = new Team<>();
        Team<Infantryman> tails = new Team<>();

        horns.add(new Archer("Robin", new Bow(), new NullShield(),100));
        horns.add(new Archer("Michail", new CrossBow(), new Paveza(),120));
        horns.add(new Infantryman("Denis", new Sword(), new Hoplon(),150));

        hooves.add(new Archer("Alex", new Bow(), new NullShield(),100));
        hooves.add(new Archer("Michail", new Bow(), new Paveza(),90));
        hooves.add(new Archer("Denis", new CrossBow(), new Paveza(),150));

        tails.add(new Infantryman("John", new Axe(), new NullShield(),110));
        tails.add(new Infantryman("Piter", new Axe(), new NullShield(),140));
        tails.add(new Infantryman("Donald", new Sword(), new NullShield(),130));

        System.out.println(horns);
        System.out.println(hooves);
        System.out.println(tails);

        Battle<Axe, Hoplon, CrossBow, Paveza> battle1 = new Battle<>(tails.getWarrior(0), horns.getWarrior(0));
        battle1.fight();


    }
}
