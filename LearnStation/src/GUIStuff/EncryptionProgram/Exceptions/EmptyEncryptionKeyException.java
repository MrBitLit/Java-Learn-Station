package GUIStuff.EncryptionProgram.Exceptions;


/**
 *
 * @author besic
 */
public class EmptyEncryptionKeyException extends Exception {
    public EmptyEncryptionKeyException() {
        super("Error: Use of a null or empty encryption key!");
    }

    public EmptyEncryptionKeyException(String message) {
        super(message);
    }
}
