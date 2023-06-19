package OOP_seminars.seminar_4.shilds;

public class Paveza implements Shielded {


    @Override
    public int armorReserve() {
        return 80;
    }

    @Override
    public String toString() {
        return "Paveza";
    }
}
