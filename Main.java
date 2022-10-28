public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double x = 1000;
        double percent = 0;
        int month = 3;
        while (percent <= 30) {
            percent = percent + 0.02 * x;
            x += percent;
            month++;
        }
        System.out.println("сумма процентов за " + month + " месяц " + " составила " + percent + " рублей");

        x = 1000;
        percent = 0;
        month = 3;

        while (x <= 1200) {
            percent += 0.02 * x;
            x += percent;
            month++;
        }
        System.out.println("размер вклада превысит 1200 рублей через  " + (month - 3) + " месяцев");
    }
}
