package interfaces.task7;

public class Elephant extends TranportItem implements Transportable {

    Elephant(int costDelivery, int width, int height, int length) {
        super(costDelivery, width, height, length);
    }

    @Override
    public String toString() {
        return "Слон";
    }

    @Override
    public int costDelivery() {
        return 0;
    }

}
