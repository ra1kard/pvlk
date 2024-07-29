package generics.task5;

import java.time.LocalDate;

public class Start {

    public static void main(String[] args) {
        Warehouse<Electro> warehouse1 = new Warehouse(3);            //Electro (склад электроники)
        Warehouse<Furniture> warehouse2 = new Warehouse(3);            //Furniture (склад мебели)
        Warehouse<Household> warehouse3 = new Warehouse(3);            //Household (склад бытовой техники)

        Tv yaTv = new Tv("YaTv", 41000, 43, LocalDate.of(2023, 11, 5));
        Tv smTv = new Tv("SmTv", 89000, 50, LocalDate.of(2023, 11, 5));
        Pc asus = new Pc("Asus", 68100, "i9", LocalDate.now());
        Pc hp = new Pc("HP", 97100, "i9", LocalDate.now());

        Bed bed1 = new Bed("Orel", 15000, LocalDate.of(2024, 1, 12));
        Bed bed2 = new Bed("Morel", 25000, LocalDate.of(2024, 5, 26));
        Closet closet1 = new Closet("Atlant", 54000, LocalDate.of(2023, 11, 27));
        Closet closet2 = new Closet("Rodos", 54000, LocalDate.of(2023, 11, 27));

        WashingMachine bosh = new WashingMachine(
                "Bosh", 62700, true, LocalDate.of(2023, 12,15));
        Kettle kettle = new Kettle(
                "Bork", 24900, true, LocalDate.now());

        /**
         * Склад1: демонстрация того, что нельзя добавить другой тип товара на склад
         */
        warehouse1.addItem(yaTv);
        warehouse1.addItem(asus);
        //warehouse1.addItem(bed1);     //нельзя добавить
        //warehouse1.addItem(bosh);     //нельзя добавить

        //Печать всех ячеек на складе
        warehouse1.printAllPlace();
        //Печать занятых ячеек на складе
        warehouse1.printOccupiedPlace();

        //Отправка в магазин
        warehouse1.sendToStore(yaTv);

        //Печать всех ячеек на складе
        warehouse1.printAllPlace();
        //Печать занятых ячеек на складе
        warehouse1.printOccupiedPlace();

        /**
         * Склад2
         */
        warehouse2.addItem(bed1);
        warehouse2.addItem(closet1);
        //warehouse2.addItem(bosh);     //нельзя добавить

        /**
         * Склад3
         */
        warehouse3.addItem(bosh);
        warehouse3.addItem(kettle);
        //warehouse3.addItem(bed1);     //нельзя добавить
    }

}
