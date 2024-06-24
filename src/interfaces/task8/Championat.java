package interfaces.task8;

import java.util.ArrayList;
import java.util.Random;

public abstract class Championat implements SportType {
    private final String name;
    private String nameSport;
    private final int year;
    private final int countConference;
    private final ArrayList<Team> listTeams = new ArrayList<>();
    private final int gamesWithEach;
    private int passedTour = 0;                                                 //тест
    private final int[][] tableChampionship;                                    //array [8][8]
    private final boolean isEven;                                               //четное кол-во команд?

    Championat(String name, int year, int countConference, ArrayList<Team> listTeams, int gamesWithEach) {
        this.name = name;
        this.year = year;
        this.countConference = countConference;
        this.listTeams.addAll(listTeams);
        this.gamesWithEach = gamesWithEach;
        this.isEven = this.listTeams.size() % 2 == 0;

        int countTeams = listTeams.size();
        this.tableChampionship = countTeams % 2 == 0 ?
                new int[countTeams][countTeams] :
                new int[countTeams + 1][countTeams + 1];
    }

    private void printTeamFromChampionat(Championat championat) {
        System.out.println("Это чемпионат " + "\"" + championat.getName() + "\"" + " " + championat.getYear()
                + ", по виду спорта: " + championat.getNameSport() );
        System.out.println();
        System.out.println("Команды:");
        for (Team team : championat.getListTeams()) {
            System.out.println(team.getName() + ", атака: " + team.getAttack() + ", защита: " + team.getDefense());
        }
        System.out.println();
    }

    public void startChampionat(Championat championat) {
        printTeamFromChampionat(championat);
        int countTours = isEven ?
                getListTeams().size() - 1 :
                getListTeams().size();
        System.out.println("Турнир стартовал!");
        System.out.println();
        schedule();
        for (int i = 0; i < getGamesWithEach(); i++) {
            System.out.println("Круг № " + (i+1));
            System.out.println();
            setPassedTour(0);
            for (int j = 0; j < countTours; j++) {
                tour();
                printTable();
            }
        }
        printFinishTable();
    }

    /**
     * Расписание турнира реализовано по круговой системе (используется в большинстве турниров):
     * <a href="https://shashki74.blogspot.com/p/blog-page_44.html">...</a> по способу 3
     * - - -
     * Используется такая схема, т.к. не удастся использовать более простую схему - с кем играл / с кем не играл.
     * Круговой турнир должен предусматривать чтобы максимально в каждом туре каждый сыграл с каждым, иначе выходило:
     * team1
     * team2
     * team3
     * team4
     * team5
     * team6
     * - - -
     * играют 1 тур:
     * team1-2
     * team3-4
     * team5-6
     * - - -
     * играют 2 тур:
     * team1-3
     * team2-4
     * team5-6 //не могут сыграть, так как уже играли в 1 туре, выходит, что уже начинается ерунда по турам
     * чтобы этого избежать и использовать более эффективное расписание - берем метод круговой системы (см вики/инет):
     */
    private void schedule() {
        //заполним туры в ячейки, потом для тура 2 будем искать ячейку со значением = 2, i будем teamA, j teamB
        for (int i = 0; i < this.tableChampionship.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                this.tableChampionship[i][j] = ((i + j) % (this.tableChampionship.length - 1)) + 1;
            }
        }

        //запишем последнюю строчку по определенной логике
        int lastRow = this.tableChampionship.length - 1;
        this.tableChampionship[lastRow][0] = 1;                                 //если 1я ячейка нижн строчки = это 1
        for (int j = 1; j < this.tableChampionship.length - 1; j++) {
            boolean isRange = this.tableChampionship[lastRow][j - 1] + 2 <= this.tableChampionship.length;
            this.tableChampionship[lastRow][j] = isRange ? this.tableChampionship[lastRow][j - 1] + 2 : 2;        //если > 7 начинаем с 2: 1 3 5 7 2 4
        }

        //распечатаем, чтобы видеть расписание туров
        for (int i = 0; i < this.tableChampionship.length; i++) {
            for (int j = 0; j < this.tableChampionship[i].length; j++) {
                System.out.print(this.tableChampionship[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void tour() {
        addPassedTour();
        //для первого тура мне надо найти цифру 1 в таблице и соответственно узнаю команды
        System.out.println("########################## Тур №" + getPassedTour() + " ##########################");
        for (int i = 0; i < tableChampionship.length; i++) {
            for (int j = 0; j < tableChampionship.length; j++) {
                if (tableChampionship[i][j] == getPassedTour()      //если значение двумерного массива = № тура, берем команды
                        && (isEven || i != getListTeams().size() && j != getListTeams().size())) {
                    Team teamA = getListTeams().get(i);
                    Team teamB = getListTeams().get(j);
                    game(teamA, teamB);
                    getListTeams().get(i).addPlayedOpponents(getListTeams().get(j));
                    getListTeams().get(j).addPlayedOpponents(getListTeams().get(i));
                    getListTeams().get(i).addPassedTour();
                    getListTeams().get(j).addPassedTour();
                }
            }
        }
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
            System.out.println("ничья, переход в овертайм!");
            Random random = new Random();
            int i = random.nextInt(2) + 1;
            if (i == 1) {
                System.out.println(teamA.getName() + " вырывает победу");
                teamA.addPoints(getScoreWin());
                teamA.addMatchesWin();
                teamB.addPoints(getScoreLose());
                teamB.addMatchesLose();
            } else {
                System.out.println(teamB.getName() + " вырывает победу");
                teamB.addPoints(getScoreWin());
                teamB.addMatchesWin();
                teamA.addPoints(getScoreLose());
                teamA.addMatchesLose();
            }
        }
        System.out.println(
                teamA.getName() + " (очков: " + teamA.getPoints() + ") и "
                        + teamB.getName() + " (очков: " + teamB.getPoints() + ")");
        System.out.println();
    }

    private void printTable() {
        System.out.println("----------------- ТАБЛИЦА -----------------");
        System.out.println();
        for (int i = 0; i < getListTeams().size(); i++) {
            Team teamTemp = getListTeams().get(i);
            System.out.println(teamTemp.getName() + " очков: " + teamTemp.getPoints()
                    + ", туров: " + teamTemp.getPassedTour());
        }
        System.out.println();
    }

    abstract void printFinishTable();

    public String getName() {
        return name;
    }

    public String getNameSport() {
        return nameSport;
    }

    public void setNameSport(String nameSport) {
        this.nameSport = nameSport;
    }

    public int getYear() {
        return year;
    }

    public int getCountConference() {
        return countConference;
    }

    public ArrayList<Team> getListTeams() {
        return listTeams;
    }

    public int getGamesWithEach() {
        return gamesWithEach;
    }

    public int getPassedTour() {
        return passedTour;
    }

    public void addPassedTour() {
        this.passedTour++;
    }

    public void setPassedTour(int passedTour) {
        this.passedTour = passedTour;
    }

}
