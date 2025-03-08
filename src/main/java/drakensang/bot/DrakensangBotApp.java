package drakensang.bot;

import drakensang.bot.config.ApplicationSettings;
import drakensang.bot.i18n.Messages;
import drakensang.bot.i18n.title.TitleMessageKey;
import drakensang.bot.ui.controller.MainMenuController;
import drakensang.bot.ui.view.ViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class DrakensangBotApp extends Application {
    private ViewManager viewManager;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ApplicationSettings.MAIN_MENU_FXML_PATH));
        Scene scene = createScene(loader.load());

        viewManager = new ViewManager(scene);
        setupController(loader);
        setupStage(primaryStage, scene);
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Scene createScene(Parent root) {
        Scene scene = new Scene(root, ApplicationSettings.WINDOW_WIDTH, ApplicationSettings.WINDOW_HEIGHT);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(ApplicationSettings.STYLESHEET_PATH)).toExternalForm());
        return scene;
    }

    private void setupStage(Stage stage, Scene scene) {
        stage.setTitle(Messages.getValue(TitleMessageKey.PRIMARY_STAGE_TITLE));
        stage.setScene(scene);
        stage.show();
    }

    private void setupController(FXMLLoader loader) {
        try {
            MainMenuController controller = loader.getController();
            controller.setViewManager(viewManager);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}