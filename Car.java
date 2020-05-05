public class Car {

    final String model;
    final String manufacturer;
    private int price;
    private int year;
    private double engineCapacity;

    public Car(String model, String manufacturer, int price, int year, double engineCapacity) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public int getPrice() {
        return price;
    }
}