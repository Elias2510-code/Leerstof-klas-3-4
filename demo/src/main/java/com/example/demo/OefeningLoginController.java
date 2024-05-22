package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class OefeningLoginController {
    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnLogin;

    @FXML
    protected void loginUser() {
        String username = txtUsername.getText();
    }
}