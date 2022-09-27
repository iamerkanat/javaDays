module com.example.myfifthjavaday {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfifthjavaday to javafx.fxml;
    exports com.example.myfifthjavaday;
}