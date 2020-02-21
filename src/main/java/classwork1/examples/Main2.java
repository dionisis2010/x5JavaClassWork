package classwork1.examples;

public class Main2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        int var1 = 10;
        increment(var1);
        System.out.println(var1);

        System.out.println();

        Num num = new Num();
        incrementNum(num);
        System.out.println(num.var);
    }

    static void increment(int var) {
        var++;
        System.out.println("var = " +var);
    }

    static void incrementNum(Num num) {
        num.var++;
        System.out.println("num.var = " + num.var);
    }


}

class Num {
    int var = 10;
}
