package lesson13;

public class Task1 {
    public static boolean validate (String login, String password, String confirmPassword) {
       try {
           if (login == null || login.length() >= 20 || login.contains(" ")) {
               throw new WrongLoginException("Логин должен быть меньше 20 символов и не содержать пробелы");
           }

           if (password == null || password.length() >= 20 || password.contains(" ")) {
               throw new WrongPasswordException("Пароль должен быть меньше 20 символов и не содержать пробелы");
           }
           if (!password.matches(".*\\b.*")) {
               throw new WrongPasswordException("Пароль должен cодержать минимум одну цифру");
           }
           if (!password.equals(confirmPassword)) {
               throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
           }
           return true;
       } catch (WrongLoginException | WrongPasswordException e) {
           System.err.println("Ошибка: " + e.getMessage());
           return false;
       }
    }
}
