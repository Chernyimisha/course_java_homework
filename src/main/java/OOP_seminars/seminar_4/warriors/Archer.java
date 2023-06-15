package OOP_seminars.seminar_4.warriors;

import OOP_seminars.seminar_4.shilds.Buckler;
import OOP_seminars.seminar_4.weapons.Weapon;
import OOP_seminars.seminar_4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged>{
    public Archer(String name, int healthPoint, Ranged weapon, Buckler buckler) {
        super(name, healthPoint, weapon, buckler);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}
