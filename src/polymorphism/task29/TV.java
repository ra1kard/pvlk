package polymorphism.task29;

public class TV extends Electronics {
    private int inches;

    TV(int inches) {
        this.inches = inches;
    }

    @Override
    public void printInfo() {
        System.out.println("Диагональ ТВ: " + inches);
    }

}
