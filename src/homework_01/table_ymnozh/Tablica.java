package homework_01.table_ymnozh;

public class Tablica {

    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {

            System.out.println("Результаты умножения цифры " + "( " + i + " )");
            System.out.println("------");

                for (int j = 1; j < 10; j++) {
                    System.out.println(i + "*" + j + "=" + i * j + "|");
            }
            System.out.println("------");
        }
    }
}