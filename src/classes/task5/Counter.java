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
        this.count++;
    }

    public void increment(int number) {
        if (this.count + number <= maxCount) {
            this.count = this.count + number;
        }
    }

    public void decrement() {
        if (count > 0) {
            this.count--;
        }
    }

    public void decrement(int number) {
        if (this.count - number > 0) {
            this.count = this.count - number;
        }
    }

    public void nulling() {
        this.count = 0;
    }

}
