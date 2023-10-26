package co.tylermaxwell;

public abstract class Animal {

    
    private double bodyTemp;
    private int limbs;
    private int energyLevel;


    public Animal() {
    }

    public Animal(int energyLevel) {
    }


    public Animal(double bodyTemp, int limbs, int energyLevel) {
        this.bodyTemp = bodyTemp;
        this.limbs = limbs;
        this.energyLevel = energyLevel;
    }



    public void move(){
        System.out.println("take steps");
    }



    public double getBodyTemp() {
        return this.bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getLimbs() {
        return this.limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }


    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }



    
}
