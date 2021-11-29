package br.ufrpe.sos.gui;

import br.ufrpe.sos.beans.animal.Animal;
import br.ufrpe.sos.beans.animal.Saude;
import br.ufrpe.sos.controller.Facades;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerDoarAnonimo implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtRaca;
    @FXML
    private TextField txtDescricao;
    @FXML
    private ComboBox<Saude> saude;
    @FXML
    private void listaSaude(){
        List<Saude> saudes = new ArrayList<>();
        ObservableList<Saude> obssaude;

        Saude saudavel = new Saude("Saudável");
        Saude cuidadosLeves = new Saude("Cuidados Leves");
        Saude estadoGrave = new Saude("Estado grave");

        saudes.add(saudavel);
        saudes.add(cuidadosLeves);
        saudes.add(estadoGrave);

        obssaude = FXCollections.observableArrayList(saudes);
        saude.setItems(obssaude);
    }

@FXML
    protected void voltar (ActionEvent a){
    ScreenManager.trocaDeTela("telaMenu");
}

    public void DoarAnimalAnonimo(ActionEvent Event) {
        Animal a = null;
        if (validarInputs()) {
            a = new Animal(this.txtRaca.getText(), this.txtNome.getText(), this.txtDescricao.getText(), LocalDateTime.now(), false);

        }
        try {
            Facades.getInstance().inserirA(a);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Doação Efetuada");
            alert.setHeaderText("Doação efetuada com sucesso!");
            alert.showAndWait();
        } catch (Exception exception) {
            // TODO Tratar exceção com mensagem na tela
        }
        this.limparCampos();
        ScreenManager.trocaDeTela("telaDoarAnonimoConcluido");
    }

    public void limparCampos(){
        this.txtNome.setText("");
        this.txtDescricao.setText("");
        this.txtRaca.setText("");

    }

    private boolean validarInputs(){
        String errorMessage = "";

        if (txtNome.getText() == null || txtNome.getText().length() == 0){
            errorMessage += "Preencha o nome!\n";
        }

        if(txtRaca.getText() == null || txtRaca.getText().length() == 0){
            errorMessage += "Preencha a raça\n";
        }
        if(txtDescricao.getText() == null || txtDescricao.getText().length() == 0){
            errorMessage += "Preencha a descrição\n";
        }
        if (errorMessage.length() == 0){
            return true;
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Campos da doação inválidos");
            alert.setHeaderText("Por favor, corrija os campos inválidos para que possamos concluir sua doação!");
            alert.setContentText(errorMessage);
            alert.showAndWait();
            return false;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listaSaude();
    }
}

