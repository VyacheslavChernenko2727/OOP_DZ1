import clients.*;


import java.net.SocketOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion liova = new Lion("Лёва", 200, LocalDate.now(), new Owner());
        Lion liova2 = new Lion("Пушистик", 250, LocalDate.now(), new Owner());
        Penguin puzo = new Penguin("Пузо", 40, LocalDate.now(), new Owner());
        Penguin zoya = new Penguin("Зоя", 45, LocalDate.now(), new Owner());
        Shark zub = new Shark ("Зуб", 300, LocalDate.now(), new Owner());
        Shark carl = new Shark("Карл", 350, LocalDate.now(), new Owner());
        Bird kesha = new Bird("Кеша", 10, LocalDate.now(), new Owner());
        Duck mak = new Duck("Мак", 15, LocalDate.now(), new Owner());
        Snake zmey = new Snake("Змей", 20, LocalDate.now(), new Owner());
//        System.out.println(liova);

//        System.out.println(liova2);
//        System.out.println(puzo);
//        System.out.println(zoya);
//        System.out.println(zub);
//        System.out.println(carl);
//        System.out.println(liova.getType());
//        liova.lifeCycle();

        List<Animal> animals = new ArrayList<>();
        animals.add(liova);
        animals.add(liova2);
        animals.add(puzo);
        animals.add(zoya);
        animals.add(zub);
        animals.add(carl);
        animals.add(kesha);
        animals.add(mak);
        animals.add(zmey);
        System.out.println(animals);
        liova.LionLifeCycle();
        puzo.PenguinLifeCycle();
        kesha.BirdLifeCycle();
        mak.DuckLifeCycle();
        zmey.SnakeLifeCycle();
        carl.SharkLifeCycle();
}
}