package garciamendes.github.maratonajava.javacore.oexcetion.exception;

public class LoginException extends Exception {
    public LoginException() {
        super("Login ou senha inválidos!");
    }

    public LoginException(String message) {
        super(message);
    }
}
