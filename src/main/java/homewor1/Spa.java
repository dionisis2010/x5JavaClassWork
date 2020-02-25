package homewor1;

public class Spa {

    private static int countServiceHumans;

    public void service(final Human human2){
        System.out.println(human2.getName() + " go in spa");
        human2.eat("breakfast");
        human2.walk();
        human2.startSleep();
        human2.wakeUp();
        human2.eat("lunch");
        System.out.println(human2.getName() + " go out spa");
        countServiceHumans++;
    }

    public void service(final Human client1, final Human client2){
        System.out.println(client1.getName() + " go in spa");
        client1.eat("breakfast");
        client1.walk();
        client1.startSleep();
        client1.wakeUp();
        client1.eat("lunch");
        System.out.println(client1.getName() + " go out spa");
        countServiceHumans++;

        System.out.println(client2.getName() + " go in spa");
        client2.eat("breakfast");
        client2.walk();
        client2.startSleep();
        client2.wakeUp();
        client2.eat("lunch");
        System.out.println(client2.getName() + " go out spa");
        countServiceHumans++;
    }

    public static int getCountServiceHumans() {
        return countServiceHumans;
    }
}
