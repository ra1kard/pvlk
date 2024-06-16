package interfaces.task8;

import java.util.ArrayList;

public class ChampionatBasketball extends Championat {

    ChampionatBasketball(String name, int year, int countConference, ArrayList<Team> listTeams, int countGamesWithEach) {
        super(name, year, countConference, listTeams, countGamesWithEach);
        setNameSport("Баскетбол");
    }

}
