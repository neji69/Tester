package homework_4;


//        Реализовать класс Calculator, который будет содержать статические методы
//        для операций вычитания, сложения, умножения, деления и взятия процента от
//        числа. Класс должен работать как с целыми числами, так и с дробями.

public class Calculator {
    public static void main(String[] args) {
        double a = 65.54;// обьясни про var java 10-11
        double b = 15.24;

        System.out.println(Calculator.minus(a, b));
        System.out.println(Calculator.plus(a, b));
        System.out.println(Calculator.delenie(a, b));
        System.out.println(Calculator.ymnozhenie(a, b));
        System.out.println(Calculator.procent(a, b));
    }

    private static double minus(double a, double b) {
        return a - b;
    }

    private static double plus(double a, double b) {
        return a + b;
    }

    private static double ymnozhenie(double a, double b) {
        return a * b;
    }

    private static double delenie(double a, double b) {
        return a / b;
    }

    private static double procent(double a, double b) {
        return b * (a / 100);
    }
}
