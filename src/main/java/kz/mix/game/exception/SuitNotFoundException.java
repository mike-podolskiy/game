package kz.mix.game.exception;

public class SuitNotFoundException extends RuntimeException {
    public SuitNotFoundException() {
        super();
    }

    public SuitNotFoundException(String message) {
        super(message);
    }

    public SuitNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SuitNotFoundException(Throwable cause) {
        super(cause);
    }

    protected SuitNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
