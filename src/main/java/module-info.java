module pl.lublin.wsei.java.cwiczenia.lab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia.console to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.console;
    exports pl.lublin.wsei.java.cwiczenia;
    opens pl.lublin.wsei.java.cwiczenia to javafx.fxml;
}