package OOP_seminars.seminar_4.weapons.meleeWeapon;

public class Sword implements Melee{

    @Override
    public int damage() {
        return 15;
    }
    @Override
    public String toString() {
        return "Sword";
    }
}
