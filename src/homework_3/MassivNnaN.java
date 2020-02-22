package homework_3;

import java.util.Random;
import java.util.Scanner;

public class MassivNnaN {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число N");
        int N = scan.nextInt();
        int sum = 0;
        Integer[][] mass = new Integer[N][N];
        scan.close();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(10);
                if (i == j) {
                    sum += mass[i][j];
                }
//                if( mass[i][j] == mass[i][N - i - 1]) {
//                    sum += mass[i][j];
//                }
                System.out.print(mass[i][j] + "\t");

            }

            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            sum += mass[i][N - (i + 1)];
        }
        System.out.println("Сумма диагоналей равна = " + sum);

    }
}
