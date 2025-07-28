package designpatterns.Creational.Builder.Problem;

public class WithoutBuilderPattern {
    public static void main(String[] args) {
        House house = new House("Concrete", "Wood", "Shingles", true, false, true);
        System.out.println(house);
        // Problems:
        // Constructor explosion -> Too many constructors
        // Due to many parameters, it's difficult to understand and maintain
    }
}
