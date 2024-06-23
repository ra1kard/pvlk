package interfaces.task8;

import java.util.ArrayList;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        ChampionatFootball championatFootball = new ChampionatFootball(
                "РПЛ", 2024, 1, generateTeams(8, 1), 2);
        championatFootball.startChampionat(championatFootball);

        ChampionatBasketball championatBasketball = new ChampionatBasketball(
                "Единая лига ВТБ", 2024, 1, generateTeams(8, 1), 2);
        championatBasketball.startChampionat(championatBasketball);

        ChampionatHockey championatHockey = new ChampionatHockey(
                "КХЛ", 2024, 2, generateTeams(7, 2), 2);
        championatHockey.startChampionat(championatHockey);
    }

    public static ArrayList<Team> generateTeams(int count, int countConference) {
        ArrayList teams = new ArrayList<>();
        Random random = new Random();
        int countNumbers = 0;
        for (int i = 0; i < countConference; i++) {
            for (int j = 0; j < count; j++) {
                int attack = random.nextInt(100) + 1;
                int defense = random.nextInt(100) + 1;
                String name = "team" + (countNumbers++ + 1);
                Team temp;
                if (i == 0) {
                    temp = new Team(name, attack, defense, Conference.WEST);
                } else {
                    temp = new Team(name, attack, defense, Conference.EAST);
                }
                teams.add(temp);
            }
        }
        return teams;
    }

}
