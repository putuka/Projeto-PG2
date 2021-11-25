package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerContribuinte {

    @FXML
    protected void doar (ActionEvent e ){
        Main.trocaDeTela("telaDoar");
    }

    @FXML
    protected void adotar(ActionEvent e){
        Main.trocaDeTela("telaAdocao");
    }
    @FXML
    protected void apadrinhamento(ActionEvent e){
        Main.trocaDeTela("telaApadrinhamento");
    }
    @FXML
    protected void perfil(ActionEvent e){
        Main.trocaDeTela("telaPerfil");
    }
    @FXML
    protected void ajuda(ActionEvent e){
        Main.trocaDeTela("telaAjuda");
    }








}
