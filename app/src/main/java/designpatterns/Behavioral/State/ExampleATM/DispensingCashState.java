package designpatterns.Behavioral.State.ExampleATM;

public class DispensingCashState implements State{
    @Override
    public void display() {
        System.out.println("Dispensing Cash, please collect");
    }
}
