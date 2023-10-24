package OOP.tesla;

import java.util.ArrayList;

public class Tesla {

    private String color;
    private String model;
    private  int year;
    private double odometer;
    private double price;
    private static final String CEO = "Elon Musk";
    private static final String HQ = "Freemont";
    private static ArrayList<Tesla> allTeslas = new ArrayList<>();


    public Tesla() {
        Tesla.allTeslas.add(this);
    }


    public Tesla(String color, String model, int year, double odometer, double price) {
        this();
        this.color = color;
        this.model = model;
        this.year = year;
        this.odometer = odometer;
        this.price = price;
    }

    public void drive(){
        System.out.printf("I am driving my %d %s tesla\n", this.year, this.color);
    }

    public void drive(double miles){
        this.odometer += miles;
        System.out.printf("I have driven my %s tesla %f miles", this.color, miles);   
 }



    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getOdometer() {
        return this.odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getCEO(){
        return Tesla.CEO;
    }

    public static void getTeslaList(){
        System.out.println(allTeslas);
    }


    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            ", odometer='" + getOdometer() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }


    // public static void main(String[] args) {
    //     Tesla test = new Tesla();
    //     System.out.println(test);
    //     drive();
    // }





    
    
}
