import java.util.Scanner;

public class Main {
    public static double Premia(int x) {
        if (x < 40000)
            return (x / 50);

        if ((x >= 40000) || (x <= 80000))
            return (x / 100 * 70);

        if (x >= 80000)
            return (x / 100 * 110);
        else
            return 0;
    }


    public static void main(String[] args) {
        System.out.println("Зарплата: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Premia(x));
    }
}
