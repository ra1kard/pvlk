package interfaces.task8;

import java.util.ArrayList;

public class ChampionatHockey extends Championat {
    String nameSport = "Хоккей";

    ChampionatHockey(String name, int year, int countConference, int countTeamMembers,
                     ArrayList<Team> listTeams, int countGamesWithEach) {
        super(name, year, countConference, countTeamMembers, listTeams, countGamesWithEach);
    }

    public String getNameSport() {
        return nameSport;
    }

}