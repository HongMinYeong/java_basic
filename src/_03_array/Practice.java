package _03_array;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[5];
        System.out.println("5개의 정수를 입력하세요");
        int sum = 0;
        for(int i = 0; i<intArray.length; i++){
            intArray[i] = sc.nextInt();
            sum += intArray[i];
        }
        double average = (double)sum/intArray.length;
        System.out.println("평균은 "+ average + "입니다.");

    }
}
