package br.ufrpe.sos.gui;

import br.ufrpe.sos.beans.pessoa.Endereco;
import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.controller.Facades;
import br.ufrpe.sos.controller.PessoaController;
import br.ufrpe.sos.exceptions.UsuarioJaExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.fxml.FXML;

public class ControlleCadastro {

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
    private void initialize(){

    }

    @FXML
    protected void login(ActionEvent e ){
        Main.trocaDeTela("telaLogin");
    }

    public void cadastrarPessoa(ActionEvent event){
        Endereco e = new Endereco(this.txtRua.getText(), this.txtCidade.getText(),this.txtEstado.getText(), this.txtCep.getText());
        Pessoa p = new Pessoa(this.txtNome.getText(),
                this.txtTelefone.getText(), this.txtCpf.getText(), this.txtEmail.getText(), this.dataNascimento.getValue(), e);
        try {
            Facades.getInstance().inserir(p);
        }catch (Exception exception){
            // TODO Tratar exceção com mensagem na tela
        }
        this.limparCampos();
        this.login(event);
        //((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
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

}
