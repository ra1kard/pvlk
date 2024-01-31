package classes.task5;

public class Counter {
    private int count = 0;
    private int maxCount = 0;

    Counter() {
    }

    Counter(int maxCount) {
        if (this.count <= maxCount) {
            this.maxCount = maxCount;
        } else {
            System.out.println("значение count не может превышать maxCount");
        }
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        increment(1);
    }

    public void increment(int number) {
        this.count = this.count + number;

        if (maxCount != 0 && this.count > maxCount) {
            this.count = maxCount;
        }
    }

    public void decrement() {
        decrement(1);
    }

    public void decrement(int number) {
        this.count = this.count - number;

        if (maxCount != 0 && this.count < 0) {
            this.count = 0;
        }
    }

    public void nulling() {
        this.count = 0;
    }

}
