package designpatterns.Creational.Singleton.Solution;

public class AppSettings {
    // Step 1: Private static instance of a class
    private static AppSettings instance;
    private String databaseUrl;
    private String apiKey;

    // Step 2: Private constructor to prevent direct object creation
    private AppSettings() {
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "123456";
    }

    //Step 3: Public static method to get the single instance
    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
