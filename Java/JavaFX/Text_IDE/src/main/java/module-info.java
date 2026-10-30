module dhutext.dhutext {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.fxmisc.richtext;
    requires reactfx;

    opens Controlador to javafx.fxml;
    opens vista to javafx.fxml;
    opens img;
    opens css;

    exports Main;
}