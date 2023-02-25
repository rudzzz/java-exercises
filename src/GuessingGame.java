import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int numberOfGuesses = 3;
        Scanner scanner = new Scanner(System.in);

        while (numberOfGuesses != 0){
            System.out.println("You have " + numberOfGuesses +  " chance(s), enter your guess! (1-100)");
            int guess = scanner.nextInt();
            numberOfGuesses--;

            if(guess == randomNumber){
                System.out.println("You guessed correctly!");
                break;
            } else if (guess > randomNumber){
                System.out.println("The number is lower!");
            } else if (guess < randomNumber){
                System.out.println("The number is higher!");
            } else {
                System.out.println("Number invalid!");
            }

            if(numberOfGuesses == 0){
                System.out.println("\nYou're out of guesses! Better luck next time!");
                System.out.println("The correct number was: " + randomNumber);
            }
        }

    }
}
