import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String[] RPS = {"r", "p", "s"};
            String computerMove = RPS[new Random().nextInt(RPS.length)];
            String playerMove;

            while(true){
                System.out.println("Please enter you move (r-rock/ p-paper/ s-scissors)");
                playerMove = scanner.nextLine();
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
                    break;
                } else {
                    System.out.println("Not a valid move!");
                }
            }
            System.out.println("The computer played: " + computerMove);

            if(playerMove.equals(computerMove)){
                System.out.println("The game was a tie!");
            } else if(playerMove.equals("r")){
                if(computerMove.equals("p")){
                    System.out.println("You lose!");
                } else if(computerMove.equals("s")){
                    System.out.println("You win!");
                }
            } else if(playerMove.equals("p")){
                if(computerMove.equals("r")){
                    System.out.println("You win!");
                } else if(computerMove.equals("s")){
                    System.out.println("You lose!");
                }
            } else if(playerMove.equals("s")){
                if(computerMove.equals("r")){
                    System.out.println("You lose");
                } else if(computerMove.equals("p")){
                    System.out.println("You win!");
                }
            }
            System.out.println("Would you like to play again? (y/n)");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("y")){
                System.out.println("\nThank you for playing!");
                break;
            }
        }
        scanner.close();
    }
}
