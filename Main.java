import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите число k");
        int k = sc.nextInt();
        int x0 = 1;
        int x1 = 1;
        int x2;
        int sum = 2;
        String fib = "1 1 ";
        if (k == 2 || k == 1) {
            System.out.println("k-ое число последовательности = 1");
        }
        for (int i = 3; i <= n; i++) {
            x2 = x0 + x1;
            x0 = x1;
            x1 = x2;
            fib = fib + x2 + " ";
            sum = sum + x2;
            if (i == k) {
                System.out.println("k-ое число последовательности = " + x2);
            }
        }
        System.out.println("последовательность фибоначчи = " + fib);
        System.out.println("сумма= " + sum);

    }
}
