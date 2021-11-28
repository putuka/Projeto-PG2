package br.ufrpe.sos.gui;

import br.ufrpe.sos.beans.animal.Animal;
import br.ufrpe.sos.beans.animal.Saude;
import br.ufrpe.sos.controller.Facades;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import net.synedra.validatorfx.Check;

import java.time.LocalDateTime;

public class ControllerDoar {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtRaca;
    @FXML
    private MenuItem item1 = new MenuItem("SAUDAVEL");
    @FXML
    private MenuItem item2 = new MenuItem("DOENTE");
    @FXML
    private MenuButton saude = new MenuButton("", null, item1, item2);
    @FXML
    private TextField txtIdade;
    @FXML
    private TextField txtDescricao;
    @FXML
    private CheckBox checkVacina;

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

    public void DoarAnimal(ActionEvent Event) {// TODO falta campo para saúde e opção de escolha para vacina, ao invés de texto//
        if (validarInputs()) {
            Animal a = new Animal(this.txtRaca.getText(), this.txtNome.getText(), this.txtDescricao.getText(), LocalDateTime.now(), false, Saude.NULL);
            if(checkVacina.isSelected()){
                a.setVacina(Boolean.TRUE);
            }
            item1.setOnAction(e -> {
                a.setSaude(Saude.SAUDAVEL);
            });
            item2.setOnAction(e -> {
                a.setSaude(Saude.DOENTE);
            });
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
        }
    }
    public void limparCampos(){
        this.txtNome.setText("");
        this.txtDescricao.setText("");
        this.txtRaca.setText("");
        this.txtIdade.setText("");
    }
    private boolean validarInputs(){
        String errorMessage = "";

        if (txtNome.getText() == null || txtNome.getText().length() == 0){
            errorMessage += "Preencha o nome!\n";
        }
        if(txtIdade.getText() == null || txtIdade.getText().length() == 0){
            errorMessage += "Preencha a idade\n";
        }
        if(txtRaca.getText() == null || txtRaca.getText().length() == 0){
            errorMessage += "Preencha a raça\n";
        }
        if(txtDescricao.getText() == null || txtDescricao.getText().length() == 0){
            errorMessage += "Preencha a descrição\n";
        }
        //Vacina deve ser boolean
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

}
