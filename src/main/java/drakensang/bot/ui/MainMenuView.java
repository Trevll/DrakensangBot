package drakensang.bot.ui;

import drakensang.bot.i18n.Messages;
import drakensang.bot.i18n.button.ButtonMessageKey;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainMenuView {
    private ViewManager viewManager;
    private VBox root;

    public MainMenuView(ViewManager viewManager) {
        this.viewManager = viewManager;
        createLayout();
    }

    private void createLayout() {
        root = new VBox(15);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER_LEFT);

        Button btnMeltGems = new Button(Messages.getValue(ButtonMessageKey.BTN_MELT_GEMS));
        btnMeltGems.getStyleClass().addAll("btn", "btn-primary");
        btnMeltGems.setOnAction(e -> viewManager.showMeltGemsView());

        Button btnSellItems = new Button(Messages.getValue(ButtonMessageKey.BTN_SELL_ITEMS));
        btnSellItems.getStyleClass().addAll("btn", "btn-primary");
        btnSellItems.setOnAction(e -> System.out.println(Messages.getValue(ButtonMessageKey.BTN_SELL_ITEMS) + " akce..."));

        root.getChildren().addAll(btnMeltGems, btnSellItems);
    }

    public VBox getView() {
        return root;
    }
}