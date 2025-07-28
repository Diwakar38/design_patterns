package designpatterns.Creational.Factory.Solution;

public class TransportService {
    public static void main(String[] args) {
        Transport vehicle = TransportFactory.createTransport("bike");
        vehicle.deliver();
    }
}
