package _05_class._access_modifier._pack05._abstract;

// 구체적인 클래스 - 도형(사각형)
public class Square extends Shape{
    int width;
    int height;
    public Square(String color,String type){
        super(color,type); //부모 생성자 호출
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // 추상 메소드는 오버라이딩해야함 -> draw
    void draw() {
        System.out.println("사각형을 그리는 중입니다....");
    }


    double calculateArea() {
        return width * height;
    }
}
