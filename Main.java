import java.util.Scanner;

public class Main {
    public static boolean chet(int x) {

        if (x % 2 == 0) {
            return (true);
        } else {
            return (false);
        }

    }

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(chet(x));
    }
}
