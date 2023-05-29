package lesson4_5_6;

public class VetCat extends Cat{
    String medicalHistory;
    boolean isSterilized;

    public VetCat(int age, String nickname, String breed, boolean isMale, String medicalHistory, boolean isSterilized) {
        super(age, nickname, breed, isMale);
        this.medicalHistory = medicalHistory;
        this.isSterilized = isSterilized;
    }

    @Override
    public String toString() {
        return super.toString() + " " + medicalHistory;
    }
}
