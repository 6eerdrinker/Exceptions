package Login;

public class LoginMain {
    public static void main(String[] args) {
        boolean success = Data.validate("6eerdrinker", "2021__bAm", "2021__bAm");
        if (success) {
            System.out.println("Данные подтверждены!");
        } else {
            System.out.println("Данные не подтверждены");
        }
    }
}
