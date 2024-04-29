package oop_polymorphism.task28;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle("tr1", 10, 5);
        Triangle triangle2 = new Triangle("tr2", 15, 10);
        Square square1 = new Square("sq1", 4);
        Square square2 = new Square("sq2", 17);
        Rectangular rectangular1 = new Rectangular("rc1", 3, 7);
        Rectangular rectangular2 = new Rectangular("rc1", 13, 7);

        ArrayList<Figure> arrayList = new ArrayList<>(List.of(
                triangle1, triangle2, square1, square2, rectangular1, rectangular2));

        for (Figure figure : arrayList) {
            calculateSquare(figure);
        }

        System.out.println();
        for (Figure figure : arrayList) {
            calculatePerimeter(figure);
        }
    }

    public static void calculateSquare(Figure figure) {
        System.out.println("Площадь " + figure.getName() + " равна " + figure.getSquire());
    }

    public static void calculatePerimeter(Figure figure) {
        System.out.println("Периметр " + figure.getName() + " равен " + figure.getPerimeter());
    }




}
