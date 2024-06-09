package interfaces.task8;

import java.util.ArrayList;

public class Team {
    private String name;
    private int attack;
    private int defense;
    private boolean isEndTour;
    ArrayList<Team> playedOpponents = new ArrayList<>();
    int passedTour = 0;
    private int points;

    Team(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public boolean isEndTour() {
        return isEndTour;
    }

    public ArrayList<Team> getPlayedOpponents() {
        return playedOpponents;
    }

    public void addPlayedOpponents(Team team) {
        playedOpponents.add(team);
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int score) {
        points += score;
    }

    public int getPassedTour() {
        return passedTour;
    }

    public void addPassedTour() {
        this.passedTour++;
    }

}
