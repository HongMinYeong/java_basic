package _05_class;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        ArrayList<Rectangle> rect = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (w == 0 && h == 0) {
                break;
            }
            Rectangle rectangle = new Rectangle(w);
            rectangle.setHeight(h);
            rect.add(rectangle);
        }

        for (Rectangle rectanglee : rect) {
            rectanglee.space();
            System.out.println("-------------------------");
        }
        System.out.println("Rectangle 인스턴스의 개수는: "+rect.size());


    }
}