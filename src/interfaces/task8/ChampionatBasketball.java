package interfaces.task8;

import java.util.ArrayList;
import java.util.Collections;

public class ChampionatBasketball extends Championat implements SportType {

    ChampionatBasketball(String name, int year, int countConference, ArrayList<Team> listTeams, int gamesWithEach) {
        super(name, year, countConference, listTeams, gamesWithEach);
        setNameSport("Баскетбол");
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
                            + ", поражения: " + teamTemp.getMatchesLose() + ")");
        }
        System.out.println();
        System.out.println();
    }

    @Override
    public int getScoreWin() {
        return 2;
    }

    @Override
    public int getScoreLose() {
        return 0;
    }

}
