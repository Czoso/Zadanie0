public class Phone extends Device
{
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
}
