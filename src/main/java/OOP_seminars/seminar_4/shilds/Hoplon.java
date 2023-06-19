package OOP_seminars.seminar_4.shilds;

public class Hoplon implements Shielded {

    int size;

    public Hoplon(int size) {
        this.size = size;
    }
    @Override
    public int getSize(){
        return size;
    }

    @Override
    public int armorReserve() {
        return 50;
    }

    @Override
    public String toString() {
        return "Hoplon";
    }
}
