package homework_5.zadanie_5_2;

//Написать абстрактный класс Animal с абстрактным методом getName. Сделать
//        несколько классов животных, наследников Animal. Метод getName должен выводит
//        название каждого животного.
//        3. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
//        Добавить классам животных из предыдущего задания имплементацию этих
//        интерфейсов. Некоторые животные могут реализовать больше одного интерфейса
//        (утка может и плавать, и летать и бегать).

public class Main {
    public static void main(String[] args) {

        Penguin penguin = new Penguin("It's penguin"); // почему интерфейсы не видны из под Animal
        System.out.println(penguin.getName());
        penguin.swim();
        penguin.run();

        Duck duck = new Duck("It's duck");
        System.out.println(duck.getName());
        duck.swim();
        duck.run();
        duck.fly();

        Cat cat = new Cat("It's cat");
        System.out.println(cat.getName());
        cat.swim();
        cat.run();

    }
}
