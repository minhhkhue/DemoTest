module com.mycompany.pj {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.mycompany.pj to javafx.fxml;
    exports com.mycompany.pj;
}
