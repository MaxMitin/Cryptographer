module com.example.cryptographer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cryptographer to javafx.fxml;
    exports com.example.cryptographer;
}