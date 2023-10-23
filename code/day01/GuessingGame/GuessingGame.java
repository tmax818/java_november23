import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number_to_guess = rand.nextInt(101);
        int attempts = 3;
        int guess = 0;
        System.out.println("the number" + number_to_guess);

        System.out.println("Please guess a number between 0 and 100");
        while(attempts > 0){
            guess = sc.nextInt();
            if(guess > number_to_guess){
                System.out.println("Too high, try again");
            } 
            if (guess < number_to_guess) {
                System.out.println("Too low, guess again");
            } 
            if(guess == number_to_guess) {
                System.out.println("You are amazing!!!!");
                break;
            }
            attempts--;
        }

        if(attempts == 0){
            System.out.printf("Sorry the number was %d", number_to_guess);
        }



    }
    
}
