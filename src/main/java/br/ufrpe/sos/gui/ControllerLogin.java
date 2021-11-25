package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerLogin {

    @FXML
    private void perfil(ActionEvent e){
        Main.trocaDeTela("telaPerfil");
    }

}
