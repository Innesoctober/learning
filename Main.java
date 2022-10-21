import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите второе число");
        int y = sc.nextInt();
        double x1 = Math.sqrt(x);
        if (x1 < y) {
            y = y * 5;
        }

        System.out.println("Первое число: " + x);
        System.out.println("Второе число: " + y);
    }
}
