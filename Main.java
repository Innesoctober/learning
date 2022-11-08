import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите количество чисел");
        int n = scanner.nextInt();
        System.out.println("Ведите числа");
        double[] array = scanArray(n);

        System.out.println("Введите индекс числа для вычисления квадратного корня");
        int z = scanner.nextInt();
        if (isInArrayBounds(array.length, z)) {
            double x = sqrtOfElementArray(array, z);
            System.out.printf("Квадратный корень " + array[z] + " равен %f\n", x);
        }


        System.out.println("Введите индекс двух элеменитов для подсчета среднего арифметического");
        int v = scanner.nextInt();
        int s = scanner.nextInt();
        if (isInArrayBounds(array.length, v) && isInArrayBounds(array.length, s)) {
            double y = averageOfTwoElements(array, v, s);
            System.out.println("Среднее арифметическое чисел " + array[v] + " и " + array[s] + " равно " + y);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf(array[i] + " ");
        }
    }

    public static double sqrtOfElementArray(double[] array, int i) {
        double sqrt = Math.sqrt(array[i]);
        return sqrt;
    }

    public static double averageOfTwoElements(double[] array, int i, int k) {
        double average = (array[i] + array[k]) / 2;
        return average;
    }

    public static double[] scanArray(int n) {

        double[] array = new double[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }

        return array;
    }

    public static boolean isInArrayBounds(int length, int index) {
        if (index >= length || index < 0) {
            System.out.println("Индекса " + index + " не существует в массиве");
            return false;
        } else {
            return true;
        }
    }
}



