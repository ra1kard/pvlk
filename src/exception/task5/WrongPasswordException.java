package exception.task5;

public class WrongPasswordException extends RuntimeException {

    WrongPasswordException() {
        super();
    }

    WrongPasswordException(String message) {
        super(message);
    }

}
