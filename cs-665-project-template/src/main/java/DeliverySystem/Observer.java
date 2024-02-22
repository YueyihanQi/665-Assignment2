/**
 * Name: Yueyihan Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Observer.java
 * Description: This interface represents an observer in the delivery system. It defines a method to receive delivery requests.
 */

package DeliverySystem;

//Method to receive a delivery request.
public interface Observer {
    void receiveDeliveryRequest(DeliveryRequest deliveryRequest);

}
