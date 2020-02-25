package homework_4;

// Реализовать класс в конструкторе которого будет счетчик количества
//создаваемых объектов. Написать метод для получения информации о
//количестве.

public class ObjectCount {
    private static int count = 0;

    private ObjectCount() {
        count++;
    }

    public static void main(String[] args) {
        var oblect1 = new ObjectCount(); //Про вар знаешь?? можешь обьяснить?
        var oblect2 = new ObjectCount();
        var oblect3 = new ObjectCount();
        var oblect4 = new ObjectCount();
        var oblect5 = new ObjectCount();

        getCount();
    }

    private static void getCount() {
        System.out.println(ObjectCount.count);
    }


}
