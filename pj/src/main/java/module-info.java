module com.mycompany.pj {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.pj to javafx.fxml;
    exports com.mycompany.pj;
}
