package homework_5.zadanie_5_2;

public class Cat extends Animal implements Swim, Run {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Cat RUN !");
    }

    @Override
    public void swim() {
        System.out.println("Cat Swim !");
    }
}


