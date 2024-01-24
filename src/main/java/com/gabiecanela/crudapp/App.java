package com.gabiecanela.crudapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Fxml/Students.fxml")));
        Scene scene = new Scene(parent);
        stage.setTitle("CRUD");
        stage.setScene(scene);
        stage.show(); // Mostra a janela
    }

    public static void main(String[] args) {
        launch();
    }

}
