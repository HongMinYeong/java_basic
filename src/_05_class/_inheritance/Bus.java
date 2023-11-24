package _05_class._inheritance;

public class Bus extends Vehicle{
    int passengerCapacity;
    public Bus(String brand, String model, int year,  int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }
    void BusMethod(){
        System.out.println("승객을 운송합니다.");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCapacity=" + passengerCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
