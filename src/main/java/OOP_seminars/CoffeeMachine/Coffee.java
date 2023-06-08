package OOP_seminars.CoffeeMachine;

public class Coffee {
    private String name;
    private double price;
    private int temperature;
    private int volume;
    private int counter;

    public Coffee(String name, double price, int volume, int temperature, int value) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
        this.volume = volume;
        counter=value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean sellCounter() {
        this.counter--;
        return counter>0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f р.", name, price);
    }
}