    package classwork2;

    import classwork1.examples.Employee;
    import classwork1.main.Workable;

    public class Main {

        public static void main(String[] args) {
            Animal animal;
//            Animal animal1 = new Animal();
            animal = new Dog();
            System.out.println(animal.speak());
            animal = new Cat();
            System.out.println(animal.speak());
            System.out.println(animal.speak());

            Speakable speakable = new Employee();
            Workable workable = (Workable) speakable;

            Speakable speakable1 = new Dog();
        }

    }

    abstract class Animal implements Speakable {
        int age;


        public String speak() {
            return this.getClass().getSimpleName() + " говорит ";
        }

        abstract void run();
    }

    class Dog extends Animal  {
        @Override
        public String speak() {
            return super.speak() + "gav";
        }

        @Override
        void run() {
            System.out.println("dog run");
        }
    }

    class Cat extends Animal {
        @Override
        public String speak() {
            return null;
        }

        void run() {

        }
    }

    abstract class Cow extends Animal {
        @Override
        public String speak() {
            return super.speak() + "moo";
        }

        abstract void run();
    }
    class Milka extends Cow {

        void run() {

        }
    }