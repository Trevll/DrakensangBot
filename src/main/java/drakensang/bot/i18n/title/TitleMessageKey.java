package drakensang.bot.i18n.title;

import drakensang.bot.i18n.IMessageKey;

public enum TitleMessageKey implements IMessageKey {
    PRIMARY_STAGE_TITLE("drakensang.bot.i18n.primaryStage.title");

    private final String key;

    TitleMessageKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
