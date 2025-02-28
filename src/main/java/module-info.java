module com.example.medical {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.medical to javafx.fxml;
    exports com.example.medical;
    exports com.example.medical.Controllers;
    opens com.example.medical.Controllers to javafx.fxml;
}