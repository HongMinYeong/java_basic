package _05_class._practice;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();
        Vehicle[] vehicles = {car, airplane};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }
            ;
        }
    }
}
