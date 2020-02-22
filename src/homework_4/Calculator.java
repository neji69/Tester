package homework_4;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double a = getDouble();
        char deystvie = getDeystvie();
        double b = getDouble();
        double result = calc(a, b, deystvie);
        System.out.println("Результат операции: " + result);
    }

    public static double getDouble() {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Ошибка при вводе числа.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    private static char getDeystvie() {

        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции.");
            scanner.next();
            operation = getDeystvie();
        }
        return operation;
    }

    private static double calc(double a, double b, char deystvie) {
        double result;
        switch (deystvie) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Операция не распознана. Повторите.");
                result = calc(a, b, getDeystvie());
        }
        return result;
    }
}
