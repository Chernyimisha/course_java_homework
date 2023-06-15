package OOP_seminars.seminar_4_1.warriors;


import OOP_seminars.seminar_4_1.weapons.Weapon;

import java.util.Random;

public abstract class Warior {
    private String name;
    private Weapon weapon;
    private int healthPoint;


    public Warior(String name, Weapon weapon, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int hit(){
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0, weapon.damage() + 1);

        return hitDamage;
    }

    public void rediceHealth(int damage){
        healthPoint -= damage;
        if(healthPoint<0){
            healthPoint = 0;
        }

    }
}
