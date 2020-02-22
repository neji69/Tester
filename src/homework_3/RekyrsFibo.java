package homework_3;

import java.util.Scanner;

public class RekyrsFibo {


    public static void main(String[] args) {
        int n = 0;
        System.out.println("Введите N члена фибоначи");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        fibonachi(1, 1, n);
        scanner.close();
    }

    static int fibonachi(int a, int b, int limit) {
        if (limit == 0) {
            return 0;
        }
        System.out.println(a);
        return fibonachi(b, a + b, limit - 1);
    }
}