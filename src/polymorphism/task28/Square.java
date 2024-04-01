package polymorphism.task28;

public class Square extends Figure {

    Square(String name, int width) {
        super(name, width);
    }

    @Override
    public int getSquire() {
        return getWidth() * getWidth();
    }

    @Override
    public int getPerimeter() {
        return 10;
    }
}
