package drakensang.bot.config;

import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(ConfigManager.class.getResourceAsStream("/drakensang/bot/config/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException("❌ Chyba při načítání config.properties", e);
        }
    }

    public static <T> T getValue(Class<T> resultClass, String key) {
        String value = properties.getProperty(key);

        if (value == null) {
            throw new RuntimeException("❌ CHYBA: Klíč `" + key + "` nebyl nalezen v konfiguraci!");
        }

        try {
            if (resultClass == Integer.class) {
                return resultClass.cast(Integer.parseInt(value));
            } else if (resultClass == Boolean.class) {
                return resultClass.cast(Boolean.parseBoolean(value));
            } else if (resultClass == Double.class) {
                return resultClass.cast(Double.parseDouble(value));
            } else if (resultClass == Long.class) {
                return resultClass.cast(Long.parseLong(value));
            } else {
                return resultClass.cast(value);
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("❌ CHYBA: Hodnota `" + key + "` není platné číslo!", e);
        }
    }
}
