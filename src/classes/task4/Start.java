package classes.task4;

public class Start {

    public static void main(String[] args) {
        Organisation sberbank = new Organisation(
                new PostalAddress("Россия", "Москва", "117312", "Вавилова, д. 19"),
                new PhysicalAddress("Россия", "Москва", "117997", "Вавилова, д. 19"),
                "ПАО «Сбербанк»",
                "Греф Герман");

        Organisation lukoil = new Organisation(
                new PostalAddress("Россия", "Москва", "101000,", "Сретенский бульвар, 11"),
                new PhysicalAddress("Россия", "Москва", "125047", "Гашека, дом 6"),
                "ПАО «Лукойл»",
                "Алекперов Вагит");

        //печать данных ДО изменений
        sberbank.printOrganisationInfo(sberbank);
        System.out.println();

        //печать данных ПОСЛЕ изменений
        sberbank.getPostalAddress().setIndex("117313");
        sberbank.getPhysicalAddress().setCity("Санкт-Петербург");
        sberbank.getPhysicalAddress().setIndex("198205");
        sberbank.getPhysicalAddress().setStreet("Набережная 19");
        sberbank.printOrganisationInfo(sberbank);
    }

}
