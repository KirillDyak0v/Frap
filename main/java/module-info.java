module com.example.frap1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.frap1 to javafx.fxml;
    exports com.example.frap1;
}