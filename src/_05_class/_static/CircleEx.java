package _05_class._static;

import java.util.Scanner;

public class CircleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        double radius = sc.nextDouble();
        System.out.println("원의 반지름 : " + radius);
        Circle circle = new Circle(radius);

        System.out.println("원의 넓이: " + circle.calculateArea());
    }
}
