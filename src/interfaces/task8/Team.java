package interfaces.task8;

import java.util.ArrayList;

public class Team implements Comparable<Team> {
    private final String name;
    private final int attack;
    private final int defense;
    private int matchesWin;
    private int matchesLose;
    private int matchesTie;
    private final ArrayList<Team> playedOpponents = new ArrayList<>();      //понадобится для хоккея, вероятно
    private int passedTour = 0;
    private int points;
    private final Enum<Conference> conference;

    Team(String name, int attack, int defense, Enum<Conference> conference) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.conference = conference;
    }

    @Override
    public int compareTo(Team o) {
        return o.getPoints() - getPoints();
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

    public int getMatchesWin() {
        return matchesWin;
    }

    public void addMatchesWin() {
        this.matchesWin++;
    }

    public int getMatchesLose() {
        return matchesLose;
    }

    public void addMatchesLose() {
        this.matchesLose++;
    }

    public int getMatchesTie() {
        return matchesTie;
    }

    public void addMatchesTie() {
        this.matchesTie++;
    }

    public Enum<Conference> getConference() {
        return conference;
    }

}
