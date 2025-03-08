package drakensang.bot.i18n;

import java.util.ResourceBundle;

public class Messages {
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("drakensang.bot.i18n.messages");

    public static String getValue(IMessageKey key) {
        return BUNDLE.getString(key.getKey());
    }
}
