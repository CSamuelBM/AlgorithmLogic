module org.example.ejemplosfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejemplosfx to javafx.fxml;
    exports org.example.ejemplosfx;
    exports Controller;
    opens Controller to javafx.fxml;
}