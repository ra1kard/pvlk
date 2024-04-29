package oop_polymorphism.task30;

public abstract class Hero {
    private String name;
    private int hp;
    private int hit;                    //удар

    Hero(String name, int hp, int hit) {
        this.name = name;
        this.hp = hp;
        this.hit = hit;
    }

    /**
     * метод получения урона. К качестве параметра передается атакующий персонаж
     */
    void getDamageFromEnemy(Hero hero) {
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp() {
        return hp;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
    public int getHit() {
        return hit;
    }

}
