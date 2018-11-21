package kz.mix.game.exception;

public class PackStoreException extends RuntimeException {
    public PackStoreException() {
        super();
    }

    public PackStoreException(String message) {
        super(message);
    }

    public PackStoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public PackStoreException(Throwable cause) {
        super(cause);
    }

    protected PackStoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
