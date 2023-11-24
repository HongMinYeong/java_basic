package _05_class._inheritance;

public class Car extends Vehicle{
    boolean convertible;
    public Car(String brand, String model, int year, boolean convertible) {
        super(brand, model, year);
        this.convertible = convertible;


    }

    void CarMethod(){
        System.out.println("주차했습니다.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "convertible=" + convertible +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
