package kz.mix.game.exception;

public class PackEmptyException extends RuntimeException {
    public PackEmptyException() {
        super();
    }

    public PackEmptyException(String message) {
        super(message);
    }

    public PackEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public PackEmptyException(Throwable cause) {
        super(cause);
    }

    protected PackEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
