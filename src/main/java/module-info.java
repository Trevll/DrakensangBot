module org.example.drakensang_bot {
    requires javafx.controls;
    requires javafx.fxml;

    opens drakensang.bot.ui.controller to javafx.fxml;
    exports drakensang.bot;
}