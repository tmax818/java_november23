package co.tylermaxwell;

public interface Flyable {

    public default void fly(){
        System.out.printf("The %s is flying!!\n", this.getClass().getSimpleName());

    };

    public void land();

    
}
