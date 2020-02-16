package homework_01.progressii;

import java.math.BigInteger;
import java.util.Scanner;

public class Progressiya {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int exit = 100;
        do {
            System.out.println("Какую прогрессию вы хотите найти ? 1 - арифметическая, 2 - геометрическая. 0 - EXIT");
            int variant = scan.nextInt();

            if (variant == 0) exit = 0;
            else {
                System.out.println("Введите число");
                int a = scan.nextInt();
                System.out.println("Укажите шаг прогрессии");
                int q = scan.nextInt();
                System.out.println("до какого члена нужно расчитать прогрессию?");
                int n = scan.nextInt();


                switch (variant) {
                    case 1:
                        arifmeticprogres(a, q, n);
                        break;

                    case 2:
                        geometricprogres(a, q, n);
                        break;
                }
            }

        } while (exit != 0);
        scan.close();
    }


    private static void arifmeticprogres(int a, int q, int n) {

        for (int i = 0; i < n; i++) {
            a = a + q;
            System.out.println(i + 1 + ") " + a);
        }
    }

    private static void geometricprogres(int a, int q, int n) {

        for (int i = 0; i < n; i++) {
            a = a * q;
            System.out.println(i + 1 + ") " + a);
        }

    }


}