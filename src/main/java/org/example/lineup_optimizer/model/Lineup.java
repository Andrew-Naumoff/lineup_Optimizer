package org.example.lineup_optimizer.model;

import java.util.ArrayList;
import java.util.List;

public class Lineup {
    private List<Player> players;

    public Lineup() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public double calculateTotalPoints() {
        return players.stream().mapToDouble(Player::getFantasyPoints).sum();
    }

    @Override
    public String toString() {
        StringBuilder lineupString = new StringBuilder();
        for (Player player : players) {
            lineupString.append(player.toString()).append("\n");
        }
        return lineupString.toString();
    }
}
