import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        int sum = 0;
        for (int z = a; z <= b; z++) {
            sum = sum + z;
            System.out.println(sum);
        }
    }
}
