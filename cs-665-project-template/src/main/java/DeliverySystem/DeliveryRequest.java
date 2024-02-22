/**
 * Name: Yueyihan Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: DeliveryRequest.java
 * Description:This class represents a delivery request in the delivery system. It contains information about the request, such as the description of the delivery.
 */

package DeliverySystem;

public class DeliveryRequest {
    private String request;

    //Constructor to initialize a delivery request with a description
    public DeliveryRequest(String request){
        this.request = request;
    }

    //Method to retrieve the description of the delivery request
    public String getRequest() {
        return request;
    }
}
