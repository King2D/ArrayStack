module com.example.arraystack {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arraystack to javafx.fxml;
    exports com.example.arraystack;
}