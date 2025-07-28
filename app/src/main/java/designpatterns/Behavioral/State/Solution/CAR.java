package designpatterns.Behavioral.State.Solution;

public class CAR implements TransportationMode{
    @Override
    public int calETA() {
        return 6;
    }

    @Override
    public String getDirection() {
        return "Use highway 50m downtown";
    }
}
