package clients;

import java.time.*;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public void lifeCycle(){
        wakeup(15.35);
        eat();
        play();
        sleep();
    }
    private void sleep(){
        System.out.println(getType() + " is sleeping");
    }
    private void wakeup(){
        System.out.println(getType() + " waked up");
    }
    private void wakeup(double time){
        System.out.println(getType() + " waked up at " + time);
    }
    protected void eat(){
        System.out.println(getType() + " is eating");
    }
    protected void play(){
        System.out.println(getType() + " is playing");
    }
    protected void toGo(){
        System.out.println(getType() + " ходит");
    }
    protected void swim(){
        System.out.println(getType() + " плавает");
    }
    protected void fly(){
        System.out.println(getType() + " летает");
    }

    public String getType(){

        return getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }
    public LocalDate getAge() {
        return age;
    }
    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString(){

        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, age, owner);
    }
}
