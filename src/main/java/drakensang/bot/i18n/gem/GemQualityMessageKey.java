package drakensang.bot.i18n.gem;

import drakensang.bot.i18n.IMessageKey;

public enum GemQualityMessageKey implements IMessageKey {
    SHATTERED("drakensang.bot.ui.gem.quality.shattered"),
    NORMAL("drakensang.bot.ui.gem.quality.normal"),
    POLISHED("drakensang.bot.ui.gem.quality.polished");

    private final String key;

    GemQualityMessageKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}