package drakensang.bot.i18n.button;

import drakensang.bot.i18n.IMessageKey;

public enum ButtonMessageKey implements IMessageKey {
    BTN_MELT_GEMS("drakensang.bot.i18n.btnMeltGems.name"),
    BTN_SELL_ITEMS("drakensang.bot.i18n.btnSellItems.name"),
    BTN_BACK("drakensang.bot.i18n.btnBack.name"),
    BTN_START("drakensang.bot.i18n.btnStart.name");

    private final String key;

    ButtonMessageKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
