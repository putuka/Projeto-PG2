package br.ufrpe.sos.gui;

import br.ufrpe.sos.beans.pessoa.Tributo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerContribuinte implements Initializable {

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
    protected void perfil(ActionEvent e){
        ScreenManager.trocaDeTela("telaPerfil");
    }
    @FXML
    protected void ajuda(ActionEvent e){
        ScreenManager.trocaDeTela("telaAjuda");
    }
    @FXML
    private TextField quantidade;
    @FXML
    private ComboBox<Tributo> tributo;
    @FXML
    private void listTributo(){
        List<Tributo> tributos = new ArrayList<>();
        ObservableList<Tributo> obstributo;

        Tributo dinheiro = new Tributo("Valor Monetário");
        Tributo racao = new Tributo("Ração");
        Tributo remedio = new Tributo("Remédios");

        tributos.add(dinheiro);
        tributos.add(racao);
        tributos.add(remedio);

        obstributo = FXCollections.observableArrayList(tributos);
        tributo.setItems(obstributo);
    }
    //TODO metodo

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listTributo();
    }
}
