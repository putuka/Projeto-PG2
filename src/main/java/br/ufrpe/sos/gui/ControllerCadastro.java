package br.ufrpe.sos.gui;

import br.ufrpe.sos.beans.pessoa.Endereco;
import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.controller.Facades;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ControllerCadastro {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtTelefone;
    @FXML
    private DatePicker dataNascimento;
    @FXML
    private TextField txtRua;
    @FXML
    private TextField txtCidade;
    @FXML
    private TextField txtEstado;
    @FXML
    private TextField txtCep;

    @FXML
    protected void login(ActionEvent e ){
        Main.trocaDeTela("telaLogin");
    }
    @FXML
    protected void voltar(ActionEvent e) {Main.trocaDeTela("telaMenu");}

    public void voltarAoMenu(ActionEvent event){
        this.limparCampos();
        this.voltar(event);
    }

    public void cadastrarPessoa(ActionEvent event){
        if (validarInputs()) {
            Endereco e = new Endereco(this.txtRua.getText(), this.txtCidade.getText(), this.txtEstado.getText(), this.txtCep.getText());
            Pessoa p = new Pessoa(this.txtNome.getText(),
                    this.txtTelefone.getText(), this.txtCpf.getText(), this.txtEmail.getText(), this.dataNascimento.getValue(), e);
            try {
                Facades.getInstance().inserirP(p);
            } catch (Exception exception) {
                // TODO Tratar exceção com mensagem na tela
            }
            this.limparCampos();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cadastro Efetuado");
            alert.setHeaderText("Cadastrado efetuado com Sucesso!");
            alert.showAndWait();
            this.login(event);
        }
    }

    public void limparCampos(){
        this.txtNome.setText("");
        this.txtCpf.setText("");
        this.txtEmail.setText("");
        this.txtTelefone.setText("");
        this.dataNascimento.setValue(null);
        this.txtRua.setText("");
        this.txtCidade.setText("");
        this.txtEstado.setText("");
        this.txtCep.setText("");
    }

    private boolean validarInputs(){
        String errorMessage = "";

        if (txtNome.getText() == null || txtNome.getText().length() == 0){
            errorMessage += "Preencha o nome!\n";
        }
        if (txtTelefone.getText() == null || txtTelefone.getText().length() == 0){
            errorMessage += "Preencha o telefone!\n";
        }else {
            try {
                Integer.parseInt(txtTelefone.getText());
            }catch (NumberFormatException e){
                errorMessage += "Telefone inválido\n";
            }
        }
        if (txtCpf.getText() == null || txtCpf.getText().length() == 0){
            errorMessage += "Preencha o cpf!\n";
        }
        if (txtEmail.getText() == null || txtEmail.getText().length() == 0){
            errorMessage += "Preencha o email!\n";
        }
        if (dataNascimento.getValue() == null){
            errorMessage += "Informe sua data de nascimento!\n";
        }
        if (txtRua.getText() == null || txtRua.getText().length() == 0){
            errorMessage += "Preencha a rua!\n";
        }
        if (txtCidade.getText() == null || txtCidade.getText().length() == 0){
            errorMessage += "Preencha a cidade!\n";
        }
        if (txtEstado.getText() == null || txtEstado.getText().length() == 0){
            errorMessage += "Preencha o estado!\n";
        }
        if (txtCep.getText() == null || txtCep.getText().length() == 0){
            errorMessage += "Preencha o CEP!\n";
        }else {
            try {
                Integer.parseInt(txtCep.getText());
            }catch (NumberFormatException e){
                errorMessage += "CEP inválido\n";
            }
        }

        if (errorMessage.length() == 0){
            return true;
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Campos do cadastro inválido");
                alert.setHeaderText("Por favor, corrija os campos inválidos para que possamos concluir seu cadastro!");
                alert.setContentText(errorMessage);
            alert.showAndWait();

            return false;
        }
    }

}
