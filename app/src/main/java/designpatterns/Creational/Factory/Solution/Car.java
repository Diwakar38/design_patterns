package designpatterns.Creational.Factory.Solution;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by Car");
    }
}
