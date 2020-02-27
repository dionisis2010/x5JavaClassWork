package classwork3;

public class RecursivExample {

    static int count = 0;

    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 10; i++) {
            a = increment(a);
        }
        System.out.println(a);
        try{
            System.out.println(recIncrem(1));

        } catch (StackOverflowError error){

        }
        System.out.println("all ok");
    }

    static int increment(int p1) {
        return ++p1;
    }

    static int recIncrem(int a) {
        if (true) {
            System.out.println(a);
            a++;
            return recIncrem(a);
        } else {
            return a;
        }
    }
}
