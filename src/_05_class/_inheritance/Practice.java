package _05_class._inheritance;

public class Practice {
    public static void main(String[] args) {
        Bus bus = new Bus("Hyundai","City Bus",2022,30);
        Car car = new Car("Toyota","Camry",2023,true);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson","Sportster",2021,"A");

        System.out.println(bus.toString());
        System.out.println(car.toString());
        System.out.println(motorcycle.toString());
        System.out.println("==== Bus 정보 ====");
        bus.vehicleMethod1();
        bus.BusMethod();
        bus.vehicleMethod2();
        System.out.println("==== Car 정보 ====");
        car.vehicleMethod1();
        car.CarMethod();
        car.vehicleMethod2();
        System.out.println("==== Motorcycle 정보 ====");
        motorcycle.vehicleMethod1();
        motorcycle.MotorcycleMethod();
        motorcycle.vehicleMethod2();
    }
}
