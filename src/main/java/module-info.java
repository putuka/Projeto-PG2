module br.ufrpe.sosb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    exports br.ufrpe.sosb.beans;
    opens br.ufrpe.sosb.beans to javafx.fxml;
    exports br.ufrpe.sosb.data;
    opens br.ufrpe.sosb.data to javafx.fxml;
}