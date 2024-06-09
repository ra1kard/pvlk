package interfaces.task8;

import java.util.ArrayList;
import java.util.Random;

public class Start {
    public static void main(String[] args) {

        ChampionatFootball championatFootball = new ChampionatFootball(
                "РПЛ", 2024, 1, 6,
                generateTeams(16), 2
        );
        Championat.printTeamFromChampionat(championatFootball);
        championatFootball.startChampionat();

    }

    public static ArrayList<Team> generateTeams(int count) {
        ArrayList teams = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int attack = random.nextInt(100) + 1;
            int defense = random.nextInt(100) + 1;
            String name = "team" + (i + 1);
            Team temp = new Team(name, attack, defense);
            teams.add(temp);
        }
        return teams;
    }

}
