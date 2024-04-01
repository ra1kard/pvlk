package polymorphism.task29;

public abstract class Electronics {
    private String brand;
    private int price;
    private int discount;

    public void printInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Цена: " + price);
        System.out.println("Скидка: " + getDiscount());
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
