package designpatterns.Creational.Factory.Problem;

public class TransportService {
    public static void main(String[] args) {
        Transport Car = new Car();
        Transport Bike = new Bike();
        Car.deliver();
        Bike.deliver();
        // If we want to create new transport type, we need to add new implementation of
        // Transport, then we have to create an instance of it, then we use here.
        // This makes TransportService and Transport interface tighly coupled
        // Adding new types requires modifyiing client code, that's the violation of
        // open/close principle
    }
}
