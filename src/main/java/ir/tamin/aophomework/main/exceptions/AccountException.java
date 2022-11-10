package ir.tamin.aophomework.main.exceptions;

public class AccountException extends RuntimeException{
    public AccountException() {
        super();
    }

    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountException(Throwable cause) {
        super(cause);
    }


}
