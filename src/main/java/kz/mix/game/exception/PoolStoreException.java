package kz.mix.game.exception;

public class PoolStoreException extends RuntimeException {
    public PoolStoreException() {
        super();
    }

    public PoolStoreException(String message) {
        super(message);
    }

    public PoolStoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public PoolStoreException(Throwable cause) {
        super(cause);
    }

    protected PoolStoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
