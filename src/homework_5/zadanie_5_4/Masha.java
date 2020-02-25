package homework_5.zadanie_5_4;

public class Masha extends Women {
    @Override
    public void run() {
        System.out.println("Masha run very slow");
    }

    @Override
    public void runBack() {
        System.out.println("run back? Masha fell and broke her face");
    }

    @Override
    public void swim() {
        System.out.println("Masha swim DogiStyle , it's hard for her");
    }

    @Override
    public void swimBack() {
        System.out.println("Swim back??????? OOOhhhhhh NO! Masha drowned, nobody safe her");
    }
}
