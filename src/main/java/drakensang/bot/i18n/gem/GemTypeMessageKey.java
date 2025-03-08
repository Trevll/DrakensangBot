package drakensang.bot.i18n.gem;

import drakensang.bot.i18n.IMessageKey;

public enum GemTypeMessageKey implements IMessageKey {
    RUBY("drakensang.bot.ui.gem.type.ruby"),
    ONYX("drakensang.bot.ui.gem.type.onyx"),
    ZIRCON("drakensang.bot.ui.gem.type.zircon"),
    AMETHYST("drakensang.bot.ui.gem.type.amethyst"),
    FROST_RESISTANCE("drakensang.bot.ui.gem.type.frost_resistance"),
    FIRE_RESISTANCE("drakensang.bot.ui.gem.type.fire_resistance"),
    LIGHTNING_RESISTANCE("drakensang.bot.ui.gem.type.lightning_resistance"),
    DARK_RESISTANCE("drakensang.bot.ui.gem.type.dark_resistance"),
    DIAMOND("drakensang.bot.ui.gem.type.diamond"),
    KYANITE("drakensang.bot.ui.gem.type.kyanite"),
    EMERALD("drakensang.bot.ui.gem.type.emerald"),
    RHODOLITE("drakensang.bot.ui.gem.type.rhodolite");

    private final String key;

    GemTypeMessageKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
