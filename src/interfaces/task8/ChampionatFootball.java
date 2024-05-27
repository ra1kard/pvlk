package interfaces.task8;

import java.util.ArrayList;

public class ChampionatFootball extends Championat {
    Football football = new Football();
    private final String nameSport = "Футбол";

    ChampionatFootball(String name, int year, int countConference, int countTeamMembers,
                       ArrayList<Team> listTeams, int countGamesWithEach) {
        super(name, year, countConference, countTeamMembers, listTeams, countGamesWithEach);
    }

    public String getNameSport() {
        return nameSport;
    }

    public void startChampionat() {
        System.out.println("Турнир стартовал!");
        for (int i = 0; i < getTeamMembers()-1; i++) {
            tour();
        }
        System.out.println();
    }

    public void tour() {
        System.out.println("Стартовал тур!");
        for (int i = 0; i < getListTeams().size(); i++) {       //берем команду и далее ищем соперника
            for (int j = 0; j < getListTeams().size(); j++) {
                boolean isContains = getListTeams().get(i).getPlayedOpponents().contains(getListTeams().get(j));
                if (!isContains) {
                    game(getListTeams().get(i), getListTeams().get(j));
                    getListTeams().get(i).addPlayedOpponents(getListTeams().get(j));        //в список тех, с кем играю
                }
            }
        }
        System.out.println();
    }

    public void game(Team teamA, Team teamB) {
        int goalTeamA = 0;
        int goalTeamB = 0;
        System.out.println("Стартовал матч!");
        if (teamA.getAttack() > teamB.getDefense()) {
            goalTeamA++;
        }
        if (teamB.getAttack() > teamA.getDefense()) {
            goalTeamB++;
        }
        if (goalTeamA > goalTeamB) {
            teamA.addPoints(football.getScoreWin());        //победителю присуждаем очки
            teamB.addPoints(football.getScoreLose());       //проигравшим присуждаем очки
        } else if (goalTeamA < goalTeamB) {
            teamB.addPoints(football.getScoreWin());
            teamA.addPoints(football.getScoreLose());
        } else {
            teamA.addPoints(football.getScoreTie());
        }
        System.out.println();
    }

}
