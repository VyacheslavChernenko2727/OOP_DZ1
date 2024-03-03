package clients;

import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);}
    public void DuckLifeCycle() {
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
        System.out.println(getType() + " летает");
    }
}
