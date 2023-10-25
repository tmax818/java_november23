package co.tylermaxwell;

public abstract class Animal {

    private String name;
    private String species;
    private int energy;


    public Animal() {
    }


    public Animal(String name, String species, int energy) {
        this.name = name;
        this.species = species;
        this.energy = energy;
    }

    public void eat(){
        this.energy += 10;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }




    
}
