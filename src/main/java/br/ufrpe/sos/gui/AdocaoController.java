package br.ufrpe.sos.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AdocaoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}