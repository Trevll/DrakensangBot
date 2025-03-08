package drakensang.bot.ui;

import drakensang.bot.i18n.Messages;
import drakensang.bot.i18n.button.ButtonMessageKey;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MeltGemsView {
    private ViewManager viewManager;
    private BorderPane root;

    public MeltGemsView(ViewManager viewManager) {
        this.viewManager = viewManager;
        createLayout();
    }

    private void createLayout() {
        root = new BorderPane();
        root.setPadding(new Insets(20));

        HBox bottomBox = new HBox(15);
        bottomBox.setAlignment(Pos.CENTER);

        Button btnBack = new Button(Messages.getValue(ButtonMessageKey.BTN_BACK));
        btnBack.getStyleClass().addAll("btn", "btn-primary");
        btnBack.setOnAction(e -> viewManager.showMainMenu());

        Button btnStart = new Button(Messages.getValue(ButtonMessageKey.BTN_START));
        btnStart.getStyleClass().addAll("btn", "btn-primary");
        btnStart.setOnAction(e -> System.out.println("Start akce..."));

        bottomBox.getChildren().addAll(btnBack, btnStart);
        root.setBottom(bottomBox);
    }

    public BorderPane getView() {
        return root;
    }
}