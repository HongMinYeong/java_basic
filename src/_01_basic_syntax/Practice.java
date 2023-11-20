package _01_basic_syntax;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = sc.next();
//        System.out.println("나이를 입력하세요");
//        int age = sc.nextInt();
//        System.out.println("안녕하세요 " + name+"님! " + "(" + age +"세)");
//        sc.close();
        // 조건문 실습 1
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요: ");
        int age =  sc.nextInt();
        //1~7까지 유아, 8~13 초등학생, 14~16 중학생, 17~19 고등학생, 20~이상이면 성인을 출력
        if(1<=age){
           if(age<=7){
               System.out.println("유아");
           }else if(age<=13){
               System.out.println("초등학생");
           }else if(age<=16){
               System.out.println("중학생");
           }else if(age<=19){
               System.out.println("고등학생");
           }else{
               System.out.println("성인");
           }
        }
    // 조건문 실습 2
        System.out.println("이름을 입력하세요: ");
        String name = sc.next();
        switch (name){
            case "성춘향":
                System.out.println("여자");
                break;
            case "홍길동":
                System.out.println("남자");
                break;
            default:
                System.out.println("모르겠어요");
                break;
        }

    //반복문 실습 1
        System.out.println("숫자를 입력하세요: ");
        int number = sc.nextInt();
        int i = 1;
        do{
            System.out.print(i + " ");
            i++;
        }while(i <= number);
        sc.close();

    }
}
