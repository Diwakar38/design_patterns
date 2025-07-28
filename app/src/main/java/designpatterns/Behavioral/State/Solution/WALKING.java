package designpatterns.Behavioral.State.Solution;

public class WALKING implements TransportationMode{
    @Override
    public int calETA() {
        return 10;
    }

    @Override
    public String getDirection() {
        return "Head north for 500m";
    }
}
