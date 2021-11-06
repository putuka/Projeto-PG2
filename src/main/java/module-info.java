module br.ufrpe.sosb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    exports br.ufrpe.sos.beans.animal;
    opens br.ufrpe.sos.beans.animal to javafx.fxml;
    exports br.ufrpe.sos.data;
    opens br.ufrpe.sos.data to javafx.fxml;
    exports br.ufrpe.sos.beans.pessoa;
    opens br.ufrpe.sos.beans.pessoa to javafx.fxml;
}