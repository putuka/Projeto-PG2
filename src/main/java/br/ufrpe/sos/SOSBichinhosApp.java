package br.ufrpe.sos;

import br.ufrpe.sos.gui.ScreenManager;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SOSBichinhosApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(ScreenManager .getInstance().getMainScene());
        primaryStage.setTitle("SOS Bichinhos");
        primaryStage.setResizable(false);
        //primaryStage.getIcons().add(new Image("sos-ico.png"));

        ScreenManager.getInstance().setPrimaryStage(primaryStage);

        primaryStage.show();
    }

    public static void main(String[] args) {
        SOSBichinhosApp.launch(args);

    }
}
