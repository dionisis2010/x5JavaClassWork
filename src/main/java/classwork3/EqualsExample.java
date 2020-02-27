package classwork3;

import java.util.Objects;

public class EqualsExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("volvo", "red", 1000);
        Car car2 = new Car("porsche", "blue", 1200);
        Car car3 = new Car("porsche", "blue", 1200);
        System.out.println(car3.equals(null));
        System.out.println(car3.equals(car1));
        System.out.println(car3.equals(car2));
        System.out.println(car2 == car3);

        Car car4 = (Car) car1.clone();
        System.out.println(car4.equals( car1));
        System.out.println(car4 == car1);
        car4 = null;
        car2 = car1;

    }
}

class Car {

    private String model;
    private String color;
    private int massa;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("123");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return massa == car.massa &&
                model.equals(car.model) &&
                color.equals(car.color);
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(this.model, this.color, this.massa);
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, massa);
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        } else if (this == obj) {
//            return true;
//        } else if (!(obj.getClass().equals(Car.class))) {
//            return false;
//        } else {
//            Car car = (Car) obj;
//            if (this.model.equals(car.model)
//                    && this.color.equals(car.color)
//                    && this.massa == car.massa) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }

    public Car(String model, String color, int massa) {
        this.model = model;
        this.color = color;
        this.massa = massa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
}
