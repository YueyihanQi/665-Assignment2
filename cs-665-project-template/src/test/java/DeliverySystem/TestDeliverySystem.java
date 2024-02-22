/**
 * Name: Yueyihan Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: TestDeliverySystem.java
 * Description: JUnit tests for the functionality of specific methods in the DeliverySystem program.
 */

package DeliverySystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDeliverySystem {

    //test whether addObserver function can add new observer
    @Test
    public void testAddObserver() {
        Shop shop = new Shop("Shop");
        Driver driver1 = new Driver("A", "Van");
        shop.addObserver(driver1);
        assertTrue(shop.getObservers().contains(driver1));
    }

    //test whether removeObserver function can remove observer
    @Test
    public void testRemoveObserver(){
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

        shop.removeObserver(driver3);
        shop.removeObserver(driver5);

        assertTrue(shop.getObservers().contains(driver1));
        assertTrue(shop.getObservers().contains(driver2));
        assertFalse(shop.getObservers().contains(driver3));
        assertTrue(shop.getObservers().contains(driver4));
        assertFalse(shop.getObservers().contains(driver5));

    }

    // test whether notifyObservers function can notify all observer
    @Test
    public void testNotifyObservers() {
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

        DeliveryRequest deliveryRequest = new DeliveryRequest("Delivery a cup to Boston University!");

        shop.notifyObservers(deliveryRequest);
    }

    //a full test for delivery system, include add drivers, remove drivers, and notify delivery request to all drivers
    @Test
    public void testDeliverySystem() {

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

        shop.removeObserver(driver5);

        DeliveryRequest deliveryRequest = new DeliveryRequest("Delivery a cup to Boston University!");

        shop.notifyObservers(deliveryRequest);
    }

}
