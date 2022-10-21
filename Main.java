import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите три вещественных числа");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a < b && b < c) {
            System.out.printf("неравенство %.2f<%.2f<%.2f выполняется", a, b, c);
        } else {
            System.out.printf("неравенство %.2f<%.2f<%.2f НЕ выполняется", a, b, c);
        }
        if (b > a && a > c) {
            System.out.printf("неравенство %.2f>%.2f>%.2f выполняется", b, a, c);
        } else {
            System.out.printf("неравенство %.2f>%.2f>%.2f НЕ выполняется", b, a, c);
        }
    }
}
