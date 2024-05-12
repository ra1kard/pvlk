package interfaces.task5;

public class Room implements Cleanupable {
    public String name = "Комната";
    private int squareMeter;
    private LevelPollution levelPollution;

    Room(int squareMeter, LevelPollution levelPollution) {
        this.squareMeter = squareMeter;
        this.levelPollution = levelPollution;
    }

    @Override
    public String cleanup() {
        return type;
    }

    @Override
    public int getCost() {
        int cost = 0;
        switch (levelPollution) {
            case EASY:
                cost = squareMeter * 150;
                break;
            case MIDDLE:
                cost = squareMeter * 200;
                break;
            case HARD:
                cost = squareMeter * 300;
                break;
        }
        return cost;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public LevelPollution getLevelPollution() {
        return levelPollution;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}
