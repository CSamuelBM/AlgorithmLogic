package util.notification;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Notification_Util {

    public void ShowNotification(String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.initStyle(StageStyle.TRANSPARENT);

        Label label = new Label(message);
        label.getStyleClass().add("text-secundary-white");
        label.setWrapText(true);
        label.setAlignment(Pos.CENTER);

        Button closeButton = new Button("Aceptar");
        closeButton.getStyleClass().add("button-purple-alert");
        closeButton.setOnAction(e -> window.close());

        ImageView image = new ImageView(new Image(getClass().getResource(
                "/assets/img/AppMainLogo.png").toExternalForm()));
        image.setFitWidth(100);
        image.setPreserveRatio(true);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(image, label, closeButton);
        layout.setAlignment(Pos.CENTER);

        layout.getStyleClass().add("card-notification");

        Scene scene = new Scene(layout);
        scene.setFill(Color.TRANSPARENT);

        scene.getStylesheets().add(getClass().getResource(
                "/style/Global_Style.css").toExternalForm());
        scene.getStylesheets().add(getClass().getResource(
                "/style/Alert_Style.css").toExternalForm());

        window.setScene(scene);
        window.showAndWait();
    }

    public void ShowError(String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.initStyle(StageStyle.TRANSPARENT);

        Label label = new Label(message);
        label.getStyleClass().add("text-secundary-white");
        label.setWrapText(true);
        label.setAlignment(Pos.CENTER);

        Button closeButton = new Button("Aceptar");
        closeButton.getStyleClass().add("button-purple-alert");
        closeButton.setOnAction(e -> window.close());

        ImageView image = new ImageView(new Image(getClass().getResource(
                "/assets/img/AppMainLogo.png").toExternalForm()));
        image.setFitWidth(100);
        image.setPreserveRatio(true);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(image, label, closeButton);
        layout.setAlignment(Pos.CENTER);

        layout.getStyleClass().add("card-notification-error");

        Scene scene = new Scene(layout);
        scene.setFill(Color.TRANSPARENT);

        scene.getStylesheets().add(getClass().getResource(
                "/style/Global_Style.css").toExternalForm());
        scene.getStylesheets().add(getClass().getResource(
                "/style/Alert_Style.css").toExternalForm());

        window.setScene(scene);
        window.showAndWait();
    }

    public void ShowSuccess(String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.initStyle(StageStyle.TRANSPARENT);

        Label label = new Label(message);
        label.getStyleClass().add("text-secundary-white");
        label.setWrapText(true);
        label.setAlignment(Pos.CENTER);

        Button closeButton = new Button("Aceptar");
        closeButton.getStyleClass().add("button-purple-alert");
        closeButton.setOnAction(e -> window.close());

        ImageView image = new ImageView(new Image(getClass().getResource(
                "/assets/img/AppMainLogo.png").toExternalForm()));
        image.setFitWidth(100);
        image.setPreserveRatio(true);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(image, label, closeButton);
        layout.setAlignment(Pos.CENTER);

        layout.getStyleClass().add("card-notification-success");

        Scene scene = new Scene(layout);
        scene.setFill(Color.TRANSPARENT);

        scene.getStylesheets().add(getClass().getResource(
                "/style/Global_Style.css").toExternalForm());
        scene.getStylesheets().add(getClass().getResource(
                "/style/Alert_Style.css").toExternalForm());

        window.setScene(scene);
        window.showAndWait();
    }

}
