public class Phone extends Device
{
    public Phone(int price, int year, String model) {
        super(price, year, model);
    }


    public boolean turnOn() {
        return false;
    }
}
