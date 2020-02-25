package classwork2;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Main3 {
    public static void main(String[] args) {
        int a =10;
        long b = a;
        System.out.println(b);

        int c;
        long d = 10045756865546543l;
        c = (short) d;
        System.out.println(c);

        double dob = 512056135032110.6261265151655;
        System.out.println((long) dob);

        char c1 = 50;
        System.out.println(c1);

        Car car = new Car("porsche");
        Truck truck = new Truck("scania");

        Car car2 = truck;
        Truck truck1 = (Truck) car2;
        if (car instanceof Truck){
            Truck truck2 = (Truck) car;
        } else {
            System.out.println("this object " + car + " no Truck");
        }
    }

}

class Car{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "model this car - " + model;
    }
}
class Truck extends Car{
    public Truck(String model) {
        super(model);
    }
}
