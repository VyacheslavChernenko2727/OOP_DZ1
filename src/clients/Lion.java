package clients;
import java.time.*;
public class Lion extends Animal {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);}
    public void LionLifeCycle() {
        toGo();
        swim();
        fly();
    }
   public void toGo(){
        System.out.println(getType() + " ходит");
    }
    public void swim(){
        System.out.println(getType() + " не плавает");
    }
    public void fly(){
        System.out.println(getType() + " не летает");
    }
}
