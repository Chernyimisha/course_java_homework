package OOP_seminars.seminar_4.shilds;

public class Paveza implements Shielded {

    int size;

    public Paveza(int size) {
        this.size = size;
    }

    @Override
    public int getSize(){
        return size;
    }


    @Override
    public int armorReserve() {
        return 80;
    }

    @Override
    public String toString() {
        return "Paveza";
    }
}
