package OOP_seminars.seminar_4_1.weapons.rangedWeapon;

public class CrossBow implements Ranged{
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int distance() {
        return 100;
    }
}
