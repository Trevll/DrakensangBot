package drakensang.bot.ui.controller;

import drakensang.bot.i18n.Messages;
import drakensang.bot.i18n.button.ButtonMessageKey;
import drakensang.bot.ui.view.ViewManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController {

    @FXML
    private Button btnMeltGems;

    @FXML
    private Button btnSellItems;

    private ViewManager viewManager;

    public void setViewManager(ViewManager viewManager) {
        this.viewManager = viewManager;
    }

    @FXML
    public void initialize() {
        btnMeltGems.setText(Messages.getValue(ButtonMessageKey.BTN_MELT_GEMS));
        btnSellItems.setText(Messages.getValue(ButtonMessageKey.BTN_SELL_ITEMS));

        btnMeltGems.setOnAction(e -> {
            if (viewManager != null) {
                viewManager.showMeltGemsView();
            }
        });

        btnSellItems.setOnAction(e -> {
            // ...
        });
    }
}
