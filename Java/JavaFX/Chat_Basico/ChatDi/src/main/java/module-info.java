module app.chatdi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    opens Controller to javafx.fxml;
    opens View to javafx.fxml;

    exports App;
    opens App to javafx.fxml;
    exports Servicios;
    opens Servicios to javafx.fxml;
}