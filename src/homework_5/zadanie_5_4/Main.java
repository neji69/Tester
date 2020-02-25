package homework_5.zadanie_5_4;

//Написать абстрактный класс Человек реализующий интерфейсы «бежать» и
//        «плавать» (в каждом сделать 1-2 метода). Сделать несколько наследников этого
//        класса с конкретной реализацией методов, которые объявлены в интерфейсах.


public class Main {
    public static void main(String[] args) {


        People masha = new Masha(); //А здесь работают интерфейсы....
        People dima = new Dima();

        System.out.println("*DIMA*");
        dima.run();
        dima.runBack();
        dima.swim();
        dima.swimBack();

        System.out.println();

        System.out.println("*MASHA*");
        masha.run();
        masha.runBack();
        masha.swim();
        masha.swimBack();

    }
}
