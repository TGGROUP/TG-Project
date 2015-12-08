package ua.com.tggroup.applayer.rest.exception;

/**
 * Created by ihor on 08.12.2015.
 */
public class ApplicationLayerException extends RuntimeException {

    public ApplicationLayerException(String message, Throwable e) {
        super(message, e);
    }

    public ApplicationLayerException(String message) {
        super(message);
    }
}
