package org.example.lineup_optimizer.repository;

import org.example.lineup_optimizer.model.Lineup;

import java.util.ArrayList;
import java.util.List;

public class LineupRepository {
    private List<Lineup> lineupDatabase;

    public LineupRepository() {
        this.lineupDatabase = new ArrayList<>();
    }

    public void saveLineup(Lineup lineup) {
        lineupDatabase.add(lineup);
    }

    public List<Lineup> getAllLineups() {
        return new ArrayList<>(lineupDatabase);
    }
}
