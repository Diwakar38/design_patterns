package designpatterns.Behavioral.State.Problem;

public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.Walking);

        System.out.println(directionService.getDirection());
        directionService.getETA();
    }
}
