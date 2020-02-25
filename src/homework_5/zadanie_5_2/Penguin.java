package homework_5.zadanie_5_2;

public class Penguin extends Animal implements Swim , Run{
    String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Penguin RUN !");
    }

    @Override
    public void swim() {
        System.out.println("Penguin Swim !");
    }
}
