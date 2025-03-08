package drakensang.bot.run;

import drakensang.bot.ui.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class DrakensangBotApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        ViewManager viewManager = new ViewManager(primaryStage);
        viewManager.showMainMenu();
    }

    public static void main(String[] args) {
        launch(args);
    }
}