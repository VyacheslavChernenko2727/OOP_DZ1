package clients;

import java.time.LocalDate;

public class Snake extends Animal {
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);}
    public void SnakeLifeCycle() {
        toGo();
        swim();
        fly();
    }
   public void toGo(){
        System.out.println(getType() + " не ходит");
    }
    public void swim(){
        System.out.println(getType() + " не плавает");
    }
    public void fly(){
        System.out.println(getType() + " не летает");
    }
}
