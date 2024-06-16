package interfaces.task8;

import java.util.ArrayList;

public class ChampionatFootball extends Championat {
    Football football = new Football();                     //мб убрать и перенести сюда поля/методы, импл инт
    private final String nameSport = "Футбол";
    int passedTour = 0;
    boolean isEven = (getListTeams().size() % 2) == 0;                              //четное кол-во команд?
    int[][] array = isEven ?                                                        // array [8][8]
            new int[getListTeams().size()][getListTeams().size()] :
            new int[getListTeams().size()+1][getListTeams().size()+1];
    int countTours = isEven ? getListTeams().size() - 1 : getListTeams().size();    //четное кол-во команд ? 8-1 : 7;

    ChampionatFootball(String name, int year, int countConference, ArrayList<Team> listTeams, int gamesWithEach) {
        super(name, year, countConference, listTeams, gamesWithEach);
    }

    public void startChampionat() {                         //вынести на уровень выше и сделать абстрактным
        System.out.println("Турнир стартовал!");
        System.out.println();
        schedule();
        for (int i = 0; i < countTours; i++) {
            tour();
            printTable();
        }
        printFinishTable();
    }

    /**
     * Расписание турнира реализовано по круговой системе (используется в большинстве турниров):
     * https://shashki74.blogspot.com/p/blog-page_44.html по способу 3
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
    public void schedule() {
        //заполним туры в ячейки, потом для тура 2 будем искать ячейку со значением = 2, i будем teamA, j teamB
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                array[i][j] = ((i + j) % (array.length - 1)) + 1;
            }
        }

        //запишем последнюю строчку по определенной логике
        int lastRow = array.length - 1;
        array[lastRow][0] = 1;                                                  //если 1я ячейка нижн строчки = это 1
        for (int j = 1; j < array.length - 1; j++) {
            boolean isRange = array[lastRow][j - 1] + 2 <= array.length;
            array[lastRow][j] = isRange ? array[lastRow][j - 1] + 2 : 2;        //если > 7 начинаем с 2: 1 3 5 7 2 4
        }

        //распечатаем, чтобы видеть расписание туров
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void tour() {
        addPassedTour();
        //для первого тура мне надо найти цифру 1 в таблице и соответственно узнаю команды
        System.out.println("########################## Тур №" + getPassedTour() + " ##########################");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == getPassedTour()      //если значение двумерного массива = № тура, берем команды
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

    public void printFinishTable() {
        System.out.println("----------------- ИТОГОВАЯ ТАБЛИЦА -----------------");
        System.out.println();
        ArrayList<Team> tempListTeams = getListTeams();
        //Collections.sort(getListTeams());
    }
    //потребуется компоратор вторым параметром

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

//таблица - стандартные сортировки в arrayList
