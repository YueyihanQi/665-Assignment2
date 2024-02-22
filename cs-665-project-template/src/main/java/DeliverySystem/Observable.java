/**
 * Name: Yueyihan Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Observer.java
 * Description: This interface represents an observable object in the delivery system. It defines methods to add, remove, and notify observers of delivery requests.
 */

package DeliverySystem;

public interface Observable {
    //Method to add an observer from the list of observers
    void addObserver(Observer observer);

    //Method to remove an observer from the list of observers
    void removeObserver(Observer observer);

    //Method to notify all observers of a delivery request
    void notifyObservers(DeliveryRequest deliveryRequest);
}
