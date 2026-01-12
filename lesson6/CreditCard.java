package lesson6;

import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private int currentAmount;

    public CreditCard(String accountNumber, int initialAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = initialAmount;
    }

    public void addMoney(int amount) {
        if (amount > 0) {
            currentAmount += amount;
            System.out.println("На счет " + accountNumber + " зачислено: " + amount + " руб.");
        } else {
            System.out.println("Добавляемая сумма должна быть положительной");
        }
    }

    public void withdrawMoney(int amount) {
        if (amount > 0) {
            if (amount <= currentAmount) {
                currentAmount -= amount;
                System.out.println("Со счета " + accountNumber + " снято: " + amount + " руб.");
            } else {
                System.out.println("Неостаточно средств " + accountNumber +
                        "Достуно снять: " + currentAmount + " руб.");
            }
        } else {
            System.out.println("Сумма для снятия должна быть положительной");
        }
    }

    public  void balace() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущий баланс: " + currentAmount + " руб.");
        System.out.println();
    }
}
