
public class Main {

    public static void main(String[] args) {
        // int num_to_guess = new Random().nextInt(101);
        // System.out.println(num_to_guess);
        // System.out.println("Please guess a number between 1 and 100");
        // Scanner scanner = new Scanner(System.in);
        // int guess = scanner.nextInt();
        // System.out.println(guess);

        // while(guess != num_to_guess){
        //     if(guess > num_to_guess) System.out.println("Too high");
        //     if(guess < num_to_guess) System.out.println("Too low");
        //     System.out.println("Guess again: ");
        //     guess = scanner.nextInt();
        // }

        Game game = new Game();
        System.out.println(game.num_to_guess);
        game.StartGame();

    }
    
}
