package com.example.javafx_login;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class logincontroller {
    @FXML
    private Label welcome;
    @FXML
    private Button logout;

    public void logoutbuttononaction() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);

        stage.setScene(scene);
        stage.show();


    }
}