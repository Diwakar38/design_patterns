package designpatterns.Behavioral.State.ExampleATM;

public class StateService {
    State state;
    StateService(State state) {
        this.state = state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void displayState() {
        state.display();
    }
}
