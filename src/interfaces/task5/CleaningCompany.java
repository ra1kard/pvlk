package interfaces.task5;

import java.util.ArrayList;

public class CleaningCompany {
    private String name;

    CleaningCompany(String name) {
        this.name = name;
    }

    /**
     * метод который возвращает стоимость уборки объекта
     */
    int cleanupItem(Cleanupable item) {
        return item.getCost();
    }

    /**
     * метод который возвращает стоимость влажной уборки объекта
     */
    int washItem(Washable item) {
        return item.getCost();
    }

    /**
     * 1+ метод метод который выводит перечень работ, с указанием стоимости по каждой работе
     * 2+ после вывода перечня работ метод должен вывести итоговую стоимость за уборку
     * 3. для каждой отдельной работы должно вывод сообщ формата <название предм><тип услуги><стоимость>
     */
    void order(ArrayList<Cleanupable> cleanupableList, ArrayList<Washable> washableList) {
        int count = 0;
        System.out.println("Перечень работ:");
        for (Cleanupable cl : cleanupableList) {
            System.out.println("Название предмета: " + cl.toString() +
                    ", Тип услуги: " + cl.cleanup() +
                    ", Стоимость = " + cl.getCost());
            count += cleanupItem(cl);
        }
        for (Washable ws : washableList) {
            System.out.println("Название предмета: " + ws.toString() +
                    ", Тип услуги: " + ws.wash() +
                    ", Стоимость = " + ws.getCost());
            count += washItem(ws);
        }
        System.out.println("----------------------");
        System.out.println("Итоговая стоимость за уборку перечисленного: " + count);
    }

}
