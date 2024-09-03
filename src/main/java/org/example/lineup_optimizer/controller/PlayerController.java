package org.example.lineup_optimizer.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PlayerController {
    @FXML
    private Label playerText;

    @FXML
    protected void onPlayerButtonClick() {
        playerText.setText("Players !");
    }
}
