package classwork1.examples;

public class Developer extends Employee {

    void develop(){
        System.out.println("придумал " + think());
        System.out.println("Разрабатываю");
        System.out.println("отдает тестру");
    }

    String think(){
        return "some think";
    }
}
