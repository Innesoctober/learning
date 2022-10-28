public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
        for (double i = 1; i <= 10; i++) {
            System.out.printf("%f фунтов соответствует %f килограмм\n", i, i * 435 / 1000);
        }
    }
}
