package _05_class._access_modifier._pack05._abstract;

// 구체적인 클래스 - 도형(원)
public class Circle extends Shape{
    int radius;
    public Circle(String color,String type) {
        super(color,type);
    }
    public void setr(int radius) {
        this.radius = radius;
    }
    // 추상 메소드는 오버라이딩해야함 -> draw
    void draw() {
        System.out.println("원을 그리는 중입니다....");
    }
    double calculateArea(){
        return radius * radius * Math.PI;
    }
}
