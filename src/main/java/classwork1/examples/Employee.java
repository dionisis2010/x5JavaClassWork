package classwork1.examples;

public class Employee {
    private String firstName;
    private String lastName;
    private static int phoneNumber;
    protected int age;
    private int tbNumber;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age) {
        if (age > 25 && age < 40) {
            this.age = age;
        } else {
            this.age = 30;
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge <= 0){
            System.out.println("не может быть отр возрппрпьрп");
        } else {
            age = newAge;
        }
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    int introduce() {
        int res = 150;
        System.out.println("Hi, my name " + firstName + " " + lastName);
        return res;
    }

    void work() {
        System.out.println();
    }

    void work(String var) {

    }

    void work(int countIter) {
        for (int i = 0; i < countIter; i++) {
            System.out.println(this.firstName + "  work ....");
        }
    }

    static void printEmployee(Employee... employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].firstName + " " + employee[i].lastName);
        }
    }
}
