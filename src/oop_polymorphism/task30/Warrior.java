package oop_polymorphism.task30;

public class Warrior extends Hero {
    private int armour;                 //броня

    Warrior(String name, int hp, int hit, int armour) {
        super(name, hp, hit);
        this.armour = armour;
    }

    /**
     * воин имеет спец броню, поэтому наносимый ему урон снижается пропорционально кол-ву брони
     */
    void getDamageFromEnemy(Hero hero) {
        System.out.println(hero.getName() + " наносит урон " + this.getName());
        this.setHp(this.getHp() - (hero.getHit() - this.armour));

        //особенности если бил маг
        if (hero instanceof Magician) {
            ((Magician) hero).heal();
        }
    }

}