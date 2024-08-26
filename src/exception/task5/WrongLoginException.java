package exception.task5;

public class WrongLoginException extends RuntimeException {

    WrongLoginException() {
        super();
    }

    WrongLoginException(String message) {
        super(message);
    }

}
