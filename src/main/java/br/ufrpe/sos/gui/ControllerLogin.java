package br.ufrpe.sos.gui;

import br.ufrpe.sos.controller.Facades;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ControllerLogin {

    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtEmail;

    @FXML
    private void perfil(ActionEvent e){
        Main.trocaDeTela("telaPerfil");
    }
    @FXML
    protected void voltar(ActionEvent e) {Main.trocaDeTela("telaMenu");}

    public void voltarAoMenu(ActionEvent event){
        this.limparCampos();
        this.voltar(event);
    }

    public void login(ActionEvent actionEvent){
        if (validarInputs()) {
            try {
                if (Facades.getInstance().cpfExiste(txtCpf.getText()) && Facades.getInstance().emailExiste(txtEmail.getText())) {
                    this.perfil(actionEvent);
                }
            } catch (Exception exception) {
                //TODO tratar exceção
            }
            this.limparCampos();
        }
    }

    public void limparCampos(){
        this.txtCpf.setText("");
        this.txtEmail.setText("");
    }

    private boolean validarInputs(){
        String errorMessage = "";

        if (txtCpf.getText() == null || txtCpf.getText().length() == 0){
            errorMessage += "Preencha o Cpf!\n";
        }
        if (txtEmail.getText() == null || txtEmail.getText().length() == 0){
            errorMessage += "Preencha o Email!\n";
        }

        if (errorMessage.length() == 0){
            return true;
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Campos do login inválido");
            alert.setHeaderText("Por favor, corrija os campos inválidos para que possamos concluir seu login!");
            alert.setContentText(errorMessage);
            alert.showAndWait();

            return false;
        }
    }

}
