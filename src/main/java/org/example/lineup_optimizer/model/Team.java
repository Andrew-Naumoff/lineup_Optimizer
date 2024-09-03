package org.example.lineup_optimizer.model;

import java.util.List;

public class Team {
    private List<Player> quarterbacks;
    private List<Player> runningBacks;
    private List<Player> wideReceivers;
    private List<Player> tightEnds;
    private List<Kicker> kickers;
    private List<DefenseSpecialTeams> defenseSpecialTeams;

    // Getters and Setters
    public List<Player> getQuarterbacks() {
        return quarterbacks;
    }

    public void setQuarterbacks(List<Player> quarterbacks) {
        this.quarterbacks = quarterbacks;
    }

    public List<Player> getRunningBacks() {
        return runningBacks;
    }

    public void setRunningBacks(List<Player> runningBacks) {
        this.runningBacks = runningBacks;
    }

    public List<Player> getWideReceivers() {
        return wideReceivers;
    }

    public void setWideReceivers(List<Player> wideReceivers) {
        this.wideReceivers = wideReceivers;
    }

    public List<Player> getTightEnds() {
        return tightEnds;
    }

    public void setTightEnds(List<Player> tightEnds) {
        this.tightEnds = tightEnds;
    }

    public List<Kicker> getKickers() {
        return kickers;
    }

    public void setKickers(List<Kicker> kickers) {
        this.kickers = kickers;
    }

    public List<DefenseSpecialTeams> getDefenseSpecialTeams() {
        return defenseSpecialTeams;
    }

    public void setDefenseSpecialTeams(List<DefenseSpecialTeams> defenseSpecialTeams) {
        this.defenseSpecialTeams = defenseSpecialTeams;
    }
}
