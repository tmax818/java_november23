package OOP.tesla;

public class Main {

    public static void main(String[] args) {

        Tesla carlos_tesla = new Tesla();
        Tesla adeebs_tesla = new Tesla("red", "modelx", 2024, 0.0, 45000);

        adeebs_tesla.drive();

        System.out.println("/n/n");
        

        System.out.println(adeebs_tesla);

    }
    
}
