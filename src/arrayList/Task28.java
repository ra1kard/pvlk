package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task28 {
    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        //String str = console.nextLine();
        //String str = "-2 + 10 / 5 + 2 * 1 - 4 + 5 ** 3";
        //String str = "10 + 25 * 2 + 3";
        String str = "8 / 2 + 2";
        //String str = "50 / 10 + 2 ** 2 + 6 * 6 - 30";
        String[] arrayStr = str.split(" ");
        ArrayList<String> list = new ArrayList<>(List.of(arrayStr));
        int indexSymbol;

        /**
         * определяем есть ли в строке степень и считаем рез-т
         */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("**")) {
                indexSymbol = i;
                System.out.println(list + " - найдем indexSymbol '**' = " + indexSymbol);

                //найдем левое и правое число число
                int numLeft = Integer.parseInt(list.get(indexSymbol-1));
                int numRight = Integer.parseInt(list.get(indexSymbol+1));

                int rsl = numLeft;
                for (int j = 0; j < numRight - 1; j++) {
                    rsl *= numLeft;
                }

                list.set(indexSymbol-1, String.valueOf(rsl));
                list.remove(indexSymbol);
                list.remove(indexSymbol);
                i--;
            }
        }

        /**
         * определяем есть ли в строке умножение и считаем рез-т
         */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("*")) {
                indexSymbol = i;
                System.out.println(list + " - найдем indexSymbol '*' = " + indexSymbol);

                //найдем левое и правое число число
                int numLeft = Integer.parseInt(list.get(indexSymbol-1));
                int numRight = Integer.parseInt(list.get(indexSymbol+1));
                int rsl = numLeft * numRight;

                list.set(indexSymbol-1, String.valueOf(rsl));
                list.remove(indexSymbol);
                list.remove(indexSymbol);
                i--;
            }
        }

        /**
         * определяем есть ли в строке деление и считаем рез-т
         */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("/")) {
                indexSymbol = i;
                System.out.println(list + " - найдем indexSymbol '/' = " + indexSymbol);

                //найдем левое и правое число число
                int numLeft = Integer.parseInt(list.get(indexSymbol-1));
                int numRight = Integer.parseInt(list.get(indexSymbol+1));
                int rsl = numLeft / numRight;

                list.set(indexSymbol-1, String.valueOf(rsl));
                list.remove(indexSymbol);
                list.remove(indexSymbol);
                i--;
            }
        }

        /**
         * определяем есть ли в строке сумма и считаем рез-т
         */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("+")) {
                indexSymbol = i;
                System.out.println(list + " - найдем indexSymbol '+' = " + indexSymbol);

                //найдем левое и правое число число
                int numLeft = Integer.parseInt(list.get(indexSymbol-1));
                int numRight = Integer.parseInt(list.get(indexSymbol+1));
                int rsl = numLeft + numRight;

                list.set(indexSymbol-1, String.valueOf(rsl));
                list.remove(indexSymbol);
                list.remove(indexSymbol);
                i--;
            }
        }

        /**
         * определяем есть ли в строке вычитание и считаем рез-т
         */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("-")) {
                indexSymbol = i;
                System.out.println(list + " - найдем indexSymbol '-' = " + indexSymbol);

                //найдем левое и правое число число
                int numLeft = Integer.parseInt(list.get(indexSymbol-1));
                int numRight = Integer.parseInt(list.get(indexSymbol+1));
                int rsl = numLeft - numRight;

                list.set(indexSymbol-1, String.valueOf(rsl));
                list.remove(indexSymbol);
                list.remove(indexSymbol);
                i--;
            }
        }

        System.out.println(list);
    }
}
