package pl.vgtworld.javafx.fxml.modularapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ModularApp extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main-window.fxml"));
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Modular App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
