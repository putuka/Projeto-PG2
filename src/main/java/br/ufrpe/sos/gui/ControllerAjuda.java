package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerAjuda {

    @FXML
    protected void doar (ActionEvent e ){
        ScreenManager.trocaDeTela("telaDoar");
    }
    @FXML
    protected void adotar(ActionEvent e){
        ScreenManager.trocaDeTela("telaAdocao");
    }
    @FXML
    protected void apadrinhamento(ActionEvent e){
        ScreenManager.trocaDeTela("telaApadrinhamento");
    }
    @FXML
    protected void contribuinte(ActionEvent e){
        ScreenManager.trocaDeTela("telaContribuinte");
    }
    @FXML
    protected void perfil(ActionEvent e){
        ScreenManager.trocaDeTela("telaPerfil");
    }
    @FXML
    protected void ajuda1(ActionEvent e){
        ScreenManager.trocaDeTela("telaAjuda1");
    }

    @FXML
    protected void voltar(ActionEvent b){
        ScreenManager.trocaDeTela("telaAjuda");
    }
    @FXML
    protected void ajuda2(ActionEvent a){
        ScreenManager.trocaDeTela("telaAjuda2");
    }
    @FXML
    protected void ajuda3(ActionEvent a){
        ScreenManager.trocaDeTela("telaAjuda3");
    }
    @FXML
    protected void ajuda4(ActionEvent a){
        ScreenManager.trocaDeTela("telaAjuda4");
    }
    @FXML
    protected void ajuda5(ActionEvent a){
        ScreenManager.trocaDeTela("telaAjuda5");
    }


}
