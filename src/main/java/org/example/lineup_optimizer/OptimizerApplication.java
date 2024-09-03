package org.example.lineup_optimizer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OptimizerApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(OptimizerApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();

        // Set up the scene with the loaded root
        Scene scene = new Scene(root);

        // Set the stage with the scene and title
        stage.setScene(scene);
        stage.setTitle("Fantasy Football Optimizer");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
