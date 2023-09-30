package string;

import java.util.Scanner;

public class Task42_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int indexSymbol;
        int indexLeft = 0;
        int indexRight = 0;
        String strLeft = "";
        String strRight = "";
        int count = 0;
        int rsl = 0;

        /**
         * удалим пробелы
         */
        str = str.replace(" ", "");
        System.out.println(str + " - вывод без пробелов");

        /**
         * определяем есть ли в строке степень и считаем рез-т
         */
        while (str.contains("**")) {
            indexSymbol = str.indexOf("**");   //определим номер символа в строке
            System.out.println("найдем indexSymbol '**' = " + indexSymbol);

            //найдем левое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol-1-count >= 0
                    && str.charAt(indexSymbol-1-count) >= '0'
                    && str.charAt(indexSymbol-1-count) <= '9') {
                strLeft = str.charAt(indexSymbol-1-count) + strLeft;
                indexLeft = indexSymbol-1-count;
                count++;
            }
            count = 0;

            //найдем правое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol+2+count <= str.length()-1
                    && str.charAt(indexSymbol+2+count) >= '0'
                    && str.charAt(indexSymbol+2+count) <= '9') {
                strRight += str.charAt(indexSymbol+2+count);
                indexRight = indexSymbol+2+count;
                count++;
            }
            for (int i = 0; i < Integer.parseInt(strRight); i++) {
                if (rsl == 0) {
                    rsl = Integer.parseInt(strLeft);
                } else {
                    rsl *= Integer.parseInt(strLeft);
                }
            }
            count = 0;
            strLeft = "";
            strRight = "";

            //итоговую строку перепишем с учетом возведения в степень
            str = (str.substring(0, indexLeft)) + rsl + str.substring(indexRight+1);
            System.out.println(str + " - итог после возведения в степень");
        }

        /**
         * определяем есть ли в строке умножение и считаем рез-т
         */
        while (str.contains("*")) {
            indexSymbol = str.indexOf("*");   //определим номер символа в строке
            System.out.println("найдем indexSymbol '*' = " + indexSymbol);

            //найдем левое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol-1-count >= 0
                    && str.charAt(indexSymbol-1-count) >= '0'
                    && str.charAt(indexSymbol-1-count) <= '9') {
                strLeft = str.charAt(indexSymbol-1-count) + strLeft;
                indexLeft = indexSymbol-1-count;
                count++;
            }
            count = 0;

            //найдем правое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol+1+count <= str.length()-1
                    && str.charAt(indexSymbol+1+count) >= '0'
                    && str.charAt(indexSymbol+1+count) <= '9') {
                strRight += str.charAt(indexSymbol+1+count);
                indexRight = indexSymbol+1+count;
                count++;
            }
            rsl = Integer.parseInt(strLeft) * Integer.parseInt(strRight);
            count = 0;
            strLeft = "";
            strRight = "";

            //итоговую строку перепишем с учетом умножения
            str = (str.substring(0, indexLeft)) + rsl + str.substring(indexRight+1);
            System.out.println(str + " - итог после умножения");
        }

        /**
         * определяем есть ли в строке деление и считаем рез-т
         */
        while (str.contains("/")) {
            indexSymbol = str.indexOf("/");   //определим номер символа в строке
            System.out.println("найдем indexSymbol '/' = " + indexSymbol);

            //найдем левое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol-1-count >= 0
                    && str.charAt(indexSymbol-1-count) >= '0'
                    && str.charAt(indexSymbol-1-count) <= '9') {
                strLeft = str.charAt(indexSymbol-1-count) + strLeft;
                indexLeft = indexSymbol-1-count;
                count++;
            }
            count = 0;

            //найдем правое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol+1+count <= str.length()-1
                    && str.charAt(indexSymbol+1+count) >= '0'
                    && str.charAt(indexSymbol+1+count) <= '9') {
                strRight += str.charAt(indexSymbol+1+count);
                indexRight = indexSymbol+1+count;
                count++;
            }
            rsl = Integer.parseInt(strLeft) / Integer.parseInt(strRight);
            count = 0;
            strLeft = "";
            strRight = "";

            //итоговую строку перепишем с учетом деления
            str = (str.substring(0, indexLeft)) + rsl + str.substring(indexRight+1);
            System.out.println(str + " - итог после деления");
        }

        /**
         * определяем есть ли в строке сумма и считаем рез-т
         */
        while (str.contains("+")) {
            indexSymbol = str.indexOf("+");   //определим номер символа в строке
            System.out.println("найдем indexSymbol '+' = " + indexSymbol);

            //найдем левое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol-1-count >= 0
                    && str.charAt(indexSymbol-1-count) >= '0'
                    && str.charAt(indexSymbol-1-count) <= '9') {
                strLeft = str.charAt(indexSymbol-1-count) + strLeft;
                indexLeft = indexSymbol-1-count;
                count++;
            }
            count = 0;

            //найдем правое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol+1+count <= str.length()-1
                    && str.charAt(indexSymbol+1+count) >= '0'
                    && str.charAt(indexSymbol+1+count) <= '9') {
                strRight += str.charAt(indexSymbol+1+count);
                indexRight = indexSymbol+1+count;
                count++;
            }
            rsl = Integer.parseInt(strLeft) + Integer.parseInt(strRight);
            count = 0;
            strLeft = "";
            strRight = "";

            //итоговую строку перепишем с учетом сложения
            str = (str.substring(0, indexLeft)) + rsl + str.substring(indexRight+1);
            System.out.println(str + " - итог после сложения");
        }

        /**
         * определяем есть ли в строке вычитание и считаем рез-т
         */
        while (str.contains("-")) {        // реализовать возможность 3-5, -3-5
            indexSymbol = str.indexOf("-");   //определим номер символа в строке
            System.out.println("найдем indexSymbol '-' = " + indexSymbol);

            //найдем левое число полностью (оно мб как "1", так и "23")
            while (indexSymbol-1-count >= 0
                    && str.charAt(indexSymbol-1-count) >= '0'
                    && str.charAt(indexSymbol-1-count) <= '9') {
                strLeft = str.charAt(indexSymbol-1-count) + strLeft;
                indexLeft = indexSymbol-1-count;
                count++;
            }
            count = 0;

            //найдем правое число полностью (оно мб как "1", так и "23", так и "456")
            while (indexSymbol+1+count <= str.length()-1
                    && str.charAt(indexSymbol+1+count) >= '0'
                    && str.charAt(indexSymbol+1+count) <= '9') {
                strRight += str.charAt(indexSymbol+1+count);
                indexRight = indexSymbol+1+count;
                count++;
            }
            rsl = Integer.parseInt(strLeft) - Integer.parseInt(strRight);
            count = 0;
            strLeft = "";
            strRight = "";

            //итоговую строку перепишем с учетом вычитания
            str = (str.substring(0, indexLeft)) + rsl + str.substring(indexRight+1);
            System.out.println(str + " - итог после вычитания");
        }
    }
}
// реализовать возможность -3-5 (потом используя коллекции будет проще
