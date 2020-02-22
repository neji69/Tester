package homework_4;

import java.util.Scanner;

public class Cenzura {

    public static void main(String[] args) {

        System.out.println("Введите текст, а цензура сделает свое дело!");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.replace("бяка", "«вырезано цензурой»"));

    }
}
