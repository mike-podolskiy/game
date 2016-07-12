package kz.mix.game.exception;

public class DenominationNotFoundException extends RuntimeException {
    public DenominationNotFoundException() {
        super();
    }

    public DenominationNotFoundException(String message) {
        super(message);
    }

    public DenominationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DenominationNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DenominationNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
