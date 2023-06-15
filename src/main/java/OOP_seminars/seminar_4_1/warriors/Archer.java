package OOP_seminars.seminar_4_1.warriors;

import OOP_seminars.seminar_4_1.weapons.Weapon;
import OOP_seminars.seminar_4_1.weapons.rangedWeapon.Ranged;

public class Archer extends Warior{
    public Archer(String name, Weapon weapon, int healthPoint) {
        super(name, weapon, healthPoint);
    }

    public int distance(){
        return ((Ranged)super.getWeapon()).distance();
    }
}
