package classes.task18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Start {
    public static void main(String[] args) {
        Bank bankMos = new Bank(
                "ОАО Сбербанк",
                "Агаров А.А.",
                new ArrayList<>(List.of("Барышиха 21", "Чехова 12")),
                new ArrayList<>(List.of(Currency.RUB, Currency.CNY, Currency.INR)),
                250000000);
        Bank bankSpb = new Bank(
                "ОАО АТинькофф",
                "Рубилов Ф.В.",
                new ArrayList<>(List.of("Игоева 17", "Салютный пер. 7")),
                new ArrayList<>(List.of(Currency.RUB, Currency.CNY, Currency.USD, Currency.EUR)),
                270000000);
        Bank bankEkb = new Bank(
                "ОАО Открытие",
                "Лилова С.В.",
                new ArrayList<>(List.of("Самов 22", "Сходненская 1")),
                new ArrayList<>(List.of(Currency.RUB, Currency.INR, Currency.USD, Currency.EUR)),
                170000000);

        ArrayList<Bank> banks = new ArrayList(List.of(bankMos, bankSpb, bankEkb));

        /**
         * банк с самым большим капиталом
         */
        printMostCapital(banks);

        /**
         * печать всех владельцев банков
         */
        printOwners(banks);

        /**
         * печать банков, использующих Юань
         */
        printBanksUseCNY(banks);

        /**
         * вывод банков отсортированных по названию
         */
        printAlphabetBanksName(banks);

        /**
         * название банка, по указанному пользователем адресу
         */
        printAddressToBank(banks);
    }

    /**
     * банк с самым большим капиталом
     */
    public static void printMostCapital(ArrayList<Bank> banks) {
        Bank tempBank = null;
        for (Bank bank : banks) {
            if (tempBank == null) {
                tempBank = bank;
            } else if (bank.getCapital() > tempBank.getCapital()) {
                tempBank = bank;
            }
        }
        assert tempBank != null;
        System.out.println("Банк с самым большим капиталом: " + tempBank.getName());
        System.out.println();
    }

    /**
     * печать всех владельцев банков
     */
    public static void printOwners(ArrayList<Bank> banks) {
        for (Bank bank : banks) {
            System.out.println("Владелец банка " + bank.getName() + " - " + bank.getOwner());
        }
        System.out.println();
    }

    /**
     * печать банков, использующих Юань
     */
    public static void printBanksUseCNY(ArrayList<Bank> banks) {
        for (Bank bank : banks) {
            if (bank.getCurrency().contains(Currency.CNY)) {
                System.out.println("Банк " + bank.getName() + " используют Юани");
            }
        }
        System.out.println();
    }

    /**
     * вывод банков отсортированных по названию
     */
    public static void printAlphabetBanksName(ArrayList<Bank> banks) {
        TreeSet treeSet = new TreeSet();
        System.out.println("Выведем названия банков в алфавитном порядке:");
        for (Bank bank : banks) {
            treeSet.add(bank.getName());
        }
        for (Object o : treeSet) {
            System.out.println(o);
        }
        System.out.println();
    }

    /**
     * название банка, по указанному пользователем адресу
     */
    public static void printAddressToBank(ArrayList<Bank> banks) {
        System.out.println("Введите адрес, по которому хотите найти банк: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        /*for (Bank bank : banks) {                                         //быстрее, но без регистра
            if (bank.getAddress().contains(str.toLowerCase())) {
                System.out.println("Название банка по адресу: " + bank.getName());
                System.out.println();
                break;
            }
        }*/
        for (Bank bank : banks) {                                           //дольше, но с регистром
            for (String address : bank.getAddress()) {
                if (address.toLowerCase().contains(str.toLowerCase())) {
                    System.out.println("Название банка по адресу: " + bank.getName());
                    System.out.println();
                    break;
                }
            }
        }
    }

}
//допилить задание 18 classes