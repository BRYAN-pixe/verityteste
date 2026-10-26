module com.mycompany.jogo {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.jogo to javafx.fxml;
    exports com.mycompany.jogo;
    opens com.mycompany.jogo.controllers to javafx.fxml;
    exports com.mycompany.jogo.controllers;
    opens com.mycompany.jogo.DAOS to javafx.fxml;
    exports com.mycompany.jogo.DAOS;
}
