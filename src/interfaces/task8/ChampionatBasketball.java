package interfaces.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ChampionatBasketball extends Championat implements SportType {
    private final boolean isEven = (getListTeams().size() % 2) == 0;                            //четное кол-во команд?
    private final int[][] array = isEven ?                                                      // array [8][8]
            new int[getListTeams().size()][getListTeams().size()] :
            new int[getListTeams().size()+1][getListTeams().size()+1];
    private final int countTours = isEven ? getListTeams().size() - 1 : getListTeams().size();  //четное кол-во команд ? 8-1 : 7;

    ChampionatBasketball(String name, int year, int countConference, ArrayList<Team> listTeams, int gamesWithEach) {
        super(name, year, countConference, listTeams, gamesWithEach);
        setNameSport("Баскетбол");
    }

    public void startChampionat() {                         //вынести на уровень выше и сделать абстрактным
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
            teamA.addPoints(getScoreWin());        //победителю присуждаем очки
            teamA.addMatchesWin();                 //победителю добавляем победу
            teamB.addPoints(getScoreLose());       //проигравшим присуждаем очки
            teamB.addMatchesLose();                //проигравшему добавляем поражение
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
        System.out.println("########################## ИТОГОВАЯ ТАБЛИЦА С СОРТИРОВКОЙ ##########################");
        System.out.println();
        ArrayList<Team> tempListTeams = new ArrayList<>(getListTeams());      //список участников
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