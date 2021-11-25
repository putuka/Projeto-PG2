package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerAjuda {

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
    protected void contribuinte(ActionEvent e){
        Main.trocaDeTela("telaContribuinte");
    }
    @FXML
    protected void perfil(ActionEvent e){
        Main.trocaDeTela("telaPerfil");
    }
    @FXML
    protected void ajuda1(ActionEvent e){
        Main.trocaDeTela("telaAjuda1");
    }

    @FXML
    protected void voltar(ActionEvent b){
        Main.trocaDeTela("telaAjuda");
    }
    @FXML
    protected void ajuda2(ActionEvent a){
        Main.trocaDeTela("telaAjuda2");
    }
    @FXML
    protected void ajuda3(ActionEvent a){
        Main.trocaDeTela("telaAjuda3");
    }
    @FXML
    protected void ajuda4(ActionEvent a){
        Main.trocaDeTela("telaAjuda4");
    }
    @FXML
    protected void ajuda5(ActionEvent a){
        Main.trocaDeTela("telaAjuda5");
    }


}
