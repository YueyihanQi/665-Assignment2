/**
 * Name: Yueyihan Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Driver.java
 * Description: This class represents a driver in the delivery system. It implements the Observer interface to receive delivery requests.
 */

package DeliverySystem;

//Driver implements the Observer interface to receive delivery requests
public class Driver implements Observer {
    private String name;
    private String vehicle;

    //Constructor to initialize a driver with a name and a vehicle type
    public Driver(String name, String vehicle){
        this.vehicle = vehicle;
        this.name = name;
    }
    @Override
    public void receiveDeliveryRequest(DeliveryRequest deliveryRequest){
        System.out.println("Driver " + name + " with " + vehicle + " received delivery request: " + deliveryRequest.getRequest());
    }

}
