package OOP_seminars.seminar_4;

import OOP_seminars.seminar_4.shilds.Buckler;
import OOP_seminars.seminar_4.warriors.Archer;
import OOP_seminars.seminar_4.warriors.Infantryman;
import OOP_seminars.seminar_4.warriors.Warrior;
import OOP_seminars.seminar_4.weapons.meleeWeapon.Axe;
import OOP_seminars.seminar_4.weapons.meleeWeapon.Sword;
import OOP_seminars.seminar_4.weapons.rangedWeapon.Bow;
import OOP_seminars.seminar_4.weapons.rangedWeapon.CrossBow;

public class MainClassForSeminarFour {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Buckler(5, 30)));
        team1.add(new Infantryman("John", 150,new Axe(), new Buckler(6, 35)));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new Buckler(3, 15)));
        teamArchers.add(new Archer("Piter",100, new Bow(), new Buckler(6, 35)));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new Buckler(6, 35)));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);


        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe(), new Buckler(6, 35)), (new Archer("Robin", 100, new Bow(), new Buckler(2, 13))));

        battle1.fight();

    }
}
