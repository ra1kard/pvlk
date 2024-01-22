package classes.examples2;

public class CardAcs {
    //поля
    private String name;
    private String department;
    private int levelAccess;
    private int numberCards;
    private int phone;

    /**department геттер сеттер**/
    public String getName() {
        return name;
    }
    public String setName(boolean name) {
        return "name";
    }

    /**department геттер сеттер**/
    public String getDepartment() {
        return department;
    }
    public String setDepartment(boolean department) {
        return "name";
    }

    /**levelAccess геттер сеттер**/
    public int getLevelAccess() {
        return levelAccess;
    }
    public void setLevelAccess(int number) {
        this.levelAccess = number;
    }

    /**numberCards геттер сеттер**/
    public int getNumberCards() {
        return levelAccess;
    }
    public void setNumberCards(int number) {
        this.levelAccess = number;
    }

    /**phone геттер сеттер**/
    public int getPhone() {
        return levelAccess;
    }
    public void setPhone(int number) {
        this.levelAccess = number;
    }

    //конструкторы
    CardAcs(String name, String department, int levelAccess, int numberCards) {

    }

    CardAcs(String name, String department, int levelAccess, int numberCards, int phone) {

    }

    //методы
    boolean openRoom() {
        return true;
    }

    boolean accessPrinter() {
        return true;
    }

    String entryTime() {
        return "yyyy-MM-dd'T'HH:mm:ss";
    }
}
