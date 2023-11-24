package _05_class._inheritance;

public class Vehicle {
        public String brand;
        public String model;
        public int year;
    public int passengerCapacity;
        public Vehicle(String brand,String model,int year){
            this.brand = brand;
            this.model = model;
            this.year = year;

        }

        void vehicleMethod1(){
            System.out.println("차량 시동을 걸었습니다.");
        }
        void vehicleMethod2(){
            System.out.println("차량을 정지했습니다.");
        }

    }



