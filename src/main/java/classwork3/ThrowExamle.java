package classwork3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowExamle {
    static int res = 0;

    public static void main(String[] args) {


        System.out.println(mehtod());
        System.out.println(res);
    }

    static int mehtod() {
        System.out.println("method start");
        int a;
        try {
            System.out.println("try start");
            res = 500;
            return res += 100;
//            System.out.println("try stop");
//            throw  new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("catch work");
        } finally {
            System.out.println("finally work");
            return 1000 + res;
        }
//        System.out.println("method stop");
//        return 10;
    }
}
