package classes.task3;

import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        ArrayList<Village> listVillages = new ArrayList();

        //Способ №1 - используем пустой конструктор
        Village village1 = new Village();
        House house1 = new House();
        house1.setNameOwner("Щуков");
        house1.setAddress("Пятницкая 1");
        village1.addHouse(house1);
        village1.addHouse("Ребров", "Пятницкая 2");
        village1.addHouse("Семцов", "Пятницкая 3");
        village1.addHouse("Иванов", "Пятницкая 4");
        for (int i = 0; i < village1.getHouses().size(); i++) {
            System.out.println(village1.getHouses().get(i).getAddress());
        }
        System.out.println();

        //Способ №2 - используем полный конструктор
        House house11 = new House("Голов", "Южная 11");
        House house12 = new House("Руков", "Южная 12");
        House house13 = new House("Ногов", "Южная 13");
        House house14 = new House("Носов", "Южная 14");
        ArrayList<House> housesVillage2 = new ArrayList<>();
        housesVillage2.add(house11);
        housesVillage2.add(house12);
        housesVillage2.add(house13);
        housesVillage2.add(house14);
        Village village2 = new Village("Болобаново", housesVillage2);
        village2.addHouse("Пальцев", "Южная 15");
        for (int i = 0; i < village2.getHouses().size(); i++) {
            System.out.println(village2.getHouses().get(i).getAddress());
        }
        System.out.println();

        listVillages.add(village1);
        listVillages.add(village2);


        //определить деревню, в которой наибольшее количество домов
        int count = 0;
        String villageMoreHouses = null;
        for (Village village : listVillages) {
            if (village.getHouses().size() > count) {
                villageMoreHouses = village.getName();
            }
        }
        System.out.println("Наибольшее кол-во домов в деревне: " + villageMoreHouses);
        System.out.println();


        //определить имена людей, чьи дома находятся первыми в деревне
        for (Village village : listVillages) {
            System.out.println("В деревне " + village.getName() + " первый дом принадлежит владельцу: "
                    + village.getHouses().get(0).getNameOwner());
        }
        System.out.println();

        //определить адреса последних домов в деревне
        for (Village village : listVillages) {
            System.out.println(
                    "В деревне " +
                            village.getName() + " последний дом находится по адресу: " +
                            village.getHouses().get(village.getHouses().size()-1).getAddress()
            );
        }
    }

}
