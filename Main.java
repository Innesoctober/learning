import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите двузначное число");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        if (x > 9 && x < 100) {
            int y = x % 10;
            System.out.println("вторая цифра " + y);
            int z = (x - y) / 10;
            System.out.println("первая цифра " + z);
            int Sum = y + z;
            System.out.println("Сумма цифр " + Sum);
            if (x < Sum) {
                System.out.println("Сумма цифр больше числа");
            } else {
                System.out.println("Сумма цифр меньше числа");
            }
        } else {
            System.out.println("Введено не двузначное число");
        }
    }
}
