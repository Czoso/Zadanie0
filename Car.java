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
    public void trade(Human buyer, Human seller, int price){
        if (seller.getCar() != null) {
            if (seller.getCash() >= price)
            {
                buyer.setCash(buyer.getCash()- price);
                buyer.setCarr(seller.getCar());
                seller.setCar(null);
                seller.setCash(seller.getCash()+price);
                System.out.println("successful trade");
                } else {
                System.out.println("no money");
            }
        } else {
            System.out.println("no car");
        }
    }
}