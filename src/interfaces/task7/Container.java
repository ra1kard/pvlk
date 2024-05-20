package interfaces.task7;

public class Container {
    private int count;
    private Transportable item;
    private int width;
    private int height;
    private int length;

    Container(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void loadingItem(Transportable item) {       //погрузка объекта в контейнер
        this.item = item;
        /*if (canTransport(item)) {
            this.item = item;
        }*/
    }

    boolean canTransport(Transportable item) {   //возвр true объект помещается в контейн, иначе false
        return width >= item.getWidth() && height >= item.getHeight() && length >= item.getLength();
    }

    public int getVolume() {
        return width * height * length;
    }

    public Transportable getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
