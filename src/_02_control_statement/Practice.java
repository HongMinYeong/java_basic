package _02_control_statement;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요 ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("덧셈 결과 : " + sum(num1,num2));
        System.out.println("뺄셈 결과 : " + subtract(num1,num2));
        System.out.println("나눈셈 결과: " + div(num1,num2));
        System.out.println("곱셈 결과: " + mul(num1,num2));

        Practice ol = new Practice();
        int r = sc.nextInt();
        System.out.println("반지름이" + r + "인 원의 넓이 : " + ol.surface(r));
        int a = sc.nextInt(); //가로
        int b = sc.nextInt(); // 세로
        double c = sc.nextInt(); //밑변
        double d = sc.nextInt(); //높이
        System.out.println("가로 " + a + ",세로 " + b +"인 직사각형의 넓이 : " + ol.surface(a,b));
        System.out.println("밑변 " + c + ",높이 " + d +"인 삼각형의 넓이 : " + ol.surface(c,d));
        sc.close();
    }
    public static double sum(int x,int y){
    return x+y;
    }

    public static double subtract(int x,int y){
        return x-y;
    }

    public static double div(double x,double y){
        return x/y;
    }

    public static double mul(int x,int y){
        return x*y;
    }

    public static double surface(double x){
        return x*x*Math.PI;
    }

    public static double surface(int x,int y){
        return x*y;
    }

    public static double surface(double x,double y){
        return x*y/2;
    }
}
