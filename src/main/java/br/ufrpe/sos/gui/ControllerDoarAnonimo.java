package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerDoarAnonimo {

@FXML
    protected void voltar (ActionEvent a){
    ScreenManager.trocaDeTela("telaMenu");
}

@FXML
    protected void doar (ActionEvent a){
    ScreenManager.trocaDeTela("telaDoarAnonimoConcluido");
}

}
