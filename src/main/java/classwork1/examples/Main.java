package classwork1.examples;

/**
 * abra cadabra
 */
public class Main {
    public static void main(String[] args) {
        int i = 10;
        i = 15;
        Employee minyon1 = new Employee("Bill", "Gates", 35);
//        minyon1.lastName = "Gates";
        Employee minyon2 = new Employee("Stive", "Jobs", 15);
//        Employee.printEmployee(minyon1);
//        Employee.printEmployee(minyon1, minyon1, minyon1, minyon1);
//        minyon1.lastName = "Pupkin";
//        Employee.printEmployee(minyon1, minyon2);

        minyon1.setFirstName("Super Minyon");
        System.out.println(minyon1.getFirstName());

        Developer developer = new Developer();
        developer.develop();
        Tester tester1 = new Tester();
        tester1.testing();
    }


}
