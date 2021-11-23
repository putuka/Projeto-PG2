package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import br.ufrpe.sos.gui.Main;

public class ControllerDoarAnonimoConcluido {

    @FXML
    protected void voltar (ActionEvent a){

        Main.trocaDeTela("telaDoarAnonimo");
    }



}
