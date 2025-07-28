package designpatterns.Creational.Singleton.Problem;

public class AppSettings {
    private String databaseUrl;
    private String apiKey;
    public AppSettings() {
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "123456";
    }
    public String getDatabaseUrl() {
        return databaseUrl;
    }
    public String getApiKey(){
        return apiKey;
    }
}
