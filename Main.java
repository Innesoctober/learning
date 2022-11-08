/*
Дан массив.
Определить:
 1.максимальный элемент
 2.минимальный элемент
 3.насколько максимальный элемент больше минимального
 4.индекс максимального элемента
 5.индекс минимального элемента
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
                // break;
            }
        }

        return index;
    }

    public static double findMinElementOfArray(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double getDifference(double max, double min) {
        return max - min;
    }

    public static int findIndexOfMinElementOfArray(double[] array) {

        int index = 0;

        double min = findMinElementOfArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                index = i;
                // break;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        System.out.println("Введите длину массива");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double[] array = generateArray(length);
        printArray(array);


        double max = findMaxElementOfArray(array);
        double min = findMinElementOfArray(array);
        double difference = getDifference(max, min);
        int minIndex = findIndexOfMinElementOfArray(array);
        int maxIndex = findIndexOfMaxElementOfArray(array);
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);
        System.out.println("Разница между максимальным и минимальным элементами " + difference);
        System.out.println("Индекс максимального элемента " + maxIndex);
        System.out.println("Индекс минимального элемента " + minIndex);
    }
}

