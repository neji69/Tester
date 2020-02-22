package homework_3;

import java.util.Scanner;

public class RekyrsFibo {


    public static void main(String[] args) {
        int n = 0;
        System.out.println("Введите N члена фибоначи");
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
        fibonachi(1, 1, 10);
//        scanner.close();
        fibo(10);
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    // можно обойтись одним аргументом
    static int fibonachi(int a, int b, int limit) {
        if (limit == 0) {
            return 0;
        }
        System.out.println(a);
        return fibonachi(b, a + b, limit - 1);
    }
}