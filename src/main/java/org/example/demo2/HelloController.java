package org.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private void ouvreAccueil() {
        try {
            VBox voirAccueil = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
            Scene sceneAccueil = new Scene(voirAccueil);

            Stage stage = (Stage) voirAccueil.getScene().getWindow();
            stage.setScene(sceneAccueil);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}