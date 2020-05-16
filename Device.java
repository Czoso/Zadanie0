public abstract class Device
{
    private static int price;
    private int year;
    private String model;
    public Device (int price, int year, String model){
        this.model=model;
        this.price=price;
        this.year=year;
    }
    public static int getPrice(){
        return price;
    }
    public abstract boolean turnOn();
}

