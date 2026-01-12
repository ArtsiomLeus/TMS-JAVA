package lesson10;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Артем", "user@mail.ru", 123);
        User user2 = new User("Артем", "user@mail.ru", 123);
        User user3 = new User("Артем", "user@mail.ru", 123);
        User user4 = new User("Артем", "user@mail.ru", 124);

        User[] users = {user1, user2, user3, user3, user4};

        System.out.println("Проверка метода toString: ");
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println();
        System.out.println("Проверка метода equals: ");
        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.equals(user3): " + user1.equals(user3));
        System.out.println("user1.equals(user4): " + user1.equals(user4));
        System.out.println("user2.equals(user3): " + user2.equals(user3));
        System.out.println("user2.equals(user4): " + user2.equals(user4));
        System.out.println("user3.equals(user4): " + user3.equals(user4));

        System.out.println();
        System.out.println("Проверка метода hashCode: ");
        System.out.println("user1.hashCode(): " + user1.hashCode());
        System.out.println("user2.hashCode(): " + user2.hashCode());
        System.out.println("user3.hashCode(): " + user3.hashCode());
        System.out.println("user4.hashCode(): " + user4.hashCode());
    }
}
