package login_and_password;

public class Main {

    public static void main(String[] args) {
        try {
            boolean result = checkLoginAndPassword("admin", "123456", "123456");
            System.out.println(result);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException();
        }

        if (password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

        return true;
    }
}
