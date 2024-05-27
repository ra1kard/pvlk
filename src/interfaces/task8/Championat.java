package interfaces.task8;

import java.util.ArrayList;

public abstract class Championat {
    private final String name;
    private final int year;
    private final int countConference;
    private final int teamMembers;                              //кол-во участников
    private ArrayList<Team> listTeams = new ArrayList<>();      //список участников
    private final int gamesWithEach;

    Championat(String name, int year, int countConference, int teamMembers,
               ArrayList<Team> listTeams, int gamesWithEach) {
        this.name = name;
        this.year = year;
        this.countConference = countConference;
        this.teamMembers = teamMembers;
        this.listTeams.addAll(listTeams);
        this.gamesWithEach = gamesWithEach;
    }

    public ArrayList<Team> getListTeams() {
        return listTeams;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getCountConference() {
        return countConference;
    }

    public int getTeamMembers() {
        return teamMembers;
    }

    public int getGamesWithEach() {
        return gamesWithEach;
    }

    public static void printTeamFromChampionat(Championat championat) {
        System.out.println("Это чемпионат: " + championat.getName() + " " + championat.getYear()
                + ", по виду спорта: " + "###");
        System.out.println("Команды:");
        for (Team team : championat.getListTeams()) {
            System.out.println(team.getName() + ", атака: " + team.getAttack() + ", защита: " + team.getDefense());
        }
        System.out.println();
    }

}
