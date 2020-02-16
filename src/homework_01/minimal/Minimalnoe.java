package homework_01.minimal;

import java.util.Scanner;

public class Minimalnoe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        scan.close();

        if (a == b) System.out.println("Число " + a + " и " + b + " равны!");
        else {
            if (a < b) System.out.println(b + " больше чем " + a);
            else System.out.println(a + " больше чем " + b);
        }
    }
}