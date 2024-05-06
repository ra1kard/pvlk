package interfaces.task3;

import java.util.ArrayList;

public class ShootingRange {
    private int points;
    private ArrayList<Targetable> arrayList = new ArrayList<>();

    public ArrayList<Targetable> getArrayList() {
        return arrayList;
    }

    public void setArrayList(Targetable targetable) {
        this.arrayList.add(targetable);
    }

    /**
     * метод имитирует одну игру (quantity - кол-во выстрелов)
     * метод должен:
     * 1. выводить процесс стрельбы (куда попал, а куда не попал)
     * 2. и общую сумму баллов, которую получил игрок
     */
    void startGame(int quantity) {
        for (int i = 1; i < quantity + 1; i++) {
            System.out.println("Попытка №" + i);
            for (Targetable targetable : arrayList) {
                points += targetable.hit();
            }
            System.out.println("ИТОГОВОЕ кол-во баллов = " + points);
        }

        System.out.println();
        if (points <= 30) {
            System.out.println("Бедолага! Попробуйте еще раз!");
        } else if (points <= 70) {
            System.out.println("Ваш уровень удручает, но возьмите маленькую мягкую игрушку!");
        } else if (points <= 90) {
            System.out.println("Весь мир вам хлопает - возьмите большую панду!");
        } else {
            System.out.println("Вы профи, идите погуляйте, здесь развлечение для любителей!");
        }
    }

}
