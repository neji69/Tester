package homework_2;

import java.util.Arrays;
import java.util.List;

public class Vending {

    private List<Drink> drinks;
    private int deposit = 0;
    private Drink chosenDrink = null;

    Vending() {
        drinks = Arrays.asList(
                new Drink("Sprite", 65),
                new Drink("Pepsi", 65),
                new Drink("Mirinda", 65),
                new Drink("Limonad", 35),
                new Drink("BonAqva", 50)
        );
    }

    public void inputCash(int cash) {
        deposit += cash;
    }

    public void showMenu() {
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(" - " + i + ": " + drinks.get(i));
        }
    }

    public void choseDrink(int n) {
        if (n >= drinks.size() || n < 0) {
            System.out.println("Incorrect drink number!");
        } else {
            chosenDrink = drinks.get(n);
        }
    }

    public Drink buy() {

        if (chosenDrink == null) {
            System.out.println("No drink chosen!");
            return null;
        }

        if (deposit == 0) {
            System.out.println("No money!");
            return null;
        }

        if (deposit < chosenDrink.getPrice()) {
            System.out.println("Insufficient money!");
            return null;
        }

        return chosenDrink;
    }






























//    private int balance;
//    public int kursor;
//
//    // инициализировать список напитков в конструкторе
//
//    // подгрузка списка пользователем
//    public void showMenu(Drink spisok[]) {
//        System.out.println("*МЕНЮ*");
//        for (int i = 0; i < spisok.length; i++) {
//            if (i == 0) {
//                System.out.println("--------------------------------------------");
//            }
//            System.out.println("ID:" + spisok[i].getId() + " Название: " + spisok[i].getName() + " Цена: " + spisok[i].getPrice() + " руб.");
//
//        }
//    }
//
//    public void pokypkaNapitka(int nomer, Drink[] spisok) {
//        // убрать использование switch
//        switch (nomer) {
//            case 100:
//                if (balance >= spisok[0].getPrice()) {
//                    System.out.println("Вы успешно купили :" + spisok[0].getName() + " осталось на балансе: " + (balance -= spisok[0].getPrice()));
//                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[0].getPrice() - balance));
//                break;
//            case 101:
//                if (balance >= spisok[1].getPrice()) {
//                    System.out.println("Вы успешно купили :" + spisok[1].getName() + " осталось на балансе: " + (balance -= spisok[1].getPrice()));
//                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[1].getPrice() - balance));
//                break;
//            case 102:
//                if (balance >= spisok[2].getPrice()) {
//                    System.out.println("Вы успешно купили :" + spisok[2].getName() + " осталось на балансе: " + (balance -= spisok[2].getPrice()));
//                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[2].getPrice() - balance));
//                break;
//            case 150:
//                if (balance >= spisok[3].getPrice()) {
//                    System.out.println("Вы успешно купили :" + spisok[3].getName() + " осталось на балансе: " + (balance -= spisok[3].getPrice()));
//                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[3].getPrice() - balance));
//                break;
//            case 111:
//                if (balance >= spisok[4].getPrice()) {
//                    System.out.println("Вы успешно купили :" + spisok[4].getName() + " осталось на балансе: " + (balance -= spisok[4].getPrice()));
//                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[4].getPrice() - balance));
//                break;
//            default:
//                System.out.println("Некоректный выбор");
//                break;
//
//        }
//    }
//
//    public void setBalance(int vznos) {
//
//        if (vznos < 0) System.out.println("Нельзя внести отрицательную сумму!");
//        else this.balance += vznos;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
}

