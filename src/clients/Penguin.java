package clients;
import java.time.*;
public class Penguin extends Animal {
    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);}
    public void PenguinLifeCycle() {
        toGo();
        swim();
        fly();
    }
    public void toGo(){
        System.out.println(getType() + " ходит");
    }
    public void swim(){
        System.out.println(getType() + " плавает");
    }
    public void fly(){
        System.out.println(getType() + " не летает");
    }
}
