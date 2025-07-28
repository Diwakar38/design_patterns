package designpatterns.Behavioral.State.ExampleATM;

public class IdleState implements State{
    @Override
    public void display() {
        System.out.println("Machine is Idle");
    }
}
