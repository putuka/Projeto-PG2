module br.ufrpe.sos {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens br.ufrpe.sos.gui to javafx.fxml;
    exports br.ufrpe.sos.gui;

    opens br.ufrpe.sos to javafx.fxml;
    exports br.ufrpe.sos;
}