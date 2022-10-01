package com.example.javafx_login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import static javafx.stage.Stage.*;

public class HelloController {
    private static javafx.scene.Scene Scene;
    @FXML
    private Label username;
    @FXML
    private Label password;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordPasswordField;
    @FXML
    private Button button_login;
    @FXML
    private Button button_signup;
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private javafx.scene.Scene scene;

    public void loginButtonOn(){
        String Sql ="SELECT * FROM admin WHERE username = ? and password = ?";

        connect = DatabaseConnection.connectDb();

        try{
                prepare = connect.prepareStatement(Sql);
                prepare.setString(1, usernameTextField.getText());
                prepare.setString(1, passwordPasswordField.getText());

                result = prepare.executeQuery();
                Alert alert;

                if(usernameTextField.getText().isEmpty()||passwordPasswordField.getText().isEmpty()) {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("error message");
                    alert.setHeaderText("null");
                    alert.setContentText("please fill all the details");

                }else if (result.next()) {
                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("INFORMATION MESSAGE");
                    alert.setHeaderText("null");
                    alert.setContentText("successfully login");
                    button_login.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);

                    stage.setScene(scene);
                    stage.show();
                } else {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("error message");
                    alert.setHeaderText("null");
                    alert.setContentText("wrong username/password");
                }



        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }


    }
    public static void SignUp() throws IOException {
        Parent root;
        root = FXMLLoader.load(HelloController.class.getResource("Signupp.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(Scene);
        stage.show();
    }


}
