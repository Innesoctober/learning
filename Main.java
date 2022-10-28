import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = sc.nextInt();
        int counter = 0;
        int lastDigitOrig = number % 10;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit == lastDigitOrig) {
                counter++;
            }
            number = number / 10;
        }
        System.out.println("Последнее число= " + lastDigitOrig);
        System.out.println("Последнее число встречается раз: " + counter);
    }
}
