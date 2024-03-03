package clients;

import java.time.LocalDate;

public class Bird extends Animal {
    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);}
    public void BirdLifeCycle() {
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
        System.out.println(getType() + " летает");
    }
}
