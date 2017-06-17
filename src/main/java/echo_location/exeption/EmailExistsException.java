package echo_location.exeption;

public class EmailExistsException extends Exception {
    public EmailExistsException() {
        super("Incorrect Email");
    }

    public EmailExistsException(String msg) {
        super(msg);
    }
}
