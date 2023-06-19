package OOP_seminars.seminar_4.weapons.rangedWeapon;

public class CrossBow implements Ranged{
    @Override
    public int damage() {
        return 15;
    }

    @Override
    public int distance() {
        return 100;
    }

    @Override
    public String toString() {
        return "CrossBow";
    }
}
