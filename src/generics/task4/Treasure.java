package generics.task4;

public abstract class Treasure {    //сокровище - абстрактный родительский класс для бриллиантов и золота
    int quantity;                   //кол-во единиц, например кол-во золотых или кол-во бриллиантов

     Treasure(int quantity) {
         this.quantity = quantity;
     }

    public int getQuantity() {
        return quantity;
    }

    abstract int getPrice();

    abstract int getSumMoney();

}
