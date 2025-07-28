package designpatterns.Creational.Singleton.Solution;


import java.util.Objects;

public class WithoutSingletonPattern {
    public static void main(String[] args) {
        AppSettings appSettings = AppSettings.getInstance();
        AppSettings appSettings1 = AppSettings.getInstance();

        System.out.println(Objects.equals(appSettings, appSettings1));
    }
}
