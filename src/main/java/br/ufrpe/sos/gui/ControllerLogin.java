package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import br.ufrpe.sos.gui.Main;

public class ControllerLogin {

    @FXML
    private void perfil(ActionEvent e){
        Main.trocaDeTela("telaPerfil");
    }

}
