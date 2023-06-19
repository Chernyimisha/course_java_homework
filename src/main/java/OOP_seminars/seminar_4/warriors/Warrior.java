package OOP_seminars.seminar_4.warriors;


import OOP_seminars.seminar_4.shilds.Shielded;
import OOP_seminars.seminar_4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior <W extends Weapon, S extends Shielded>{
    private String name;
    private W weapon;
    private S shield;
    private int healthPoint;



    public Warrior(String name, W weapon, S shield, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public String getName() {
        return name;
    }

    public W getWeapon() {
        return weapon;
    }

    public S getShield(){
        return shield;
    }



    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit() {
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0, weapon.damage() + 1);

        return hitDamage;
    }

    public void reduceHealth(int damage) {
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, Shield: %s, HealthPoint: %d", name, weapon, shield,healthPoint);
    }

    public int momentArmor(int damage) {
        int result = 0;
        int protectionSuccess = 0;
        Random rnd = new Random();
        protectionSuccess = rnd.nextInt(0, 100);
        result = Math.round((float) (damage * protectionSuccess) /100);
        return result;
    }
    public int reduceArmorReserve(int armorReserve, int momentArmor){
        armorReserve -= momentArmor;
        if (armorReserve < 0) {
            armorReserve = 0;
        }
        return armorReserve;
    }

}
