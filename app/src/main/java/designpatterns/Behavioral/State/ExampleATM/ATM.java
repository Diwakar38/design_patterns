package designpatterns.Behavioral.State.ExampleATM;

public class ATM {
    public static void main(String[] args) {
        StateService stateService = new StateService(new IdleState());
        stateService.displayState();
        stateService.setState(new ProcessingState());
        stateService.displayState();
        stateService.setState(new DispensingCashState());
        stateService.displayState();
    }
}
