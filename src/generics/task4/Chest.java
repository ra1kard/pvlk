package generics.task4;

public class Chest<T extends Treasure> {    //сундук с сокровищами
    T treasure;

    Chest(T treasure) {
        this.treasure = treasure;
    }

}
