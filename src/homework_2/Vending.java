package homework_2;

import java.util.Arrays;
import java.util.Scanner;


import static homework_2.DrinkEnum.*;

public class Vending {

    private static int balance = 0;


    public static void getBalance() {
        System.out.println("Баланс = " + balance);
    }

    public static void showMenu() {
        System.out.println("*MENU*");
        System.out.println(Arrays.toString(DrinkEnum.values()));
    }

    public static void putCashInMoneyBox(int cash) {
        if (cash < 0) {
            System.out.println("You cannot deposit a negative amount!");
        } else Vending.balance += cash;
        getBalance();
    }

    public static void selectDrink(int kursor) {

        if (SPRITE.ordinal() + 1 == kursor) {
            System.out.println("You select: " + SPRITE.getName() + " " + SPRITE.getPrice() + " RUB");
            buyDrink(SPRITE);
        } else {
            if (PEPSI.ordinal() + 1 == kursor) {
                System.out.println("You select: " + PEPSI.getName() + " " + PEPSI.getPrice() + " RUB");
                buyDrink(PEPSI);
            } else {
                if (MIRINDA.ordinal() + 1 == kursor) {
                    System.out.println("You select: " + MIRINDA.getName() + " " + MIRINDA.getPrice() + " RUB");
                    buyDrink(MIRINDA);
                } else {
                    if (LEMONADE.ordinal() + 1 == kursor) {
                        System.out.println("You select: " + LEMONADE.getName() + " " + LEMONADE.getPrice() + " RUB");
                        buyDrink(LEMONADE);
                    } else {
                        if (WATER.ordinal() + 1 == kursor) {
                            System.out.println("You select: " + WATER.getName() + " " + WATER.getPrice() + " RUB");
                            buyDrink(WATER);
                        } else System.out.println("You Stupid MEN!!! Choise Number 1 - 5");
                    }
                }
            }
        }
    }


    private static void buyDrink(DrinkEnum drink) {
        Scanner scanner = new Scanner(System.in);
        int ansver;

        do {
            System.out.println("You have buy this drink? 1 - yes, 0 - no");
            ansver = scanner.nextInt();
            if (ansver == 1) {
                if (balance == 0) {
                    System.out.println("No money!");
                    return;
                }

                if (balance < drink.getPrice()) {
                    System.out.println("Insufficient money!");
                    return;
                }
                if (balance >= drink.getPrice()) {
                    balance -= drink.getPrice();
                    System.out.println("You buy " + drink.getName() + " balance = " + balance);

                }
            }
        } while (ansver != 0);


    }

}
