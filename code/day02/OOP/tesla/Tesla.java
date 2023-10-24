package OOP.tesla;

public class Tesla {

    private String color;
    private String model;
    private int year;
    private double odometer;
    private double price;


    public Tesla() {
    }


    public Tesla(String color, String model, int year, double odometer, double price) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.odometer = odometer;
        this.price = price;
    }

    public void drive(){
        System.out.printf("I am driving %d %s my tesla", this.year, this.color);
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
