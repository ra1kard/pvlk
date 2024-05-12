package interfaces.task5;

public class Cabinet implements Cleanupable {           //шкаф
    public String name = "Шкаф";
    private int squareMeter;
    private LevelPollution levelPollution;

    Cabinet(int squareMeter, LevelPollution levelPollution) {
        this.squareMeter = squareMeter;
        this.levelPollution = levelPollution;
    }

    @Override
    public String cleanup() {
        return type;
    }

    @Override
    public int getCost() {
        int cost = switch (levelPollution) {
            case EASY -> squareMeter * 100;
            case MIDDLE -> squareMeter * 150;
            case HARD -> squareMeter * 250;
        };
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
