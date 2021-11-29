package br.ufrpe.sos.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenManager {

    private static ScreenManager instance;
    private static Stage stage;
    private static Scene telaMenu;
    private static Scene telaCadastro;
    private static Scene telaLogin;
    private static Scene telaDoar;
    private static Scene telaDoarAnonimo;
    private static Scene telaDoarAnonimoConcluido;
    private static Scene telaAdocao;
    private static Scene telaAjuda;
    private static Scene telaAjuda1;
    private static Scene telaAjuda2;
    private static Scene telaAjuda3;
    private static Scene telaAjuda4;
    private static Scene telaAjuda5;
    private static Scene telaApadrinhamento;
    private static Scene telaContribuinte;
    private static Scene telaPerfil;

    private ScreenManager() throws IOException {
        this.initialize();
    }

    public static ScreenManager getInstance() throws IOException {
        if (instance == null) {
            instance = new ScreenManager();
        }
        return instance;
    }

    private void initialize() throws IOException {
        //TELA INICIAL DO MENU
        Parent fxmlTelaPadrao = FXMLLoader.load(getClass().getResource("telaMenu.fxml"));
        telaMenu = new Scene(fxmlTelaPadrao, 1250, 600);
        //TELA DE CADASTRO
        Parent fxmlTelaCadastro = FXMLLoader.load(getClass().getResource("telaCadastro.fxml"));
        telaCadastro = new Scene(fxmlTelaCadastro, 1250, 600);
        //TELA DE LOGIN
        Parent fxmlTelaLogin = FXMLLoader.load(getClass().getResource("telaLogin.fxml"));
        telaLogin = new Scene(fxmlTelaLogin, 1250, 600);
        //TELA DE DOAÇÃO DE ANIMAL
        Parent fxmlTelaUsuario = FXMLLoader.load(getClass().getResource("telaDoarAnimal.fxml"));
        telaDoar = new Scene(fxmlTelaUsuario, 1250, 600);
        //TELA DE DOAÇÃO COMO ANONIMO
        Parent fxmlTelaDoacaoAnimalAnonimo = FXMLLoader.load(getClass().getResource("telaDoarAnonimo.fxml"));
        telaDoarAnonimo = new Scene(fxmlTelaDoacaoAnimalAnonimo, 1200, 600);
        Parent fxmlTelaDoacaoAnimalAnonimoConcluido = FXMLLoader.load(getClass().getResource("telaDoarAnonimoConcluido.fxml"));
        telaDoarAnonimoConcluido = new Scene(fxmlTelaDoacaoAnimalAnonimoConcluido, 1250, 600);
        //TELA DE ADOTAR ANIMAIS
        Parent fxmlTelaAdocaoDeAnimais = FXMLLoader.load(getClass().getResource("telaAdocao.fxml"));
        telaAdocao = new Scene(fxmlTelaAdocaoDeAnimais, 1250, 600);
        //TELA DE AJUDA
        Parent fxmlTelaAjuda = FXMLLoader.load(getClass().getResource("telaAjuda.fxml"));
        telaAjuda = new Scene(fxmlTelaAjuda, 1250, 600);
        //TELA DE APADRINHAMENTO
        Parent fxmlApadrinhamento = FXMLLoader.load(getClass().getResource("telaApadrinhamento.fxml"));
        telaApadrinhamento = new Scene(fxmlApadrinhamento, 1250, 600);
        //TELA DE CONTRIBUINTE
        Parent fxmlTelaContribuinte = FXMLLoader.load(getClass().getResource("telaContribuinte.fxml"));
        telaContribuinte = new Scene(fxmlTelaContribuinte, 1250, 600);
        //TELA DE PERFIL
        Parent fxmlPerfil = FXMLLoader.load(getClass().getResource("telaPerfil.fxml"));
        telaPerfil = new Scene(fxmlPerfil, 1250, 600);
        //TELA AJUDA 1
        Parent fxmlTelaAjuda1 = FXMLLoader.load(getClass().getResource("telaAjuda1.fxml"));
        telaAjuda1 = new Scene(fxmlTelaAjuda1, 1250, 600);
        //TELA AJUDA 2
        Parent fxmlTelaAjuda2 = FXMLLoader.load(getClass().getResource("telaAjuda2.fxml"));
        telaAjuda2 = new Scene(fxmlTelaAjuda2, 1250, 600);
        //TELA AJUDA 3
        Parent fxmlTelaAjuda3 = FXMLLoader.load(getClass().getResource("telaAjuda3.fxml"));
        telaAjuda3 = new Scene(fxmlTelaAjuda3, 1250, 600);
        //TELA AJUDA 4
        Parent fxmlTelaAjuda4 = FXMLLoader.load(getClass().getResource("telaAjuda4.fxml"));
        telaAjuda4 = new Scene(fxmlTelaAjuda4, 1250, 600);
        //TELA AJUDA 5
        Parent fxmlTelaAjuda5 = FXMLLoader.load(getClass().getResource("telaAjuda5.fxml"));
        telaAjuda5 = new Scene(fxmlTelaAjuda5, 1250, 600);
    }

    public static void trocaDeTela(String scr) {
        switch (scr) {

            case "telaMenu":
                stage.setScene(telaMenu);
                break;

            case "telaCadastro":
                stage.setScene(telaCadastro);
                break;

            case "telaLogin":
                stage.setScene(telaLogin);
                break;

            case "telaDoar":
                stage.setScene(telaDoar);
                break;

            case "telaDoarAnonimo":
                stage.setScene(telaDoarAnonimo);
                break;

            case "telaAdocao":
                stage.setScene(telaAdocao);
                break;

            case "telaDoarAnonimoConcluido":
                stage.setScene(telaDoarAnonimoConcluido);
                break;

            case "telaAjuda":
                stage.setScene(telaAjuda);
                break;

            case "telaApadrinhamento":
                stage.setScene(telaApadrinhamento);
                break;

            case "telaPerfil":
                stage.setScene(telaPerfil);
                break;

            case "telaContribuinte":
                stage.setScene(telaContribuinte);
                break;

            case "telaAjuda1":
                stage.setScene(telaAjuda1);
                break;

            case "telaAjuda2":
                stage.setScene(telaAjuda2);
                break;

            case "telaAjuda3":
                stage.setScene(telaAjuda3);
                break;
            case "telaAjuda4":
                stage.setScene(telaAjuda4);
                break;

            case "telaAjuda5":
                stage.setScene(telaAjuda5);
                break;

        }

    }

    public Scene getMainScene(){
        return telaMenu;
    }

    public void setPrimaryStage(Stage primaryStage) {
        stage = primaryStage;
    }
}
