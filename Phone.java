public class Phone extends Device
{
    static final String AddressServer = "152.123.23.12";
    static final String AppName = "Moja WSB";
    static final double Version = 1.0;
    public Phone(int price, int year, String model) {
        super(price, year, model);
    }


    public boolean turnOn() {
        return false;
    }
    public void trade(Human buyer, Human seller, int price){
        if (seller.getPhone() != null) {
            if (seller.getCash() >= price)
            {
                buyer.setCash(buyer.getCash()- price);
                buyer.setPhone(seller.getPhone());
                seller.setPhone(null);
                seller.setCash(seller.getCash()+price);
                System.out.println("successful trade");
            } else {
                System.out.println("no money");
            }
        } else {
            System.out.println("no phone");
        }
    }

    public void installAnApp(String AppName) {

    }
    public void installAnApp(String AppName, double Version) {

    }
    public void installAnApp(String AppName, double Version, String ServerAddress) {

    }
    public void installAnApp(URL Url){

    }

}
