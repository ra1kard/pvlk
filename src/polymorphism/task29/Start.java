package polymorphism.task29;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Customer lena = new Customer("Лена");
        Customer vlad = new Customer("Влад");
        Customer bora = new Customer("Боря");

        Shop biggeek = new Shop("BigGeek");
        Washer lg1 = new Washer(50, 50, 45);
        Washer lg2 = new Washer(50, 50, 60);
        TV samsung43 = new TV(43);
        TV samsung50 = new TV(50);
        Refrigerator bosh1 = new Refrigerator(200, 30);
        Refrigerator bosh2 = new Refrigerator(300, 50);

        biggeek.sale(lena, lg1);
        biggeek.sale(vlad, samsung43);
        biggeek.sale(bora, bosh2);

        ArrayList<Electronics> arrayList = new ArrayList<>(List.of(lg1, lg2, samsung43, samsung50, bosh1, bosh2));

        for (Electronics electronics : arrayList) {
            electronics.printInfo();
        }
    }

}