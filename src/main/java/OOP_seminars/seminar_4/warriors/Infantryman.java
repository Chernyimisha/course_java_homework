package OOP_seminars.seminar_4.warriors;

import OOP_seminars.seminar_4.shilds.Buckler;
import OOP_seminars.seminar_4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee>{

    public Infantryman(String name, int healthPoint, Melee weapon, Buckler buckler) {
        super(name, healthPoint, weapon, buckler);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
