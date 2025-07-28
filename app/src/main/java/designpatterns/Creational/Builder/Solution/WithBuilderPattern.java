package designpatterns.Creational.Builder.Solution;

public class WithBuilderPattern {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Bedrock","Wooden","Tiles")
                .setGarage(true)
                .setGarden(true)
                .setSwimmingPool(false)
                .build();
        System.out.println(house.toString());
    }
}
