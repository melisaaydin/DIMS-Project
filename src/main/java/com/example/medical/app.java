package com.example.medical;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class app extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("doctor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setScene(scene);
        stage.setTitle("Doctor Management System");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
