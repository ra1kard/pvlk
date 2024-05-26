package interfaces.task7;

public class Ship extends TranportItem implements Transportable {

    Ship(int costDelivery, int width, int height, int length) {
        super(costDelivery, width, height, length);
    }

    @Override
    public String toString() {
        return "Корабль";
    }

    @Override
    public int costDelivery() {
        return 0;
    }

}
