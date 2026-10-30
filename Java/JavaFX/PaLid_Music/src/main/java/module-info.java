module org.example.reproductor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.desktop;
    requires javafx.media;

    opens org.example.reproductor.Controller to javafx.fxml;
    exports org.example.reproductor;
    exports org.example.reproductor.Controller;
    exports org.example.reproductor.Model;
    opens org.example.reproductor.Model to javafx.fxml;
}