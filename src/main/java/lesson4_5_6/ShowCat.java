package lesson4_5_6;

public class ShowCat extends Cat{
    int place;
    String category;

    public ShowCat(int age, String nickname, String breed, boolean isMale, int place, String category) {
        super(age, nickname, breed, isMale);
        this.place = place;
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + " " + category;
    }
}
