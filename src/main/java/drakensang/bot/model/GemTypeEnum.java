package drakensang.bot.model;

import drakensang.bot.i18n.gem.GemTypeMessageKey;
import drakensang.bot.i18n.Messages;

public enum GemTypeEnum {
    RUBY(Messages.getValue(GemTypeMessageKey.RUBY)),
    ONYX(Messages.getValue(GemTypeMessageKey.ONYX)),
    ZIRCON(Messages.getValue(GemTypeMessageKey.ZIRCON)),
    AMETHYST(Messages.getValue(GemTypeMessageKey.AMETHYST)),
    FROST_RESISTANCE(Messages.getValue(GemTypeMessageKey.FROST_RESISTANCE)),
    FIRE_RESISTANCE(Messages.getValue(GemTypeMessageKey.FIRE_RESISTANCE)),
    LIGHTNING_RESISTANCE(Messages.getValue(GemTypeMessageKey.LIGHTNING_RESISTANCE)),
    DARK_RESISTANCE(Messages.getValue(GemTypeMessageKey.DARK_RESISTANCE)),
    DIAMOND(Messages.getValue(GemTypeMessageKey.DIAMOND)),
    KYANITE(Messages.getValue(GemTypeMessageKey.KYANITE)),
    EMERALD(Messages.getValue(GemTypeMessageKey.EMERALD)),
    RHODOLITE(Messages.getValue(GemTypeMessageKey.RHODOLITE));

    private final String localizedName;

    GemTypeEnum(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getLocalizedName() {
        return localizedName;
    }
}