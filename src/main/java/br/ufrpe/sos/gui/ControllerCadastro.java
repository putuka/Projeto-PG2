package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import br.ufrpe.sos.gui.Main;

public class ControlleCadastro {

    @FXML
    protected void perfil(ActionEvent e ){
        Main.trocaDeTela("telaPerfil");
    }

}
