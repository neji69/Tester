package homework_3;

import java.util.Arrays;

public class SortirPuzr {
    public static void main(String[] args) {
        int[] mas = {41, 12, 88, 3, -5};

        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}