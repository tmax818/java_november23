import java.util.Random;
import java.util.Scanner;

public class Game {


    int num_to_guess = new Random().nextInt(100);
    int guess;
    Scanner scanner = new Scanner(System.in);
    boolean playAgain = true;


    public void StartGame(){
        System.out.println("Please guess a number between 1 and 100");
        while((num_to_guess != guess) && this.playAgain ){
            promptForGuess();
            checkGuess();
        }
    }

    private int promptForGuess(){
        System.out.println("try to guess the number:  ");
        while(true) {
            try {
                guess = scanner.nextInt();
                return guess;
            } catch (java.util.InputMismatchException e){
                System.out.println("That is not a valid input! Try again: ");
                scanner.nextLine();
            }
        } 
    }


    private void checkGuess(){
        if(guess > num_to_guess) System.out.println("Too High");
        if(guess < num_to_guess) System.out.println("Too low!");
        if(guess == num_to_guess) this.checkContinue();
        
    }
    
    private void checkContinue(){
        Scanner scanner = new Scanner(System.in);
        this.guess = 0;
        System.out.println("You got it!! Would you like to play again?");
        String check = scanner.nextLine().toString().toLowerCase();
        if(!check.contains("y")) playAgain = false;
    }


    
}
