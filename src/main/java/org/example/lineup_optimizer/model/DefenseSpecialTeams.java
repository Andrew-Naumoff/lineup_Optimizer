package org.example.lineup_optimizer.model;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DefenseSpecialTeams {
    private String team;
    private int sacks;
    private int interceptions;
    private int fumblesRecovered;
    private int touchdowns;
    private int fantasyPoints;

    public DefenseSpecialTeams(){

    }
    // Getters and Setters
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getSacks() {
        return sacks;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getFumblesRecovered() {
        return fumblesRecovered;
    }

    public void setFumblesRecovered(int fumblesRecovered) {
        this.fumblesRecovered = fumblesRecovered;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getFantasyPoints() {
        return fantasyPoints;
    }

    public void setFantasyPoints(int fantasyPoints) {
        this.fantasyPoints = fantasyPoints;
    }
}