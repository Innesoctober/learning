public class Main {
    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static int min(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }


    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
        System.out.println(min(10, 15, 5, 14));
    }
}
