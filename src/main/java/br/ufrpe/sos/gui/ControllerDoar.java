package br.ufrpe.sos.gui;

import br.ufrpe.sos.beans.animal.Animal;
import br.ufrpe.sos.beans.animal.Saude;
import br.ufrpe.sos.beans.animal.Vacina;
import br.ufrpe.sos.controller.Facades;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerDoar implements Initializable {

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

        Saude saudavel = new Saude("Saudavel");
        Saude cuidadosLeves = new Saude("Cuidados Leves");
        Saude estadoGrave = new Saude("Estado grave");

        saudes.add(saudavel);
        saudes.add(cuidadosLeves);
        saudes.add(estadoGrave);

        obssaude = FXCollections.observableArrayList(saudes);
        saude.setItems(obssaude);
    }

    @FXML
    private ComboBox<Vacina> vacina;
    @FXML
    private void listaVacina(){

        List<Vacina> vacinas = new ArrayList<>();
        ObservableList<Vacina> obsvacina;

        Vacina vacinaRaiva = new Vacina("Raiva");
        Vacina vacinaCarrapato = new Vacina("Carrapato");
        Vacina semVacina = new Vacina("Sem vacina");

        vacinas.add(vacinaRaiva);
        vacinas.add(vacinaCarrapato);
        vacinas.add(semVacina);

        obsvacina = FXCollections.observableArrayList(vacinas);

        vacina.setItems(obsvacina);
    }

    @FXML
    private void adotar(ActionEvent e){
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
    protected void ajuda(ActionEvent e){
        ScreenManager.trocaDeTela("telaAjuda");
    }

    public void DoarAnimal(ActionEvent Event) {
        Animal a = null;
        if (validarInputs()) {
            a = new Animal(this.txtRaca.getText(), this.txtNome.getText(), this.txtDescricao.getText(), LocalDateTime.now(),"", "");
            a.setEstadoSaude(saude.getSelectionModel().getSelectedItem().toString());
            a.setVacina(vacina.getSelectionModel().getSelectedItem().toString());
            }
            try {
                Facades.getInstance().inserirA(a);//
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Doa????o efetuada");
                alert.setHeaderText("Doa????o efetuada com sucesso!");
                alert.showAndWait();
            } catch (Exception exception) {
                // TODO Tratar exce????o com mensagem na tela
            }
            this.limparCampos();
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
            errorMessage += "Preencha a ra??a\n";
        }
        if(txtDescricao.getText() == null || txtDescricao.getText().length() == 0){
            errorMessage += "Preencha a descri????o\n";
        }
        if (errorMessage.length() == 0){
            return true;
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Campos da doa????o inv??lidos");
            alert.setHeaderText("Por favor, corrija os campos inv??lidos para que possamos concluir sua doa????o!");
            alert.setContentText(errorMessage);
            alert.showAndWait();
            return false;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listaVacina();
        listaSaude();
    }
}
