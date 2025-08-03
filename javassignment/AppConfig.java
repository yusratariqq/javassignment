public class AppConfig {
    private static AppConfig instance;
    public String config;

    private AppConfig() {
        config = "Default Settings";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        System.out.println(config.config);
    }
}
