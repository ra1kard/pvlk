package interfaces.task8;

import java.util.ArrayList;
import java.util.Collections;

public class ChampionatFootball extends Championat implements SportType {

    ChampionatFootball(String name, int year, int countConference, ArrayList<Team> listTeams, int gamesWithEach) {
        super(name, year, countConference, listTeams, gamesWithEach);
        setNameSport("Футбол");
    }

    @Override
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
            teamA.addPoints(getScoreWin());
            teamA.addMatchesWin();
            teamB.addPoints(getScoreLose());
            teamB.addMatchesLose();
        } else if (goalTeamB > goalTeamA) {
            System.out.println(teamB.getName() + " забила больше голов");
            teamB.addPoints(getScoreWin());
            teamB.addMatchesWin();
            teamA.addPoints(getScoreLose());
            teamA.addMatchesLose();
        } else {
            System.out.println("ничья");
            teamA.addPoints(getScoreTie());
            teamA.addMatchesTie();
            teamB.addPoints(getScoreTie());
            teamB.addMatchesTie();
        }
        System.out.println(
                teamA.getName() + " (очков: " + teamA.getPoints() + ") и "
                + teamB.getName() + " (очков: " + teamB.getPoints() + ")");
        System.out.println();
    }

    public void printFinishTable() {
        System.out.println("########################## ИТОГОВАЯ ТАБЛИЦА С СОРТИРОВКОЙ ##########################");
        System.out.println();
        ArrayList<Team> tempListTeams = new ArrayList<>(getListTeams());
        Collections.sort(tempListTeams);
        for (int i = 0; i < tempListTeams.size(); i++) {
            Team teamTemp = tempListTeams.get(i);
            System.out.println(
                    i+1 + ". "
                    + teamTemp.getName() + " очков " + teamTemp.getPoints()
                    + ", туров: " + teamTemp.getPassedTour()
                    + ", (победы: " + teamTemp.getMatchesWin()
                    + ", ничьи: "  + teamTemp.getMatchesTie()
                    + ", поражения: " + teamTemp.getMatchesLose() + ")");
        }
        System.out.println();
        System.out.println();
    }

    @Override
    public int getScoreWin() {
        return 3;
    }

    @Override
    public int getScoreLose() {
        return 0;
    }

    public int getScoreTie() {
        return 1;
    }

}
