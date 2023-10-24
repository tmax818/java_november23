package OOP.tesla;

public class Main {

    public static void main(String[] args) {

        Tesla carlos_tesla = new Tesla();
        Tesla adeebs_tesla = new Tesla("red", "modelx", 2024, 0.0, 45000);
        Tesla fernandas_tesla = new Tesla("white", "modelx", 2024, 0.0, 45000);


        adeebs_tesla.drive();
        carlos_tesla.drive();
        fernandas_tesla.drive();

        adeebs_tesla.drive(4.5);


        // System.out.println("\n\n");

        // System.out.println(Tesla.getCEO());
        Tesla.getTeslaList();
        

        // System.out.println(adeebs_tesla);

    }
    
}
