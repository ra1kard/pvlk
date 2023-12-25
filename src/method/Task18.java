package method;

public class Task18 {
    public static void main(String[] args) {
        myMethod(34);
        myMethod(15);
        myMethod(17);
        myMethod(6851);
    }

    public static void myMethod(int value) {
        int count = 0;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print("Нет простых делителей");
        }
        System.out.println();
    }
}
