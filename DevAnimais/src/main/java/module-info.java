module com.example.devanimais {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.devanimais to javafx.fxml;
    exports com.example.devanimais;
}