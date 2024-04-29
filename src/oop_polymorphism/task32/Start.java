package oop_polymorphism.task32;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Start {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(3);

        Tv yaTv = new Tv("YaTv", 41000, 43, LocalDate.of(2023, 11, 05));
        Tv smTv = new Tv("SmTv", 89000, 50, LocalDate.of(2023, 11, 05));
        WashingMachine bosh = new WashingMachine("Bosh", 62700, true, LocalDate.of(2023, 12,15));
        Pc asus = new Pc("Asus", 68100, "i9", LocalDate.now());
        Kettle kettle = new Kettle("Bork", 24900, true, LocalDate.now());

        warehouse.addItem(yaTv);
        warehouse.addItem(smTv);
        warehouse.addItem(bosh);
        warehouse.addItem(asus);
        warehouse.addItem(kettle);
        warehouse.printOccupiedPlace();

        //warehouse.sendToStore(asus);
        warehouse.printOccupiedPlace();

        //System.out.println(asus.toString());

        HashMap<String, Item> map = new HashMap<>();
        map.putAll(warehouse.getItems());
        for (Map.Entry<String, Item> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                System.out.println(entry.getValue());
            }
        }
    }

}
