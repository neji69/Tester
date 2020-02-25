package homework_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cash; //Как правильно эти переменные вынести
        int kursor; //Как правильно эти переменные вынести

        do {
            System.out.println("Select menu item: \n" + "1. Show menu\n" + "2. Put Cash\n" + "3. Select drink\n" + "0. EXIT\n");
            kursor = scanner.nextInt();
            switch (kursor) {
                case (1):
                    Vending.showMenu();
                    break;
                case (2):
                    System.out.println("Insert money:......");
                    if (scanner.hasNextInt()) {         //Почему выкидывает ошибку???
                        cash = scanner.nextInt();
                        Vending.putCashInMoneyBox(cash);
                    } else {
                        System.out.println("This is not money");
                    }
                    break;
                case (3):
                    Vending.showMenu();
                    System.out.println("Choose a drink number");
                    if (scanner.hasNextInt()) {         //Почему выкидывает ошибку???
                        kursor = scanner.nextInt();
                        Vending.selectDrink(kursor);
                    }
                    break;
                case (0):
                    break;
                default:
                    System.out.println("Incorrect input, repeat");
            }
        } while (kursor != 0);

    }
}