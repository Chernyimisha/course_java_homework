package OOP_seminars.seminar_4;

import OOP_seminars.seminar_4.shilds.Shielded;
import OOP_seminars.seminar_4.warriors.Warrior;
import OOP_seminars.seminar_4.weapons.Weapon;

public class Battle<W1 extends Weapon, S1 extends Shielded, W2 extends Weapon, S2 extends Shielded> {

    private Warrior<W1, S1> w1;
    private Warrior<W2, S2> w2;

    public Battle(Warrior<W1, S1> w1, Warrior<W2, S2> w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight() {
        int damage1;
        int damage2;
        int armor1;
        int armor2;
        int armorReserve1 = w1.getShield().armorReserve();
        int armorReserve2 = w2.getShield().armorReserve();
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0) {
            damage1 = w1.hit();
            damage2 = w2.hit();

            if (armorReserve1 > 0 && armorReserve2 > 0) {
                armor1 = w1.momentArmor(damage2);
                armor2 = w2.momentArmor(damage1);
                System.out.printf("MomentArmor1: %d, MomentArmor2: %d\n", armor1, armor2);
                w1.reduceHealth(damage2 - armor1);
                w2.reduceHealth(damage1 - armor2);
                armorReserve1 = w1.reduceArmorReserve(armorReserve1, armor1);
                armorReserve2 = w2.reduceArmorReserve(armorReserve2, armor2);
            } else if (armorReserve1 <= 0 && armorReserve2 > 0) {
                w1.reduceHealth(damage2);
                armor2 = w2.momentArmor(damage1);
                w2.reduceHealth(damage1 - armor2);
                armorReserve2 = w2.reduceArmorReserve(armorReserve2, armor2);
                System.out.printf("MomentArmor2: %d\n", armor2);
            } else if (armorReserve2 <= 0 && armorReserve1 > 0) {
                w2.reduceHealth(damage1);
                armor1 = w1.momentArmor(damage2);
                w1.reduceHealth(damage2 - armor1);
                armorReserve1 = w1.reduceArmorReserve(armorReserve1, armor1);
                System.out.printf("MomentArmor1: %d\n", armor1);
            } else {
                w1.reduceHealth(damage2);
                w2.reduceHealth(damage1);
            }

            System.out.println("first hit second: " + damage1 + " --> " + "second hit first: " + damage2);
            System.out.printf("HealthPoint: %s = %d, ArmorReserve: %d\nHealthPoint: %s = %d, ArmorReserve: %d\n",
                    w1.getName(), w1.getHealthPoint(), armorReserve1, w2.getName(), w2.getHealthPoint(), armorReserve2);
        }
        if (w1.getHealthPoint() > w2.getHealthPoint()) {
            System.out.printf("Winner: %s", w1.getName());
        } else if (w2.getHealthPoint() > w1.getHealthPoint()) {
            System.out.printf("Winner: %s", w2.getName());
        } else System.out.println("Winner absent");
    }

}
