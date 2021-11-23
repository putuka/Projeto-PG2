package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import br.ufrpe.sos.gui.Main;

public class ControllerMenu {

    //INICIANDO TELA CADASTRO
    @FXML
    protected void cadastro(ActionEvent e){
        Main.trocaDeTela("telaCadastro");
    }
    @FXML
    protected void login(ActionEvent e){
        Main.trocaDeTela("telaLogin");
    }
    @FXML
    protected void anonimo(ActionEvent e){
        Main.trocaDeTela("telaDoarAnonimo");
    }


}