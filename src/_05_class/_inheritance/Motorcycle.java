package _05_class._inheritance;

public class Motorcycle extends Vehicle{
    String licenseType;
    public Motorcycle(String brand, String model, int year, String licenseType) {
        super(brand, model, year);
        this.licenseType = licenseType;


    }
    void MotorcycleMethod(){
        System.out.println("울림통을 합니다.");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "licenseType='" + licenseType + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
