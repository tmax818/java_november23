public class GuessingGame {

    public static void main(String[] args) {

        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);

        for(int i = low; i <= high; i++){
            System.out.println(i);
        }
        
    }
    
}
