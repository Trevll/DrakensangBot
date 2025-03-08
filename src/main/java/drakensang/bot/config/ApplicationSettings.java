package drakensang.bot.config;

public class ApplicationSettings {
    public static final double WINDOW_WIDTH = ConfigManager.getValue(Double.class, "drakensang.bot.window.width");
    public static final double WINDOW_HEIGHT = ConfigManager.getValue(Double.class, "drakensang.bot.window.height");
    public static final String MAIN_MENU_FXML_PATH = ConfigManager.getValue(String.class, "drakensang.bot.fxml.mainMenu");
    public static final String STYLESHEET_PATH = ConfigManager.getValue(String.class, "drakensang.bot.style.stylesheet");
}
