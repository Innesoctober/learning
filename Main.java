/* Даны радиус круга и сторона квадрата. У какой фигуры площадь больше? */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Введите радиус круга:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите сторону квадрата:");
        int y = sc.nextInt();
        System.out.println("радиус круга: " + x);
        System.out.println("сторона квадрата: " + y);
        double Pi = Math.PI;
        double circleArea = Pi * Math.pow(x, 2);
        System.out.println("Площадь круга= " + circleArea);
        double sqArea = Math.pow(y, 2);
        System.out.println("Площадь квадрата= " + sqArea);
        if (circleArea > sqArea) {
            System.out.println("Площадь круга больше");
        } else {
            if (circleArea < sqArea) {
                System.out.println("Площадь квадрата больше");
            } else {
                System.out.println("Площади равны");
            }
        }

    }
}
