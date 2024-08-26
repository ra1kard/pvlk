package generics.task5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Warehouse<Pc> warehouse1 = new Warehouse<>(4, 11);     //Electro (склад электроники)
        Warehouse<Furniture> warehouse2 = new Warehouse<>(3, 12);   //Furniture (склад мебели)
        Warehouse<Household> warehouse3 = new Warehouse<>(3,13);    //Household (склад бытовой техники)
        Warehouse<Pc> warehouse4 = new Warehouse<>(3, 14);

        Tv yaTv = new Tv("YaTv", 41000, 43, LocalDate.of(2023, 11, 5));
        Tv smTv = new Tv("SmTv", 89000, 50, LocalDate.of(2023, 11, 5));
        Pc asus = new Pc("Asus", 68100, "i9", LocalDate.now());
        Pc hp1 = new Pc("HP1", 97100, "i9", LocalDate.now());
        Pc hp2 = new Pc("HP2", 65100, "i7", LocalDate.now());
        Pc hp3 = new Pc("HP3", 65100, "i7", LocalDate.now());
        Pc hp4 = new Pc("HP4", 65100, "i7", LocalDate.now());
        Pc hp5 = new Pc("HP5", 65100, "i7", LocalDate.now());

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
        /*warehouse1.addItem(yaTv);
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
        warehouse1.printOccupiedPlace();*/

        /**
         * Склад2: демонстрация того, что нельзя добавить другой тип товара на склад
         */
        /*warehouse2.addItem(bed1);
        warehouse2.addItem(closet1);
        //warehouse2.addItem(bosh);     //нельзя добавить*/

        /**
         * Склад3: демонстрация того, что нельзя добавить другой тип товара на склад
         */
        /*warehouse3.addItem(bosh);
        warehouse3.addItem(kettle);
        //warehouse3.addItem(bed1);     //нельзя добавить*/

        //Cделать метод, который добавляет складу объект
        //если на складе больше половины свободного места (без списка, но можно исп wildcard)
        /**
         * Склад: демонстрация добавления если больше 50% мест свободно
         */
        /*warehouse1.addItem(yaTv);
        warehouse1.addItem(smTv);
        warehouse1.addItem(asus);
        warehouse1.addItem(hp1);

        //Печать всех ячеек на складе
        warehouse1.printAllPlace();
        //печать свободно ли больше 50% мест на складе? если да - добавить
        System.out.println("свободно больше 50% мест на складе? " + warehouse1.addIfIsFree50PercentPlaces(hp2));
        System.out.println();

        //Печать всех ячеек на складе
        warehouse1.printAllPlace();
        //печать свободно ли больше 50% мест на складе? если да - добавить
        System.out.println("свободно больше 50% мест на складе? " + warehouse1.addIfIsFree50PercentPlaces(hp3));
        System.out.println();

        //Печать всех ячеек на складе
        warehouse1.printAllPlace();
        //печать свободно ли больше 50% мест на складе? если да - добавить
        System.out.println("свободно больше 50% мест на складе? " + warehouse1.addIfIsFree50PercentPlaces(hp4));
        System.out.println();

        //Печать всех ячеек на складе
        warehouse1.printAllPlace();*/

        //Метод, печатающий информацию о свободных местах только
        //для списка Warhouse (складов) фурнитуры или люб наследников
        /**
         * Склад:
         * метод, печатающий информацию о свободных местах
         * только для списка Warhouse (складов) фурнитуры или любых наследников
         */
        /*warehouse1.addItem(yaTv);
        warehouse1.addItem(smTv);
        warehouse1.addItem(asus);
        warehouse1.addItem(hp1);
        warehouse1.addItem(hp2);
        warehouse1.addItem(hp3);

        warehouse2.addItem(bed1);
        warehouse2.addItem(bed2);
        warehouse2.addItem(closet1);
        warehouse2.addItem(closet2);

        warehouse3.addItem(bosh);
        warehouse3.addItem(kettle);

        //если передать ВЕСЬ список item'ов
        ArrayList<Item> itemList = new ArrayList<>(List.of(
                yaTv, smTv, asus, hp1, hp2, hp3,
                bed1, bed2, closet1, closet2,
                bosh, kettle
        ));
        printItemListAll(itemList);

        //если передать список Furniture item'ов
        ArrayList<Furniture> itemList2 = new ArrayList<>(List.of(
                bed1, bed2, closet1, closet2
        ));
        printItemListFurniture(itemList2);

        //если передать список складов Furniture
        ArrayList<Warehouse<? extends Furniture>> warehouseList = new ArrayList<>(List.of(
                warehouse2
        ));
        printWarehouseFreePlaces(warehouseList);*/

        //Метод, кот должен посчитать общ стоим тов
        //на всех складах электротоваров или его производных
        /**
         * Склад:
         * метод, который должен посчитать общую стоимость товаров
         * на всех складах электротоваров или его производных
         */
        /*warehouse1.addItem(yaTv);
        warehouse1.addItem(smTv);
        warehouse1.addItem(asus);
        warehouse1.addItem(hp1);
        warehouse1.addItem(hp2);
        warehouse1.addItem(hp3);

        warehouse2.addItem(bed1);
        warehouse2.addItem(bed2);
        warehouse2.addItem(closet1);
        warehouse2.addItem(closet2);

        warehouse3.addItem(bosh);
        warehouse3.addItem(kettle);

        warehouse4.addItem(hp4);
        warehouse4.addItem(hp5);

        //общ стоим тов на всех складах электротоваров или его производных
        ArrayList<Warehouse<? extends Electro>> warehouseList2 = new ArrayList<>(List.of(
                warehouse1, warehouse4
        ));
        printWarehouseCostItem(warehouseList2);*/

        //В список складов доб на каждый склад определенный объект
        //(допустим кидаешь список ПК и этот ПК должен на каждый склад добавиться)
        //склад1-2-3-4-5 компы1-2-3-4-5
        /**
         *
         */
        warehouse1.addItem(hp1);
        warehouse4.addItem(hp2);
        //warehouse1.addItem(hp3);
        //warehouse1.addItem(hp4);

        //warehouse2.addItem(bed1);
        //warehouse2.addItem(bed2);

        //warehouse3.addItem(bosh);
        //warehouse3.addItem(kettle);

        ArrayList<Warehouse<Pc>> warehouseList = new ArrayList<>(List.of(
                warehouse1, warehouse4
        ));

        ArrayList<Pc> itemList = new ArrayList<>(List.of(
                hp3, hp4
        ));

        addItemListElectroOnWarehouses(warehouseList, itemList);
    }










    //принимаем все, с помощью instanceof берем нужное - ок
    public static void printItemListAll(Collection<? extends Item> items) {
        System.out.println("Принимаем в метод все, но печатаем только Furniture:");
        for (Item item : items) {
            if (item instanceof Furniture) {
                System.out.println(item.getName() + " " + item.getProductItem());
            }
        }
        System.out.println();
    }

    //другой тип не удается добавить на этапе компиляции - ок
    public static void printItemListFurniture(Collection<? extends Furniture> items) {
        System.out.println("Принимаем в метод только Furniture:");
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getProductItem());
        }
        System.out.println();
    }

    //другой тип не удается добавить на этапе компиляции - ок
    public static void printWarehouseFreePlaces(Collection<Warehouse<? extends Furniture>> warehouseList) {
        System.out.println(
                "Печатаем информацию о свободных местах, " +
                "для списка Warhouse (складов) фурнитуры или любых наследников ");
        for (Warehouse<? extends Furniture> warehouse : warehouseList) {
            System.out.println("Склад №" + warehouse.getNumber() + ":");
            warehouse.getFreePlaces();
        }
        System.out.println();
        System.out.println("Для проверки полный список:");
        for (Warehouse<? extends Furniture> warehouse : warehouseList) {
            System.out.println("Склад №" + warehouse.getNumber() + ":");
            warehouse.printAllPlace();
        }
    }

    //общ стоим тов на всех складах электротоваров или его производных
    public static void printWarehouseCostItem(Collection<Warehouse<? extends Electro>> warehouseList) {
        int count = 0;
        System.out.println("Общая стоим тов на всех складах электротоваров или его производных:");
        for (Warehouse<? extends Electro> warehouse : warehouseList) {
            System.out.println(
                    "Склад № " + warehouse.getNumber() +
                    " имеет стоимость электротоваров или производных = " + warehouse.getCostAllItems());
            count += warehouse.getCostAllItems();
        }
        System.out.println("Итого: " + count);
    }

    public static void addItemListElectroOnWarehouses(
            Collection<Warehouse<Pc>> warehouseList,
            Collection<Pc> items) {

        //распечатаем изначальную картину
        for (Warehouse<Pc> warehouse : warehouseList) {
            warehouse.printAllPlace();
        }

        //добавляем
        for (Warehouse<Pc> warehouse : warehouseList) {
            for (Pc item : items) {
                //warehouse.addItem(item);
                warehouse.addItem(item);
            }
        }

        //распечатаем изначальную картину
        for (Warehouse<Pc> warehouse : warehouseList) {
            warehouse.printAllPlace();
        }

    }

}
