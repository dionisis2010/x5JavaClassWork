package classwork2;

public class A {
    int a;
    String s = "fgfd";

    static int b;

    static {
        b=10;
        b++;
    }

    {
        a = 10;
    }

    public A(int a) {
        if (a<10){
            throw new RuntimeException();
        }
        this.a = a;
    }

}

class B extends A{

    public B(int a) {
        super(a);
    }
}
