package designpatterns.Behavioral.State.Solution;

public class TRAIN implements TransportationMode{
    @Override
    public int calETA() {
        return 4;
    }

    @Override
    public String getDirection() {
        return "Board the red line at Chandani Chowk";
    }
}
