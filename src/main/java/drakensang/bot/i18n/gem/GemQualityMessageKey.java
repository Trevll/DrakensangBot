package drakensang.bot.i18n.gem;

import drakensang.bot.i18n.IMessageKey;

public enum GemQualityMessageKey implements IMessageKey {
    SHATTERED("drakensang.bot.i18n.gem.quality.shattered"),
    NORMAL("drakensang.bot.i18n.gem.quality.normal"),
    POLISHED("drakensang.bot.i18n.gem.quality.polished");

    private final String key;

    GemQualityMessageKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}