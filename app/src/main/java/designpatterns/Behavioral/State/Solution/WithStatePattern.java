package designpatterns.Behavioral.State.Solution;

public class WithStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new CAR());
        System.out.println(directionService.getETA());
        System.out.println(directionService.getDirection());
    }
}
