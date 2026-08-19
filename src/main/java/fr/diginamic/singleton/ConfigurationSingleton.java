package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigurationSingleton {
    private static ConfigurationSingleton instance = null;
    private static ResourceBundle bundle;

    private ConfigurationSingleton() {
        bundle = ResourceBundle.getBundle("configuration");
    };

    public static ConfigurationSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigurationSingleton();
        }
        return instance;
    }

    public String getString(String key) {
        return bundle.getString(key);
    }
}
