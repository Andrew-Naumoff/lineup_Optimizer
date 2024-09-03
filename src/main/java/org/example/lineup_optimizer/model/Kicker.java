package org.example.lineup_optimizer.model;

public class Kicker extends Player {
    private int fieldGoalsMade;
    private int extraPointsMade;

    // Getters and Setters
    public int getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public void setFieldGoalsMade(int fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    public int getExtraPointsMade() {
        return extraPointsMade;
    }

    public void setExtraPointsMade(int extraPointsMade) {
        this.extraPointsMade = extraPointsMade;
    }
}
