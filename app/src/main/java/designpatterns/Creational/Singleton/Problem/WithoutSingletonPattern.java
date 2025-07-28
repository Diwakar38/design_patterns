package designpatterns.Creational.Singleton.Problem;


import java.util.Objects;

public class WithoutSingletonPattern {
    public static void main(String[] args) {
        AppSettings appSettings = new AppSettings();
        AppSettings appSettings1 = new AppSettings();

        System.out.println(Objects.equals(appSettings,appSettings1));
    }
}
