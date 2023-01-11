package com.example.frap1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button registerButton;

    @FXML
    private Button sigUpButton;

    @FXML
    void initialize() {
        registerButton.setOnAction(actionEvent -> {
            registerButton.getScene().getWindow().hide();
            FXMLLoader loading = new FXMLLoader();
            loading.setLocation(getClass().getResource("/com/example/frap1/registerwindow.fxml"));
            try {
                loading.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loading.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }

}
