package drakensang.bot.ui;

import drakensang.bot.i18n.Messages;
import drakensang.bot.i18n.title.TitleMessageKey;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ViewManager {
    private Stage primaryStage;
    private Scene scene;

    public ViewManager(Stage primaryStage) {
        this.primaryStage = primaryStage;

        scene = new Scene(new javafx.scene.layout.Pane(), 600, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle(Messages.getValue(TitleMessageKey.PRIMARY_STAGE_TITLE));
        centerStage();
        primaryStage.show();
    }

    public void showMainMenu() {
        MainMenuView mainMenu = new MainMenuView(this);
        scene.setRoot(mainMenu.getView());
    }

    public void showMeltGemsView() {
        MeltGemsView meltGemsView = new MeltGemsView(this);
        scene.setRoot(meltGemsView.getView());
    }

    private void centerStage() {
        double width = scene.getWidth();
        double height = scene.getHeight();
        double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();
        double screenHeight = Screen.getPrimary().getVisualBounds().getHeight();
        primaryStage.setX((screenWidth - width) / 2);
        primaryStage.setY((screenHeight - height) / 2);
    }
}
