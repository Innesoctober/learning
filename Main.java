import java.util.Random;
import java.util.Scanner;
/*Вывести элементы массива на экран в обратном порядке.*/

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

    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double[] array = generateArray(length);
        printArray(array);
        double arrayNew[] = new double[length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = (length - 1) - i;
            arrayNew[newIndex] = array[i];
        }
        printArray(arrayNew);
    }
}
