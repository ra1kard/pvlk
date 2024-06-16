package interfaces.task8;

import java.util.ArrayList;

public abstract class Championat {
    private final String name;
    private String nameSport;
    private final int year;
    private final int countConference;
    private final ArrayList<Team> listTeams = new ArrayList<>();      //список участников
    private final int gamesWithEach;
    private int passedTour = 0;

    Championat(String name, int year, int countConference, ArrayList<Team> listTeams, int gamesWithEach) {
        this.name = name;
        this.year = year;
        this.countConference = countConference;
        this.listTeams.addAll(listTeams);
        this.gamesWithEach = gamesWithEach;
    }

    public static void printTeamFromChampionat(Championat championat) {
        System.out.println("Это чемпионат " + "\"" + championat.getName() + "\"" + " " + championat.getYear()
                + ", по виду спорта: " + championat.getNameSport() );
        System.out.println();
        System.out.println("Команды:");
        for (Team team : championat.getListTeams()) {
            System.out.println(team.getName() + ", атака: " + team.getAttack() + ", защита: " + team.getDefense());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getNameSport() {
        return nameSport;
    }

    public void setNameSport(String nameSport) {
        this.nameSport = nameSport;
    }

    public int getYear() {
        return year;
    }

    public int getCountConference() {
        return countConference;
    }

    public ArrayList<Team> getListTeams() {
        return listTeams;
    }

    public int getGamesWithEach() {
        return gamesWithEach;
    }

    public int getPassedTour() {
        return passedTour;
    }

    public void addPassedTour() {
        this.passedTour++;
    }

    public void setPassedTour(int passedTour) {
        this.passedTour = passedTour;
    }

}
