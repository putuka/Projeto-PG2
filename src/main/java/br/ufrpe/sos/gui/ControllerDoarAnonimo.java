package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import br.ufrpe.sos.gui.Main;

public class ControllerDoarAnonimo {

@FXML
    protected void voltar (ActionEvent a){
    Main.trocaDeTela("telaMenu");
}

@FXML
    protected void doar (ActionEvent a){
    Main.trocaDeTela("telaDoarAnonimoConcluido");
}

}
