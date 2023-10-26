package co.tylermaxwell;

public class Bat extends Mammal implements Flyable {
    private int fingers;
    


    public Bat() {
    }


    public Bat(int energyLevel) {
        super(300);
        
    }

    @Override
    public void move(){
        System.out.println("I want to fly like a bat");
    }


    public int getFingers() {
        return this.fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }


    @Override
    public String toString() {
        return "{" +
            " fingers='" + getFingers() + "'" +
            "}";
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }

    @Override
    public void land() {
        
    }
    


    
}
