package homewor1;

public class Main {
    public static void main(String[] args) {
        // создание людей
        Human misha = new Human("Misha", 190, 85.5, 30, "russian");
        Human dima = new Human("Dmitri", 190, 85.5, 30, "russian");
        Human masha = new Human("Masha", 190, 85.5, 30, "russian");
        Human victoria = new Human("Victoria", 190, 85.5, 30, "russian");
        Human valera = new Human("Valera", 190, 85.5, 30, "russian");

        // вывод счетчика
        System.out.println("count Humans " + Human.getCountHumans());
        System.out.println();

        // провекрка что во сне гулять нельзя
        victoria.eat("donut");
        victoria.startSleep();
        victoria.walk();
        victoria.wakeUp();
        victoria.walk();

        System.out.println();

        Spa spa = new Spa();

        // все люди пошли отдыхать
        spa.service(misha);
        spa.service(dima);
        spa.service(masha);
        spa.service(victoria);
        spa.service(valera);

        // счетчик отдохнувших людей
        System.out.println("\ncount happy humans" + Spa.getCountServiceHumans());
    }
}
