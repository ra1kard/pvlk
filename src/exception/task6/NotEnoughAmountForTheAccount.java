package exception.task6;

public class NotEnoughAmountForTheAccount extends Exception {

    NotEnoughAmountForTheAccount() {
        super();
    }

    NotEnoughAmountForTheAccount(String message) {
        super(message);
    }

}
