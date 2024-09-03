package org.example.lineup_optimizer.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HelloController {
    @FXML
    private void handleStartButtonAction(ActionEvent event) throws IOException {
        // Load the lineup screen (assuming you have a lineup-view.fxml)
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/lineup_optimizer/lineup.fxml"));
        Parent lineupRoot = loader.load();

        // Get the current stage (window) and set the new scene
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(lineupRoot));
        stage.setTitle("Fantasy Football Lineup");
        stage.show();
    }
}

