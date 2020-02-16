package homework_01.visokosniy;

import java.util.Scanner;

public class Visokosniy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите год");
        int a = scan.nextInt();
        scan.close();

        if (a % 150 == 0 || a % 4 == 0) {
            System.out.println("Ваш год високосный");
        } else {
            System.out.println("Ваш год  не високосный");
        }
    }
}