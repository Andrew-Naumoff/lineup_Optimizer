package org.example.lineup_optimizer.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.lineup_optimizer.model.DefenseSpecialTeams;
import org.example.lineup_optimizer.model.Kicker;
import org.example.lineup_optimizer.model.Player;
import org.example.lineup_optimizer.model.Team;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class LineupController {

    @FXML
    private TextField playerNameField;

    @FXML
    private TextField positionField;

    @FXML
    private TextField projectedPointsField;

    @FXML
    private Label lineupSummary;

    @FXML
    private Label totalPointsLabel;

    private StringBuilder lineup = new StringBuilder();
    private double totalPoints = 0;

    private Team team;  // Add Team attribute

    public LineupController() {
        loadPlayers();
    }

    private void loadPlayers() {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = getClass().getResourceAsStream("/teamToOptimize.json")) {
            team = objectMapper.readValue(inputStream, Team.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleAddPlayerAction() {
        String playerName = playerNameField.getText();

        Player player = findPlayerByName(playerName);

        if (player != null) {
            String position = player.getPosition();
            double projectedPoints = player.getFantasyPoints();
            lineup.append(playerName).append(" - ").append(position).append(" (").append(projectedPoints).append(" pts)\n");
            lineupSummary.setText(lineup.toString());
            // Clear input fields
            playerNameField.clear();
            positionField.clear();
            projectedPointsField.clear();
        }
        player = findByPosition(playerName);
        if (player != null) {
            String position = player.getPosition();
            double projectedPoints = player.getFantasyPoints();
            lineup.append(playerName).append(" - ").append(position).append(" (").append(projectedPoints).append(" pts)\n");
            lineupSummary.setText(lineup.toString());
            // Clear input fields
            playerNameField.clear();
            positionField.clear();
            projectedPointsField.clear();
        }
        DefenseSpecialTeams Defense;
        Defense = findDefenseTeamByName(playerName);
        double projectedPoints = 0;
        if (Defense != null) {
            projectedPoints = Defense.getFantasyPoints();
            lineup.append(playerName).append(" - ").append("Defense").append(" (").append(projectedPoints).append(" pts)\n");
            lineupSummary.setText(lineup.toString());
            playerNameField.clear();
            positionField.clear();
            projectedPointsField.clear();
        }
    }

    @FXML
    protected void handleCalculatePointsAction() {
        totalPoints = lineupSummary.getText().lines()
                .mapToDouble(line -> Double.parseDouble(line.replaceAll(".*\\(", "").replaceAll(" pts\\)", "")))
                .sum();
        totalPointsLabel.setText(String.valueOf(totalPoints));
    }

    private Player findPlayerByName(String playerName) {
        if (team != null) {
            for (Player player : team.getQuarterbacks()) {
                if (player.getName().equalsIgnoreCase(playerName)) {
                    return player;
                }
            }
            for (Player player : team.getRunningBacks()) {
                if (player.getName().equalsIgnoreCase(playerName)) {
                    return player;
                }
            }
            for (Player player : team.getWideReceivers()) {
                if (player.getName().equalsIgnoreCase(playerName)) {
                    return player;
                }
            }
            for (Player player : team.getTightEnds()) {
                if (player.getName().equalsIgnoreCase(playerName)) {
                    return player;
                }
            }
            for (Player player : team.getKickers()) {
                if (player.getName().equalsIgnoreCase(playerName)) {
                    return player;
                }
            }
            // Implement for DefenseSpecialTeams if needed
        }
        return null;
    }
    //  DefenseSpecialTeams has a teamName field
    private DefenseSpecialTeams findDefenseTeamByName(String teamName) {
        if (team != null) {
            for (DefenseSpecialTeams defense : team.getDefenseSpecialTeams()) {
                if (defense.getTeam().equalsIgnoreCase(teamName)) {
                    return defense;
                }
            }
        }
        return null;
    }

    private Player findByPosition(String position) {
        if (team != null) {
            // Search in quarterbacks
            if (position.equalsIgnoreCase("Quarterback") || position.equalsIgnoreCase("QB")) {
                for (Player player : team.getQuarterbacks()) {
                    return player;
                }
            }
            // Search in running backs
            if (position.equalsIgnoreCase("Running Back") || position.equalsIgnoreCase("RB")) {
                for (Player player : team.getRunningBacks()) {
                    return player;
                }
            }
            // Search in wide receivers
            if (position.equalsIgnoreCase("Wide Receiver") || position.equalsIgnoreCase("WR")) {
                for (Player player : team.getWideReceivers()) {
                    return player;
                }
            }
            // Search in tight ends
            if (position.equalsIgnoreCase("Tight End") || position.equalsIgnoreCase("TE")) {
                for (Player player : team.getTightEnds()) {
                    return player;
                }
            }
            // Search in kickers
            if (position.equalsIgnoreCase("Kicker") || position.equalsIgnoreCase("K")) {
                for (Kicker kicker : team.getKickers()) {
                    return kicker; // Return as a Player object
                }
            }
        }
        return null;
    }


}