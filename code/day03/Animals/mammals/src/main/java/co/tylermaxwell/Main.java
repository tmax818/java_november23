package co.tylermaxwell;

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();
        Dog dog = new Dog();

        dog.move();



        System.out.println(bat.getBodyTemp());
        bat.move();
    }
}