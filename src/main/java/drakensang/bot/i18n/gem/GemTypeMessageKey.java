package drakensang.bot.i18n.gem;

import drakensang.bot.i18n.IMessageKey;

public enum GemTypeMessageKey implements IMessageKey {
    RUBY("drakensang.bot.i18n.gem.type.ruby"),
    ONYX("drakensang.bot.i18n.gem.type.onyx"),
    ZIRCON("drakensang.bot.i18n.gem.type.zircon"),
    AMETHYST("drakensang.bot.i18n.gem.type.amethyst"),
    FROST_RESISTANCE("drakensang.bot.i18n.gem.type.frost_resistance"),
    FIRE_RESISTANCE("drakensang.bot.i18n.gem.type.fire_resistance"),
    LIGHTNING_RESISTANCE("drakensang.bot.i18n.gem.type.lightning_resistance"),
    DARK_RESISTANCE("drakensang.bot.i18n.gem.type.dark_resistance"),
    DIAMOND("drakensang.bot.i18n.gem.type.diamond"),
    KYANITE("drakensang.bot.i18n.gem.type.kyanite"),
    EMERALD("drakensang.bot.i18n.gem.type.emerald"),
    RHODOLITE("drakensang.bot.i18n.gem.type.rhodolite");

    private final String key;

    GemTypeMessageKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
