package homework_3;

import java.util.Random;
import java.util.Scanner;

public class MassivNnaN {
    public static void main(String[] args) {

//        Random random = new Random();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите число N");
//        int N = scan.nextInt();
//        int sum = 0;
//        Integer[][] mass = new Integer[N][N];
//        scan.close();

        int[][] arr = initArray(5);
        printArr(arr);
        int sum = countDiag(arr);
        System.out.println(sum);



        // создание и заполнение
        // отрисовка
        // подсчет



//        // разделить заполнение массива и подсчет суммы диагональных элементов
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                mass[i][j] = random.nextInt(10);
//                if (i == j) {
//                    sum += mass[i][j];
//                    sum += mass[i][mass.length - 1 - i];
//                }
////                if( mass[i][j] == mass[i][N - i - 1]) {
////                    sum += mass[i][j];
////                }
//                System.out.print(mass[i][j] + "\t");
//
//            }
//
//            System.out.println();
//        }
//        // подсчет сыммы можно сделать в одном цикле
//        for (int i = 0; i < N; i++) {
//            sum += mass[i][N - (i + 1)];
//        }
//        System.out.println("Сумма диагоналей равна = " + sum);

    }

    private static int countDiag(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    sum += arr[i][arr.length - 1 - j];
                }
            }
        }
        return sum;
    }

    private static int[][] initArray(int size) {
        int arr[][] = new int[size][size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = r.nextInt(3);
            }
        }
        return arr;
    }

    private static void printArr(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
