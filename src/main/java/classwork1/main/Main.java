package classwork1.main;

import classwork1.examples.Employee;

public class Main extends Employee {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.gas();
//        car.stop();

        Car car2 = new Truck();
        car2.gas();


        Truck truck = new Truck();
        truck.gas();
//        truck.download();
        peregon(new Sport());
//        peregonTruck(new Car());
        peregonTruck(new Truck());
    }
    static void peregon(Car car){
        car.gas();
    }

    static void peregonTruck(Truck truck){
        truck.gas();
    }
}
