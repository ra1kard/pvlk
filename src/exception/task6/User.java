package exception.task6;

import java.util.ArrayList;

public class User {
    private final int id;
    private String fullName;
    private String phoneNumber;
    private ArrayList<Account> accountList;

    public User(int id, String fullName, String phoneNumber) {
        accountList = new ArrayList<>();
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public Account getAccountById(int id) {
        for (Account account : accountList) {
            if (account.getNumber() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "id: " + getId()
                + ",  fullName: " + getFullName()
                + ",  phoneNumber: " + getPhoneNumber();
    }

}
