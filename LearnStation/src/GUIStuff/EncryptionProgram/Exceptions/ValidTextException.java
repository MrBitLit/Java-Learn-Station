package GUIStuff.EncryptionProgram.Exceptions;

/**
 *
 * @author besic
 */
public class ValidTextException extends Exception {

    public ValidTextException() {
        super("Error: Please write a valid text to encrypt!");
    }

    public ValidTextException(String message) {
        super(message);
    }
}
