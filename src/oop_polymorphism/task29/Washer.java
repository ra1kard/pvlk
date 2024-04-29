package oop_polymorphism.task29;

public class Washer extends Electronics {
    private int height;
    private int weight;
    private int depth;

    Washer(int height, int weight, int depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    @Override
    public void printInfo() {
        System.out.println("Стиральная машина " +
                "высота: " + height + ", " +
                "ширина: " + weight + ", " +
                "глубина: " + depth);
    }

}
