package co.tylermaxwell;

public class Bat extends Mammal {
    private int fingers;


    public Bat() {
        this.setHasHair(true);
        this.setLimbs(2);
    }

    @Override
    public void move(){
        System.out.println("I want to fly like a bat");
    }

    
}
