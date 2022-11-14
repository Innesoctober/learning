import java.util.Random;
import java.util.Scanner;

/*Вывести сумму всех положительных элементов массива*/
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую длину массива");
        int length = scanner.nextInt();
        System.out.println("Введите " + length + " чисел");
        double[] array = scanArray(length);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Cумма всех неотрицательных элементов массива: " + sum);
    }
}

