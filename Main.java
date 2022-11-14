import java.util.Random;
import java.util.Scanner;

/*Определить:
1. сумму всех элементов массива;
 2. произведение всех элементов массива;
  3. сумму квадратов всех элементов массива;
  4. сумму шести первых элементов массива*/
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
        printArray(array);
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        double[] array = generateArray(length);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double mul = 1;
        for (int i = 0; i < array.length; i++) {
            mul = mul * array[i];
        }
        double sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 = sum2 + Math.pow(array[i], 2);
        }
        double sum3 = 0;
        for (int i = 0; i < 6; i++) {
            sum3 = sum3 + array[i];
        }

        System.out.println("Сумма всех элементов массива равна " + sum);
        System.out.println("Произведение всех элементов массива равна " + mul);
        System.out.println("Сумма квадратов всех элементов массива равна " + sum2);
        System.out.println("Сумма первых шести элементов массива равна " + sum3);
    }
}