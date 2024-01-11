module com.example.sampleproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sampleproject to javafx.fxml;
    exports com.example.sampleproject;
}