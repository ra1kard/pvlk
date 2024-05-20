package interfaces.task7;

public class Auto implements Transportable {
    private int costDelivery;
    private int width;
    private int height;
    private int length;

    Auto(int costDelivery, int width, int height, int length) {
        this.costDelivery = costDelivery;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public int costDelivery() {
        return costDelivery;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Авто";
    }

}
