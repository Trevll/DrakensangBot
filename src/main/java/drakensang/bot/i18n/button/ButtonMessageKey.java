package drakensang.bot.i18n.button;

import drakensang.bot.i18n.IMessageKey;

public enum ButtonMessageKey implements IMessageKey {
    BTN_MELT_GEMS("drakensang.bot.ui.btnMeltGems.name"),
    BTN_SELL_ITEMS("drakensang.bot.ui.btnSellItems.name"),
    BTN_BACK("drakensang.bot.ui.btnBack.name"),
    BTN_START("drakensang.bot.ui.btnStart.name");

    private final String key;

    ButtonMessageKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
