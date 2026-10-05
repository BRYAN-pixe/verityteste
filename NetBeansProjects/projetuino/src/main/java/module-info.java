module com.mycompany.projetuino {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projetuino to javafx.fxml;
    exports com.mycompany.projetuino;
}
