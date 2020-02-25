package homework_5.zadanie_5_2;

public class Duck extends Animal implements Swim, Fly, Run {
    String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("Duck FLY !");
    }

    @Override
    public void run() {
        System.out.println("Duck RUN !");
    }

    @Override
    public void swim() {
        System.out.println("Duck SWIM !");
    }
}

