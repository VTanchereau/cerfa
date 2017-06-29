package modele;

/**
 * Created by VTanchereau on 29/06/2017.
 */
public class ModeleException extends Exception {

    public ModeleException(String message, Throwable cause) {
        super(message, cause);
    }

    public ModeleException(String message) {
        super(message);
    }
}
