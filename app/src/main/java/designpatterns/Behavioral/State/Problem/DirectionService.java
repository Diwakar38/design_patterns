package designpatterns.Behavioral.State.Problem;

enum TransportationMode {
    Walking, Cycling, Car, Train
}

public class DirectionService {
    private TransportationMode mode;
    public DirectionService(TransportationMode mode) {
        this.mode = mode;
    }
    public void setMode(TransportationMode mode) {
        this.mode = mode;
    }
    //Method to calculate ETA based on transportation mode
    public int getETA() {
        switch (mode) {
            case Walking -> {
                System.out.println("Calculating ETA for Walking...10");
                return 10;
            }
            case Car -> {
                System.out.println("Calculating ETA for Car...7");
                return 7;
            }
            case Train -> {
                System.out.println("Calculating ETA for Train...5");
                return 5;
            }
            case Cycling -> {
                System.out.println("Calculating ETA for Cycling...8");
                return 8;
            }
            default -> throw new IllegalArgumentException("Unknown mode");
        }
    }

    public String getDirection() {
        switch (mode) {
            case Walking -> {
                System.out.println("Calculating Directions for Walking...");
                return "Head north for 500m";
            }
            case Car -> {
                System.out.println("Calculating Directions for Car...");
                return "Use highway 50m downtown";
            }
            case Train -> {
                System.out.println("Calculating Directions for Train...");
                return "Board the red line at Chandani Chowk";
            }
            case Cycling -> {
                System.out.println("Calculating Directions for Cycling...");
                return "Take yulu from NSP Metro Stn";
            }
            default -> throw new IllegalArgumentException("Unknown mode");
        }
    }
}
