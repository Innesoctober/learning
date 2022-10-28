import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = sc.nextInt();
        int counter = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            int chet = lastDigit % 2;
            if (chet == 0) {
                counter++;
            }
            number = number / 10;
        }
        System.out.println("Количество четных цифр: " + counter);
    }
}


