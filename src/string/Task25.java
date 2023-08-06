package string;

public class Task25 {
    public static void main(String[] args) {
        String str = "Какой хороший день";
        //String str = "привет мир";
        //String str = "Завтра будет день теплее чем был сегодня";
        String longest = "";
        String shortest = "";
        String longCompare = "";
        String shortCompare = "";
        String tempWord = "";
        String answer = "";
        char[] chArray = str.toCharArray();

        //найдем самое длинное слово (если слов несколько - первое)
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != 32 && i == chArray.length - 1) {          //если символ посл и пробела больше не будет
                longCompare += chArray[i];
                longest = longCompare.length() > longest.length() ? longCompare : longest;
            } else if (chArray[i] != 32) {                              //если не пробел продолжаем добавлять в строку
                longCompare += chArray[i];
            } else {                                                    //если пробел делаем подытог
                longest = longCompare.length() > longest.length() ? longCompare : longest;
                longCompare = "";
            }
        }

        //найдем самое короткое слово (если слов несколько - последнее)
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != 32 && i == chArray.length - 1) {          //если символ посл и пробела больше не будет
                shortCompare += chArray[i];
                shortest = shortCompare.length() <= shortest.length() ? shortCompare : shortest;
            } else if (chArray[i] != 32) {                              //если не пробел продолжаем добавлять в строку
                shortCompare += chArray[i];
            } else if (shortest.equals("")) {                           //если это первое слово, считаем его наименьшим
                shortest = shortCompare;
                shortCompare = "";
            } else {                                                    //если пробел делаем подытог
                shortest = shortCompare.length() <= shortest.length() ? shortCompare : shortest;
                shortCompare = "";
            }
        }

        //поменяем местами - добавляем слово после проверки на short long
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != 32 && i == chArray.length - 1) {          //если символ не пробел и последний, дел подытог
                tempWord += chArray[i];
                if (tempWord.equals(shortest)) {
                    answer += longest + " ";
                } else if (tempWord.equals(longest)) {
                    answer += shortest + " ";
                } else {
                    answer += tempWord;
                }
            } else if (chArray[i] != 32) {                              //если не пробел продолжаем добавлять в temp
                tempWord += chArray[i];
            } else {                                                    //если пробел делаем подытог
                if (tempWord.equals(shortest)) {
                    answer += longest + " ";
                } else if (tempWord.equals(longest)) {
                    answer += shortest + " ";
                } else {
                    answer += tempWord + " ";
                }
                tempWord = "";
            }
        }

        System.out.println(String.valueOf(chArray));
        System.out.println(longest + " " + longest.length());
        System.out.println(shortest + " " + shortest.length());
        System.out.println(answer);
    }
}

//вложенность if это плохо, знаю, но через тернарный не получилось, оставил так, как еще пока не понял
