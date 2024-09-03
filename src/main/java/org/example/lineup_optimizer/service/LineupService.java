package org.example.lineup_optimizer.service;

import org.example.lineup_optimizer.model.Lineup;
import org.example.lineup_optimizer.model.Player;
import org.example.lineup_optimizer.repository.LineupRepository;

import java.util.List;

public class LineupService {
    private LineupRepository lineupRepository;
    private Lineup currentLineup;

    public LineupService() {
        this.lineupRepository = new LineupRepository();
        this.currentLineup = new Lineup();
    }

    public void addPlayerToLineup(Player player) {
        currentLineup.addPlayer(player);
    }

    public void removePlayerFromLineup(Player player) {
        currentLineup.removePlayer(player);
    }

    public double getTotalPoints() {
        return currentLineup.calculateTotalPoints();
    }

    public void saveCurrentLineup() {
        lineupRepository.saveLineup(currentLineup);
    }

    public List<Lineup> getSavedLineups() {
        return lineupRepository.getAllLineups();
    }

    public String getLineupSummary() {
        return currentLineup.toString();
    }
}
