package br.com.richmont.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class UsernameForm extends Application {
    public Parent loadFxml() throws IOException{

        return FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/UsernameForm.fxml")));
        //return FXMLLoader.load(getClass().getResource("UsernameForm.fxml"));

    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/UsernameForm.fxml")));
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }
}
