/*
Дан массив.
 Поменять местами:
  1.второй и пятый элементы;
  2.третий и максимальный элементы.
   Если элементов с максимальным значением несколько,
   то в обмене должен участвовать первый из них.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void printArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println();
    }

    public static double[] scanArray(int n) {

        double[] array = new double[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }

        return array;
    }

    public static double[] generateArray(int n) {

        double[] array = new double[n];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextDouble() * 100;
        }

        return array;
    }

    public static double[] swapElementsOfArray(double[] array, int n, int m) {

        if ((n < 0) || (n >= array.length) || (m < 0) || (m >= array.length)) {
            return array;
        } else {
            double temp = array[n];
            array[n] = array[m];
            array[m] = temp;

            return array;
        }
    }

    public static double findMaxElementOfArray(double[] array) {

        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int findIndexOfMaxElementOfArray(double[] array) {

        int index = 0;

        double max = findMaxElementOfArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Введите элементы массива");
        double[] array = scanArray(length);
        System.out.println("Исходный массив");
        printArray(array);
        swapElementsOfArray(array, 2, 5);
        System.out.println("Поменяли 2 и 5 элементы местами");
        printArray(array);
        int maxIndex = findIndexOfMaxElementOfArray(array);
        System.out.println("Индекс максимального элемента массива: " + maxIndex);
        swapElementsOfArray(array, 3, maxIndex);
        System.out.println("Поменяли 3 и максимальный элементы местами");
        printArray(array);
    }
}
