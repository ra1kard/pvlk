package polymorphism.task32;

import java.time.LocalDate;

public class Start {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(3);

        Tv yaTv = new Tv("YaTv", 41000, LocalDate.of(2023, 11, 05));
        Tv smTv = new Tv("SmTv", 89000, LocalDate.of(2023, 11, 05));
        WashingMachine bosh = new WashingMachine("Bosh", 62700, LocalDate.of(2023, 12,15));
        Pc asus = new Pc("Asus", 68100, LocalDate.now());
        Kettle kettle = new Kettle("Bork", 24900, LocalDate.now());

        warehouse.addItem(yaTv);
        warehouse.addItem(smTv);
        warehouse.addItem(bosh);
        warehouse.addItem(asus);
        warehouse.addItem(kettle);
        warehouse.printOccupiedPlace();

        warehouse.sendToStore(asus);
        warehouse.printOccupiedPlace();
    }

}
