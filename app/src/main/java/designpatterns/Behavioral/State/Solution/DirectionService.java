package designpatterns.Behavioral.State.Solution;

public class DirectionService {
    TransportationMode transportationMode;
    DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }
    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }
    //Delegating work to concrete classes
    public int getETA() {
        return transportationMode.calETA();
    }
    public String getDirection() {
        return transportationMode.getDirection();
    }
}
