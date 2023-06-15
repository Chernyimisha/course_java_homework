package OOP_seminars.seminar_4_1.weapons.rangedWeapon;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 5;
    }

    @Override
    public int distance() {
        return 50;
    }
}
