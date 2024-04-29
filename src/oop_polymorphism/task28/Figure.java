package oop_polymorphism.task28;

public abstract class Figure {
    private String name;
    private int width;
    private int height;

    Figure(String name, int width, int height) {
        if (width > 0 && height > 0) {
            this.name = name;
            this.width = width;
            this.height = height;
        }
    }

    Figure(String name, int width) {
        if (width > 0) {
            this.name = name;
            this.width = width;
        }
    }

    /**
     * функция вычисляет площадь фигуры
     * поскольку класс абстрактный, в нем функция будет возвращать ноль
     * потому что неизвестно какой формулой для расчета пользоваться
     */
    public int getSquire() {
        return 0;
    }

    /**
     * функция вычисляет периметр фигуры
     */
    public int getPerimeter() {
        return 2 * this.width + 2 * height;
    }


    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
