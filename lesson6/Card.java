package lesson6;

public class Card {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("2222 2222 3333 3333", 7300);
        CreditCard card2 = new CreditCard("1111 1111 2222 2222", 4100);
        CreditCard card3 = new CreditCard("3333 3333 4444 4444", 2800);

        System.out.println("Начальный баланс на счетах:");
        card1.balace();
        card2.balace();
        card3.balace();

        System.out.println("Операции со счетами");
        card1.addMoney(2700);
        card2.addMoney(1200);
        card3.withdrawMoney(800);

        System.out.println("Текущее баланс на счетах");
        card1.balace();
        card2.balace();
        card3.balace();
    }
}
