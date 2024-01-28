package classes.task6;

public class Herbivore {        //травоядное животное
    private String name;
    private int kind;           //вид животного (1мал, 2сред, 3бол)
    private int satiety;   //сытость (100 - полностью сытая, 0 - смертельно голодная)

    Herbivore(String name, int kg, int satietyFrom0To100) {
        this.name = name;
        if (kg <= 0)
            System.out.println("Значение (кг) должно быть больше нуля");
        if (kg > 0 && kg <= 10)
            this.kind = 1;
        if (kg > 10 && kg <= 120)
            this.kind = 2;
        if (kg > 120)
            this.kind = 3;
        this.satiety = satietyFrom0To100;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getKind() {
        return kind;
    }
    public void setKind(int kg) {
        if (kg > 0 && kg <= 10) this.kind = 1;
        if (kg > 10 && kg <= 120) this.kind = 2;
        if (kg > 120) this.kind = 3;
    }

    public int getSatiety() {
        return satiety;
    }
    public void setSatiety(int satiety) {
        if (satiety >= 0 && satiety <= 100) {
            this.satiety = satiety;
        }
    }

    public void eat(Grass grass) {                          // животное начнет есть если:
        System.out.println("Смотрим будет ли есть " + Herbivore.this.getName() + ":");
        System.out.println(grass.getNutrition() + " nutrition питательность травы");
        System.out.println(Herbivore.this.getSatiety() + " satiety сытость животного");
        while (satiety < 50) {                              // 1)сыто < 50%
            if (grass.getNutrition() > 0) {                // 2)есть что есть
                System.out.print("Приступаю к еде! ");
                grass.setNutrition(grass.getNutrition()-10);
                this.satiety = this.satiety + 10;
                System.out.print(Herbivore.this.getSatiety() + " satiety сытость животного, ");
                System.out.println(grass.getNutrition() + " nutrition питательность травы");
            }
        }
        if (grass.getNutrition() <= 0) {
            System.out.println("Травы не осталось");
        }
        if (satiety >= 50) {
            System.out.println("Не хочет есть");
        }
        System.out.println();
    }

}
