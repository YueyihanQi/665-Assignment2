/**
 * Name: Yueyihan Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Shop.java
 * Description: This class represents a shop in the delivery system. It implements the Observable interface.
 */

package DeliverySystem;

import java.util.ArrayList;
import java.util.List;

// Shop implements the Observable interface
public class Shop implements Observable{
    //To manage observers and notify them about delivery requests. The shop maintains a list of observers
    private List<Observer> observers = new ArrayList<>();
    //Getter method to retrieve the list of observers
    public List<Observer> getObservers() {
        return observers;
    }

    private String shopName;

    //Constructor to initialize a shop with a given name
    public Shop(String shopName){
        this.shopName = shopName;
    }

    //method to add observers
    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    //method to remove observers
    @Override
    public void removeObserver(Observer observer){
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    //method to notify all observers
    @Override
    public void notifyObservers(DeliveryRequest deliveryRequest){
        for(Observer observer : observers){
            observer.receiveDeliveryRequest(deliveryRequest);
        }
    }
}
