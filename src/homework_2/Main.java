package homework_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int vznos = 0;

        Scanner scan = new Scanner(System.in);
        Vending aparat = new Vending();

        Napitok[] spisok = new Napitok[5];
        Napitok sprite = new Napitok(100, "Sprite", 65);
        Napitok pepsi = new Napitok(101, "Pepsi", 65);
        Napitok mirinda = new Napitok(102, "Mirinda", 65);
        Napitok garage = new Napitok(150, "Limonad", 35);
        Napitok bonAqva = new Napitok(111, "BonAqva", 50);
        spisok[0] = sprite;
        spisok[1] = pepsi;
        spisok[2] = mirinda;
        spisok[3] = garage;
        spisok[4] = bonAqva;

        System.out.println("Привет друг! В нашем автомате, ты можешь купить напиток!\n");

        do {

            System.out.println("*ОПЦИИ*\n" +
                    "1 - Пополнить баланс. Текущий баланс: " + aparat.getBalance() + "\n" +
                    "2 - Получить сдачу и выйти.");

            aparat.showMenu(spisok);
            System.out.println(
                    "*Выберите опцию или введите *ID* напитка, чтобы купить ....");

            aparat.kursor = scan.nextInt();

            if (aparat.kursor == 2) ;
            else {
                if (aparat.kursor == 1) {
                    System.out.println("Введите сумму пополнения...");
                    vznos = scan.nextInt();
                    aparat.setBalance(vznos);
                } else aparat.pokypkaNapitka(aparat.kursor, spisok);
            }
        } while (aparat.kursor != 2);
        System.out.println("К сожалению, автомат сдачи не выдает... Удачи!;)");
        scan.close();
    }
}