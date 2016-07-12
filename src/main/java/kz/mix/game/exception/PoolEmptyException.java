package kz.mix.game.exception;

public class PoolEmptyException extends RuntimeException {
    public PoolEmptyException() {
        super();
    }

    public PoolEmptyException(String message) {
        super(message);
    }

    public PoolEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public PoolEmptyException(Throwable cause) {
        super(cause);
    }

    protected PoolEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
