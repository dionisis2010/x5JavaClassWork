package classwork2;

import classwork1.examples.Employee;
import sun.font.DelegatingShape;

public class Veterenar {

    public static void main(String[] args) {
        Employee employee = new Employee();
//        Animal animal = new Cow();
        Veterenar veterenar = new Veterenar();
        veterenar.heal(employee);
    }

    void heal(Object o) {

        boolean isAnimal = o instanceof Animal;
        if (!isAnimal){
            throw new RuntimeException("it no animal");
        }
        if (o instanceof Dog) {
            System.out.println(o.getClass().getSimpleName() + " is healing");
        } else if (o instanceof Cat){
            System.out.println(o.getClass().getSimpleName() +" is healing");
        } else {
            System.out.println("a no know this animal");
        }
    }
}
