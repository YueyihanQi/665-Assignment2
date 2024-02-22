package DeliverySystem;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("Shop");

        Driver driver1 = new Driver("A", "Van");
        Driver driver2 = new Driver("B", "Taxi");
        Driver driver3 = new Driver("C", "Scooter");
        Driver driver4 = new Driver("D", "Private car");
        Driver driver5 = new Driver("E", "Bicycle");

        shop.addObserver(driver1);
        shop.addObserver(driver2);
        shop.addObserver(driver3);
        shop.addObserver(driver4);
        shop.addObserver(driver5);


    }
}
