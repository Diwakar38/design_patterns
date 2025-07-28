package designpatterns.Behavioral.State.Solution;

public class CYCLING implements TransportationMode{
    @Override
    public int calETA() {
        return 8;
    }

    @Override
    public String getDirection() {
        return "Take yulu from NSP Metro Stn";
    }
}
