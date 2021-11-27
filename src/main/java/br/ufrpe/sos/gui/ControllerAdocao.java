package br.ufrpe.sos.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerAdocao {

    @FXML
    protected void doar (ActionEvent e ){
        ScreenManager.trocaDeTela("telaDoar");
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
    protected void ajuda(ActionEvent e){
        ScreenManager.trocaDeTela("telaAjuda");
    }


}



