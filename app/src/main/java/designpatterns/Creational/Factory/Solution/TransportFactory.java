package designpatterns.Creational.Factory.Solution;

public class TransportFactory {
    public static Transport createTransport(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            default -> throw new IllegalArgumentException("Unsupported transport type");
        };
    }
}
