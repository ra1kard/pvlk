package classes.task5;

public class Start {

    public static void main(String[] args) {
        Counter page = new Counter();
        System.out.println(page.getCount());
        page.increment();
        page.increment();
        page.increment();
        System.out.println(page.getCount());
        page.decrement();
        System.out.println(page.getCount());
        System.out.println();

        Counter bottle = new Counter(10);
        System.out.println(bottle.getCount());
        bottle.increment(8);
        bottle.increment(8);
        System.out.println(bottle.getCount());
        bottle.decrement(5);
        System.out.println(bottle.getCount());
        bottle.nulling();
        System.out.println(bottle.getCount());
    }

}
