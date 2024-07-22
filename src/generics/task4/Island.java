package generics.task4;

public class Island {   //класс острова Island содержит сундук с сокровищем и названием острова
    private final String name;
    private final Chest chest;

    Island (String name, Chest chest) {
        this.name = name;
        this.chest = chest;
    }

    public String getName() {
        return name;
    }

    public Chest getChest() {
        return chest;
    }

}
