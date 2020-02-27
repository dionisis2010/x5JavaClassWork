package classwork2;

public class Compare {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
//        Object o1 = new Object();
//        Object o2 = new Object();
//        System.out.println(o1 == o2);
//        System.out.println(10 < 100);
//        System.out.println(10 > 100);

//        Inter inter1 = new Inter(10);
//        Inter inter2 = new Inter(10);
//
//        System.out.println(inter1 == inter2);
//        System.out.println(inter1.i == inter2.i);
//
//        System.out.println(inter1.equals(inter2));

//        String res = "12345" + "5";
//        res += "789";
//        String str = new String("123");
//        String str2 = new String("123");
//        String str3 = "123";
//
//        System.out.println(str == str2);
//        System.out.println(str3 == str);
//        System.out.println(str3 == str2);
//        System.out.println(str.equals(str2));
        Inter inter = new Inter(10);
        System.out.println(inter);

    }
}

class Inter {
    int i;
    String name = "name";

    public Inter(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        return this.i == ((Inter) obj).i;
    }

    @Override
    public String toString() {
        return name + " i = " + i;
    }
}
