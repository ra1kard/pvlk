package polymorphism.task30;

import java.util.Random;

public class Archer extends Hero {        //лучник

    Archer(String name, int hp, int hit) {
        super(name, hp, hit);
    }

    /**
     * лучник оч ловкий, успе атаковать дважды, пока враг до него доберется
     * и имеет шанс нанести критический урон в полтора раза превышающий его урон
     */
    void getDamageFromEnemy(Hero hero) {
        System.out.println(hero.getName() + " наносит урон! " + this.getName());

        //минуточку, мы сами нанесем удары
        hero.getDamageFromEnemy(this);
        hero.getDamageFromEnemy(this);

        //и даже критический удар попробуем
        Random random = new Random();
        if (random.nextInt(2) == 1) {
            System.out.println("Боже, это критический удар от " + this.getName());
            int temp = getHit();
            this.setHit(getHit() + getHit()/2);
            hero.getDamageFromEnemy(this);
            this.setHit(temp);
        }

        //а теперь получим урон
        this.setHp(this.getHp() - (hero.getHit()));

        //особенности если бил маг
        if (hero instanceof Magician) {
            ((Magician) hero).heal();
        }
    }

}
