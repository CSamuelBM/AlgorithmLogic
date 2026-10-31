package util.navigation;

import javafx.animation.FadeTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import util.notification.Notification_Util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Navigation_Util {

    private static StackPane container;
    private static final Map<String, String> routes = new HashMap<>();

    public static void screen(StackPane contenido) {
        container = contenido;

        routes.put("login", "/views/login_record/Login_View.fxml");
        routes.put("record", "/views/login_record/Record_View.fxml");
        routes.put("recordVeterinary", "/views/veterinary/Record_Veterinary_View.fxml");
        routes.put("recordCustomer", "/views/customer/Record_Customer_View.fxml");
        routes.put("portalCustomer", "/views/customer/Portal_Customer_View.fxml");
        routes.put("veterinaryAvailable", "/views/customer/veterinary/Veterinary_Available_View.fxml");
        routes.put("pet", "/views/customer/pet/Pet_View.fxml");
        routes.put("recordPet", "/views/customer/pet/Record_Pet_View.fxml");
        routes.put("appointment", "/views/customer/appointment/Appointment_View.fxml");
        routes.put("recordAppointment", "/views/customer/appointment/Record_Appointment_View.fxml");
        routes.put("portalVeterinary", "/views/veterinary/Veterinary_View.fxml");
    }

    public static void browse(String nombrePantalla) {
        String fxmlPantalla = routes.get(nombrePantalla);
        Notification_Util notificationUtil = new Notification_Util();

        if (fxmlPantalla == null || fxmlPantalla.isEmpty()) {
            notificationUtil.ShowError("Error: La pantalla '%s' no se encontró en el diccionario de rutas.\\n\", nombrePantalla");
            return;
        }

        try {
            Parent parent = FXMLLoader.load(Navigation_Util.class.getResource(fxmlPantalla));

            browseAnimated(parent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void browseAnimated(Parent parent) {
        if (parent instanceof Region region) {
            region.prefWidthProperty().bind(container.widthProperty());
            region.prefHeightProperty().bind(container.heightProperty());
            region.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        }

        Parent previousView = null;
        if (!container.getChildren().isEmpty()) previousView = (Parent) container.getChildren().get(0);

        parent.setOpacity(0);

        container.getChildren().add(parent);

        FadeTransition entrance = new FadeTransition(Duration.millis(250), parent);

        entrance.setFromValue(0);
        entrance.setToValue(1);

        FadeTransition exit = null;

        if (previousView != null) {
            exit = new FadeTransition(Duration.millis(250), previousView);

            exit.setFromValue(1);
            exit.setToValue(0);
        }

        Parent finalView = previousView;

        entrance.setOnFinished(e -> {

            if (finalView != null) {
                container.getChildren().remove(finalView);
            }

        });

        if (exit != null) exit.play();

        entrance.play();
    }
}