package designpatterns.Behavioral.State.ExampleATM;

public class ProcessingState implements State{
    @Override
    public void display() {
        System.out.println("Payment under process");
    }
}
