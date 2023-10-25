package co.tylermaxwell;

public class Animal {

    
    private double bodyTemp;
    private int limbs;

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

    
}
