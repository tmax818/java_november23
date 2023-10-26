package co.tylermaxwell;

public class Bird extends Avian implements Flyable{

    @Override
    public void fly() { 
        System.out.printf("The %s is flying!! It has some nice feathers!!!!\n", this.getClass().getSimpleName());
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'land'");
    }


    
}
