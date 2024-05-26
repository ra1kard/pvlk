package interfaces.task7;

public class Auto extends TranportItem implements Transportable {

    public Auto(int costDelivery, int width, int height, int length) {
        super(costDelivery, width, height, length);
    }

    @Override
    public String toString() {
        return "Авто";
    }

    @Override
    public int costDelivery() {
        return 0;
    }

}
