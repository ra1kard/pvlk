package interfaces.task8;

import java.util.ArrayList;

public class ChampionatFootball extends Championat {
    Football football = new Football();
    private final String nameSport = "Футбол";
    int passedTour = 0;

    ChampionatFootball(String name, int year, int countConference, int countTeamMembers,
                       ArrayList<Team> listTeams, int countGamesWithEach) {
        super(name, year, countConference, countTeamMembers, listTeams, countGamesWithEach);
    }

    public void startChampionat() {
        System.out.println("Турнир стартовал!");
        System.out.println();
        for (int i = 0; i < getTeamMembers()-1; i++) {
            tour();
            printTable();
        }
    }

    public void tour() {
        addPassedTour();
        System.out.println("########################## Тур №" + getPassedTour() + " ##########################");
        System.out.println();
        for (int i = 0; i < getListTeams().size(); i++) {       //берем командуА
            for (int j = 0; j < getListTeams().size(); j++) {   //ищем соперника командуБ
                if (i != j                                                              //если это не одна и та же team
                        && getListTeams().get(i).getPassedTour() < getPassedTour()      //если тур командыА не сыгран
                        && getListTeams().get(j).getPassedTour() < getPassedTour()) {   //если тур командыБ не сыгран
                    boolean isContains = getListTeams().get(i).getPlayedOpponents().contains(getListTeams().get(j));
                    if (!isContains) {                                                  //если не играли друг с другом
                        game(getListTeams().get(i), getListTeams().get(j));
                        getListTeams().get(i).addPlayedOpponents(getListTeams().get(j));        //в список, с кем играл
                        getListTeams().get(j).addPlayedOpponents(getListTeams().get(i));
                        getListTeams().get(i).addPassedTour();                                  //ставим "тур пройден"
                        getListTeams().get(j).addPassedTour();
                    }
                    break;
                }
            }
        }
        System.out.println();
    }

    public void game(Team teamA, Team teamB) {
        int goalTeamA = 0;
        int goalTeamB = 0;
        System.out.println("Начинается матч между: \n"
                + teamA.getName() + " (очков: " + teamA.getPoints() + ") и "
                + teamB.getName() + " (очков: " + teamB.getPoints() + ")");
        if (teamA.getAttack() > teamB.getDefense()) {
            System.out.println(teamA.getName() + " забивает гол!");
            goalTeamA++;
        }
        if (teamB.getAttack() > teamA.getDefense()) {
            System.out.println(teamB.getName() + " забивает гол!");
            goalTeamB++;
        }
        if (goalTeamA > goalTeamB) {
            System.out.println(teamA.getName() + " забила больше голов");
            teamA.addPoints(football.getScoreWin());        //победителю присуждаем очки
            teamB.addPoints(football.getScoreLose());       //проигравшим присуждаем очки
        } else if (goalTeamB > goalTeamA) {
            System.out.println(teamB.getName() + " забила больше голов");
            teamB.addPoints(football.getScoreWin());
            teamA.addPoints(football.getScoreLose());
        } else {
            System.out.println("ничья");
            teamA.addPoints(football.getScoreTie());
            teamB.addPoints(football.getScoreTie());
        }
        System.out.println(
                teamA.getName() + " (очков: " + teamA.getPoints() + ") и "
                + teamB.getName() + " (очков: " + teamB.getPoints() + ")");
        System.out.println();
    }

    public void printTable() {
        System.out.println("----------------- ТАБЛИЦА -----------------");
        System.out.println();
        for (int i = 0; i < getListTeams().size(); i++) {
            Team teamTemp = getListTeams().get(i);
            System.out.println(teamTemp.getName() + " очков: " + teamTemp.getPoints()
                    + ", туров: " + teamTemp.getPassedTour());
        }
        System.out.println();
    }

    public String getNameSport() {
        return nameSport;
    }

    public int getPassedTour() {
        return passedTour;
    }

    public void addPassedTour() {
        this.passedTour++;
    }

}
