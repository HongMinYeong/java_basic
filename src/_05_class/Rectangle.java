package _05_class;

import _05_class._access_modifier._pack05.Singleton;

public class Rectangle {

    private int width;
    private int height;



    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if(width == 0){
            space();
        }else{
            this.width = width;
        }
    }

    public void setHeight(int height) {

            this.height = height;

    }

    public Rectangle(int width) {
            this.width = width;

    }

    public void space(){
        System.out.println("가로 길이는: " + this.width);
        System.out.println("세로 길이는: " + this.height);
        System.out.println("넓이는 : "+ this.width * this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
