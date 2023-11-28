package _05_class._access_modifier._pack05._abstract;

import java.util.ArrayList;
import java.util.List;

public class ShapeEx {
    public static void main(String[] args) {
        Square square = new Square("yellow","square");
        Circle circle = new Circle("blue","circle");
        circle.setr(3);
        square.setHeight(5);
        square.setWidth(3);
        List<String> Circle = new ArrayList<>();
        Circle.add("=== "+circle.getType()+" 도형의 정보 ===");
        Circle.add("도형의 색상: " + circle.getColor());
        Circle.add("도형의 넓이: " + circle.calculateArea());
        List<String> Square = new ArrayList<>();
        Square.add("=== "+square.getType()+" 도형의 정보 ===");
        Square.add("도형의 색상: " + square.getColor());
        Square.add("도형의 넓이: " + square.calculateArea());

        for(String c:Circle){
            System.out.println(c + " ");
        }
        for(String s:Square){
            System.out.println(s + " ");
        }
    }

}
