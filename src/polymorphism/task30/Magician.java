package polymorphism.task30;

import java.util.Random;

public class Magician extends Hero {

    Magician(String name, int hp, int hit) {
        super(name, hp, hit);
    }

    void getDamageFromEnemy(Hero hero) {
        System.out.println(hero.getName() + " наносит урон! " + this.getName());
        this.setHp(this.getHp() - (hero.getHit()));
    }

    /**
     * маг способен применять исцеляющую магию, поэтому он может лечить себя после каждой
     * усп атаки по противнику
     */
    void heal() {       //исцелиться (считаем успешность атаки 50%
        Random random = new Random();
        if (random.nextInt(2) == 1) {
            if (super.getHp() < 88) {super.setHp(88);}
        }
    }

}
