public class Car extends Device {


    final String manufacturer;
    private double engineCapacity;

    public Car(String model, String manufacturer, int price, int year, double engineCapacity) {
        super(model, price, year);
        this.manufacturer = manufacturer;
        this.engineCapacity = engineCapacity;
    }

    public static int getPrice() {
        return Device.getPrice();
    }


    public boolean turnOn()
    {
        return false;
    }
}