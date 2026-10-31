module login.practica_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens login.practica_1 to javafx.fxml;
    exports login.practica_1;
}