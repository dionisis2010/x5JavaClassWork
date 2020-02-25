package homewor1;

import sun.reflect.generics.tree.VoidDescriptor;

public class Human {
    private String name;
    private double height;
    private double weight;
    private int age;
    private String nationality;

    private boolean isSleep;

    private static int countHumans;


    public Human(String name, double height, double weight, int age, String nationality) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.nationality = nationality;
        incrementCountHuman();
    }

    public Human() {
        incrementCountHuman();
    }

    private void incrementCountHuman() {
        countHumans++;
    }

    public void introduce(){
        System.out.println("Hi, my name " + this.name + ". My nationality is " + this.nationality);
    }

    public void startSleep() {
        if (isSleep) {
            System.out.println(this.name + " start sleep");
            isSleep = true;
        } else {
            System.out.println(this.name + " can't do what else while sleeping");
        }
    }

    public void wakeUp() {
        if (!isSleep) {
            System.out.println(this.name + " wake up");
            isSleep = false;
        } else {
            System.out.println(this.name + " no sleep");
        }
    }

    public void walk() {
        if (isSleep) {
            System.out.println(this.name + " walk");
        } else {
            System.out.println(this.name + " can't do what else while sleeping");
        }
    }

    public void eat(String foodName) {
        if (isSleep) {
            System.out.println(this.name + " eat " + foodName);
        } else {
            System.out.println(this.name + " can't do what else while sleeping");
        }
    }

    public double getIndexBody(double height, double weight){
        return this.weight/(this.height * this.height);
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public static int getCountHumans() {
        return countHumans;
    }
}
