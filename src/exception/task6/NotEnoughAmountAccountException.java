package exception.task6;

public class NotEnoughAmountAccountException extends RuntimeException {

    NotEnoughAmountAccountException() {
        super();
    }

    NotEnoughAmountAccountException(String message) {
        super(message);
    }

}

