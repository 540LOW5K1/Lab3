module com.example.lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.cwiczenia to javafx.fxml;
    exports pl.lublin.wsei.cwiczenia;
    exports pl.lublin.wsei.cwiczenia.test;
    opens pl.lublin.wsei.cwiczenia.test to javafx.fxml;
}