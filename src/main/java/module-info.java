module com.gabiecanela.crudapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;

    opens com.gabiecanela.crudapp to javafx.fxml;
    exports com.gabiecanela.crudapp;
}