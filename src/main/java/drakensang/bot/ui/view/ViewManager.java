package drakensang.bot.ui.view;

import javafx.scene.Scene;

public class ViewManager {
    private Scene scene;

    public ViewManager(Scene scene) {
        this.scene = scene;
    }

    public void showMainMenu() {
        MainMenuView mainMenu = new MainMenuView(this);
        scene.setRoot(mainMenu.getView());
    }

    public void showMeltGemsView() {
        MeltGemsView meltGemsView = new MeltGemsView(this);
        scene.setRoot(meltGemsView.getView());
    }
}
