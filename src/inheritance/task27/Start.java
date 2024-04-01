package inheritance.task27;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Cottage cottage1 = new Cottage(
                true,
                Material.TREE,
                2,
                8,
                new Garage(true, Material.BRICK, 2, true),
                125,
                false
        );
        Cottage cottage2 = new Cottage(
                true,
                Material.TREE,
                1,
                5,
                new Garage(true, Material.BRICK, 1, false),
                100,
                false
        );
        Cottage cottage3 = new Cottage(
                true,
                Material.BRICK,
                2,
                8,
                new Garage(true, Material.BRICK, 2, true),
                125,
                false
        );
        Cottage cottage4 = new Cottage(
                true,
                Material.BRICK,
                1,
                5,
                new Garage(true, Material.BRICK, 1, false),
                100,
                false
        );
        Cottage cottage5 = new Cottage(
                true,
                Material.GASSILICATEBLOCKS,
                2,
                8,
                new Garage(true, Material.BRICK, 2, true),
                125,
                true
        );
        Cottage cottage6 = new Cottage(
                false,
                Material.GASSILICATEBLOCKS,
                2,
                8,
                new Garage(true, Material.BRICK, 2, true),
                180,
                true
        );


        ApartmentHouse apartmentHouse1 = new ApartmentHouse(
                true,
                Material.BRICK,
                17,
                57,
                30,
                true,
                2
        );
        ApartmentHouse apartmentHouse2 = new ApartmentHouse(
                true,
                Material.BRICK,
                12,
                40,
                10,
                true,
                1
        );
        ApartmentHouse apartmentHouse3 = new ApartmentHouse(
                true,
                Material.BRICK,
                22,
                73,
                0,
                false,
                2
        );
        ApartmentHouse apartmentHouse4 = new ApartmentHouse(
                true,
                Material.BRICK,
                22,
                73,
                0,
                false,
                4
        );
        ApartmentHouse apartmentHouse5 = new ApartmentHouse(
                true,
                Material.GASSILICATEBLOCKS,
                12,
                40,
                0,
                false,
                2
        );
        ApartmentHouse apartmentHouse6 = new ApartmentHouse(
                false,
                Material.GASSILICATEBLOCKS,
                35,
                115,
                50,
                true,
                4
        );


        ArrayList<House> cottageList = new ArrayList<>(List.of(             //  !
                cottage1, cottage2, cottage3, cottage4, cottage5, cottage6));

        ArrayList<House> apartmentHouseList = new ArrayList<>(List.of(      //  !
                apartmentHouse1, apartmentHouse2, apartmentHouse3, apartmentHouse4, apartmentHouse5, apartmentHouse6));

        /**
         * 1. вывести информацию о всех домах с фундаментом
         */
        printHasFoundation(cottageList);
        printHasFoundation(apartmentHouseList);

        /**
         * 2. найти городские коттеджи с фундаментом, из кирпича, которые имеют гараж на 2 авто, площадью 100
         */
        printCottageBrickWith2Parking100Area(cottageList);
    }

    /**
     * 1. вывести информацию о всех домах с фундаментом
     */
    public static void printHasFoundation(ArrayList<House> arrayList) {    // ТУТ НЕ МОГ УКАЗАТЬ <HOUSE>
        System.out.println("Информация о домах с фундаментом:");
        for (House house : arrayList) {
            if (house.isFoundation()) {
                System.out.println(
                        "Материал: " + house.getMaterial() + ", " +
                                "Этажность: " + house.getNumberOfFloors() + ", "
                );
            }
        }
        System.out.println();
    }
    /*public static void printHasFoundation(ArrayList<House> arrayList) {    // ТУТ НЕ МОГ УКАЗАТЬ <HOUSE>
        System.out.println("Информация о домах с фундаментом:");
        for (House house : arrayList) {
            if (house instanceof Cottage && house.isFoundation()) {
                System.out.println(
                        "Материал: " + house.getMaterial() + ", " +
                                "Этажность: " + house.getNumberOfFloors() + ", " +
                                "Гараж теплый? " + ((Cottage) house).getGarage().isHeated() + ", " +    //как запомнить?
                                "Городской? " + ((Cottage) house).isUrban()
                );
            } else if (house instanceof ApartmentHouse && house.isFoundation()) {
                System.out.println(
                        "Материал: " + house.getMaterial() + ", " +
                                "Этажность: " + house.getNumberOfFloors() + ", " +
                                "Паркинг: " + ((ApartmentHouse) house).isUndergroundParking() + ", " +
                                "Парковочных мест: " + ((ApartmentHouse) house).getNumberOfParking()
                );
            }
        }
        System.out.println();
    } */

    /**
     * 2. найти городские коттеджи с фундаментом, из кирпича, которые имеют гараж на 2 авто, площадью 100
     */
    public static void printCottageBrickWith2Parking100Area(ArrayList<House> arrayList) {
        System.out.println("Городские коттеджи с фундаментом, из кирпича, которые имеют гараж на 2 авто, площадью 100:");
        for (House house : arrayList) {
            if (house.isFoundation()
                    && house.getMaterial() == Material.BRICK
                    && ((Cottage) house).getGarage().getQuantityCar() == 2
                    && ((Cottage) house).getHouseArea() >= 100) {
                System.out.println(
                        "Материал: " + house.getMaterial() + ", " +
                                "Этажность: " + house.getNumberOfFloors() + ", " +
                                "Гараж теплый? " + ((Cottage) house).getGarage().isHeated() + ", " +
                                "Городской? " + ((Cottage) house).isUrban()
                );
            }
        }
        System.out.println();
    }



}
/*
* ДЗ:
* 1+ изучить вопрос: метод toString как самый лучший пример полиморфизма - применить к 27 задаче
* 2. доделать 27 задачу
* 3. сделать задачи, что скинет Паша
* */
