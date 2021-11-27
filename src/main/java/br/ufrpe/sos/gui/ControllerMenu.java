package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerMenu {

    //INICIANDO TELA CADASTRO
    @FXML
    protected void cadastro(ActionEvent e){
        ScreenManager.trocaDeTela("telaCadastro");
    }
    @FXML
    protected void login(ActionEvent e){
        ScreenManager.trocaDeTela("telaLogin");
    }
    @FXML
    protected void anonimo(ActionEvent e){
        ScreenManager.trocaDeTela("telaDoarAnonimo");
    }


}