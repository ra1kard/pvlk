package interfaces.task7;

public abstract class TranportItem {
    private int costDelivery;
    private int width;
    private int height;
    private int length;

    public TranportItem(int costDelivery, int width, int height, int length) {
        this.costDelivery = costDelivery;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getCostDelivery() {
        return costDelivery;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

}
