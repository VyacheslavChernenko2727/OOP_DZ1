package clients;
import java.time.*;
public class Shark extends Animal {
    public Shark(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);}

        public void SharkLifeCycle() {
            toGo();
            swim();
            fly();
        }
        public void toGo(){
            System.out.println(getType() + " не ходит");
        }
        public void swim(){
            System.out.println(getType() + " плавает");
        }
        public void fly(){
            System.out.println(getType() + " не летает");
        }
    }