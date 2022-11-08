package Login;

public class Data {
    private final static String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "abcdefghijklmnopqrstuvwxyz_0123456789";


    private Data() {
    }

    public static boolean validate(
            String login,
            String password,
            String confirmPassword) {
        try {
            verification(login, password, confirmPassword);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    private static void verification(
            String login,
            String password,
            String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!validate(login)) {
            throw new WrongLoginException("Логин не подтвержден");
        }if (!validate(password)) {
            throw new WrongPasswordException("Пароль не верный");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    private static boolean validate(String s) {
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
