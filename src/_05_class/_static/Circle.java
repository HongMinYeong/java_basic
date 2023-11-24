package _05_class._static;

public class Circle {
    private final double radius;
    private static final double PI = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return PI * radius * radius;
    }

}
