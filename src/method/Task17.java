package method;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(isSimple(13) ? "Число простое (true)" : "Число не простое (false)");
        System.out.println(isSimple(10) ? "Число простое (true)" : "Число не простое (false)");
        System.out.println(isSimple(31) ? "Число простое (true)" : "Число не простое (false)");
        System.out.println(isSimple(2) ? "Число простое (true)" : "Число не простое (false)");
        System.out.println(isSimple(-13) ? "Число простое (true)" : "Число не простое (false)");
    }

    public static boolean isSimple(int value) {
        if (value < 0) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//Простое число - это натуральное число (>0), которое имеет не более двух различных делителей: 1 и само число.
