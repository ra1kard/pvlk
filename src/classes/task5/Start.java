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
        System.out.println();

        Counter ss = new Counter(-2);
        System.out.println(ss.getCount());
        System.out.println();

        Counter rr = new Counter();
        rr.increment(10);
        System.out.println(rr.getCount());
        rr.increment();
        System.out.println(rr.getCount());
        System.out.println();

        Counter qq = new Counter(2);
        qq.increment();
        qq.increment();
        qq.increment();
        //System.out.println(qq.getCount());

        Counter tt = new Counter(15);
        tt.increment(20);
        System.out.println(tt.getCount());

        tt.increment(14);
        System.out.println(tt.getCount());
        System.out.println();

        Counter xx = new Counter(5);
        System.out.println(xx.getCount());
        xx.increment();
        System.out.println(xx.getCount());
        xx.decrement(5);
        System.out.println(xx.getCount());
    }

}
