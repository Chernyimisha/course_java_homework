package OOP_seminars.zoo;

public class MainClassForSeminarTwo {
    public static void main(String[] args) {
        Animal bear = new Bear("Потапыч");
        Animal cow = new Cow ("Мурка");



        System.out.println("В зоопарке содержатся:\n");

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Donald"));
        System.out.println(zoo);

        System.out.println(zoo.getSound());
        RunSpeed champ = zoo.getRunnerChampion();
        System.out.println(champ);

        System.out.println("-----Летающие животные-----");

    }
}
