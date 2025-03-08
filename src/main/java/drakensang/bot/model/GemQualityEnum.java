package drakensang.bot.model;

import drakensang.bot.i18n.gem.GemQualityMessageKey;
import drakensang.bot.i18n.Messages;

public enum GemQualityEnum {
    SHATTERED(Messages.getValue(GemQualityMessageKey.SHATTERED)),
    NORMAL(Messages.getValue(GemQualityMessageKey.NORMAL)),
    POLISHED(Messages.getValue(GemQualityMessageKey.POLISHED));

    private final String localizedName;

    GemQualityEnum(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getLocalizedName() {
        return localizedName;
    }
}
