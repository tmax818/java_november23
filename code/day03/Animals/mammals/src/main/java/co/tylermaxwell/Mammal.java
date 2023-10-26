package co.tylermaxwell;

public class Mammal extends Animal {

    private boolean hasHair;


    public Mammal() {
    }

    public Mammal(int energyLevel) {
        super(energyLevel);
    }


    public Mammal(double bodyTemp, int limbs, int energyLevel, boolean hasHair) {
        super(bodyTemp, limbs, energyLevel);
        this.hasHair = hasHair;
    }



    public boolean isHasHair() {
        return this.hasHair;
    }

    public boolean getHasHair() {
        return this.hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }









    
}
