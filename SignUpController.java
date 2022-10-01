package com.example.javafx_login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignUpController {
    private static javafx.scene.Scene Scene;
    @FXML
    private Label username;
    @FXML
    private Label password;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_password;
    @FXML
    private Button button_signup;
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private javafx.scene.Scene scene;

    public SignUpController() {
    }

    public void Signup(ActionEvent event) throws SQLException {
        String Username = tf_username.getText();
        String password = tf_password.getText();
        connect = DatabaseConnection.connectDb();
        PreparedStatement psinsert = null;
        PreparedStatement pscheck = null;
        ResultSet resultSet = null;

        try {
            pscheck = connect.prepareStatement("select * from signup where username= ?");
            pscheck.setString(1, Username);
            resultSet = pscheck.executeQuery();
            Alert alert;
            if (resultSet.isBeforeFirst()) {
                System.out.println("User Already Exis.ts..");
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("INFORMATION MESSAGE");
                alert.setHeaderText("null");
                alert.setContentText("successfully login");
            } else {

                psinsert = connect.prepareStatement("insert into signup VALUES (?,?,?,?,?,?)");
                psinsert.setString(1, Username);
                psinsert.setString(2, password);
                psinsert.executeUpdate();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("INFORMATION MESSAGE");
                alert.setHeaderText("null");
                alert.setContentText("successfully login");


            }
        } catch (SQLException ep) {
            ep.printStackTrace();
        }

    }

    public Label getUsername() {
        return username;
    }

    public void setUsername(Label username) {
        this.username = username;
    }

    public Label getPassword() {
        return password;
    }
}

