package co.tylermaxwell;

public class Main {
    public static void main(String[] args) {
        Mammal bat = new Bat();
        bat.eat();
        System.out.println(bat.getEnergy());
    }
}