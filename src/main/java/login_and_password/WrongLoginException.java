package login_and_password;

public class WrongLoginException extends Exception {
public WrongLoginException() {
        super("Некорректный логин");
        }

public WrongLoginException(String message) {
        super(message);
        }
        }

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Некорректный пароль");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

