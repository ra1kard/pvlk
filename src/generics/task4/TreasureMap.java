package generics.task4;

public class TreasureMap {                      //карта сокровищ TreasureMap
    private final String nameIsland;            //название острова
    private final int stepsUntilChest;          //кол-во шагов до закопанного сундука (Chest)

    TreasureMap(String nameIsland, int stepsUntilChest) {
        this.nameIsland = nameIsland;
        this.stepsUntilChest = stepsUntilChest;
    }

    public String getName() {
        return nameIsland;
    }

    public int getStepsUntilChest() {
        return stepsUntilChest;
    }

}
