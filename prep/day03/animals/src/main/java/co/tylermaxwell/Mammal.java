package co.tylermaxwell;

public abstract class Mammal extends Animal {

    private String hairColor;


    public Mammal() {
    }


    public Mammal(String hairColor) {
        this.hairColor = hairColor;
    }


    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    
}
