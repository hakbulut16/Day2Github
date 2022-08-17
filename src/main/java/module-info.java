module com.example.gitgithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitgithub to javafx.fxml;
    exports com.example.gitgithub;
}