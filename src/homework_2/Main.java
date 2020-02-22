package homework_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Vending vending = new Vending();

        vending.showMenu();

        vending.choseDrink(2);
        vending.inputCash(10);
        vending.inputCash(75);

        Drink drink = vending.buy();
        System.out.println(drink);
    }
}