package homework_01.opis_chisel;

import java.util.Scanner;

public class OpisanieChisla {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число");
        int a = scan.nextInt();
        scan.close();
        String s;

        if (a >= 0) {
            s = "Ваше число положительное, ";
        } else {
            s = "Ваше число отрицательное, ";
        }

        if (a % 2 == 0) s += "четное.";
        else s += "не четное.";

        System.out.println(s);
    }


}