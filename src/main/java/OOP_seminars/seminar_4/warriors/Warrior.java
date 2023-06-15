package OOP_seminars.seminar_4.warriors;

import OOP_seminars.seminar_4.shilds.Buckler;
import OOP_seminars.seminar_4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon> {
    private final String name;
    private int healthPoint;
    private W weapon;

    private Buckler buckler;

    public Warrior(String name, int healthPoint, W weapon, Buckler buckler) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.buckler = buckler;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage) {
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d", name, weapon, healthPoint);
    }
}
