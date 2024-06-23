package interfaces.task8;

import java.util.ArrayList;
import java.util.Collections;

public class ChampionatHockey extends Championat implements SportType {

    ChampionatHockey(String name, int year, int countConference, ArrayList<Team> listTeams, int gamesWithEach) {
        super(name, year, countConference, listTeams, gamesWithEach);
        setNameSport("Хоккей");
    }

    public void printFinishTable() {
        System.out.println("########################## ИТОГОВАЯ ТАБЛИЦА С СОРТИРОВКОЙ ##########################");
        System.out.println();
        ArrayList<Team> tempListTeams = new ArrayList<>(getListTeams());
        Collections.sort(tempListTeams);

        int count = 1;
        for (int i = 0; i < tempListTeams.size(); i++) {
            Team teamTemp = tempListTeams.get(i);
            if (teamTemp.getConference() == Conference.WEST) {
                System.out.println(
                        count++ + ". "
                                + teamTemp.getName() + " очков " + teamTemp.getPoints()
                                + ", туров: " + teamTemp.getPassedTour()
                                + ", (победы: " + teamTemp.getMatchesWin()
                                + ", поражения: " + teamTemp.getMatchesLose() + ")"
                                + ", конференция: " + teamTemp.getConference());
            }
        }
        System.out.println();

        count = 1;
        for (int i = 0; i < tempListTeams.size(); i++) {
            Team teamTemp = tempListTeams.get(i);
            if (teamTemp.getConference() == Conference.EAST) {
                System.out.println(
                        count++ + ". "
                                + teamTemp.getName() + " очков " + teamTemp.getPoints()
                                + ", туров: " + teamTemp.getPassedTour()
                                + ", (победы: " + teamTemp.getMatchesWin()
                                + ", поражения: " + teamTemp.getMatchesLose() + ")"
                                + ", конференция: " + teamTemp.getConference());
            }
        }
        System.out.println();
    }

    @Override
    public int getScoreWin() {
        return 3;
    }

    @Override
    public int getScoreLose() {
        return 1;
    }

}
