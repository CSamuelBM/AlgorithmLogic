module app.chatdi {
    requires javafx.controls;
    requires javafx.fxml;

    opens Controller to javafx.fxml;
    opens View to javafx.fxml;

    exports App;
    opens App to javafx.fxml;
}