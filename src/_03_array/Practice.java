package _03_array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] intArray = new int[5];
//        System.out.println("5개의 정수를 입력하세요");
//        int sum = 0;
//        for(int i = 0; i<intArray.length; i++){
//            intArray[i] = sc.nextInt();
//            sum += intArray[i];
//        }
//        double average = (double)sum/intArray.length;
//        System.out.println("평균은 "+ average );
//
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> strings = new ArrayList<>();
    String chat;
    do{
        System.out.println("문자를 입력해주세요. ");
         chat = sc.nextLine();
        strings.add(chat);
    }while(!chat.equals("exit"));

    for(String n:strings){
        System.out.println(n);

    }
}
}
