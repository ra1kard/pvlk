package polymorphism.task30;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Captain Am.", 100,20, 30);
        Magician magician = new Magician("Dr. Strange", 100, 40);
        Archer archer = new Archer("Green Arrow", 100, 30);

        ArrayList arrayListHero = new ArrayList<>(List.of(warrior, magician, archer));
        print(arrayListHero);

        warrior.getDamageFromEnemy(magician);
        print(arrayListHero);

        magician.getDamageFromEnemy(warrior);
        print(arrayListHero);

        warrior.getDamageFromEnemy(magician);
        print(arrayListHero);


        /*magician.getDamageFromEnemy(archer);
        print(arrayListHero);

        archer.getDamageFromEnemy(magician);
        print(arrayListHero);*/


        /*fight(warrior, archer);
        print(arrayListHero);*/
    }

    public static void print(ArrayList<Hero> arrayList) {
        System.out.println();
        for (Hero hero : arrayList) {
            System.out.println(hero.getName() + " имеет hp: " + hero.getHp());
        }
        System.out.println();
    }

    public static void fight(Hero hero1, Hero hero2) {
        System.out.println("Начался бой между " + hero1.getName() + " и " + hero2.getName());
        System.out.println();
        hero1.getDamageFromEnemy(hero2);
        hero2.getDamageFromEnemy(hero1);
        Hero win = hero1.getHp() > hero2.getHp() ? hero1 : hero2;
        System.out.println("Победил " + win.getName());
    }

}
