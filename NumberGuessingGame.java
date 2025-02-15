import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");
        while (true) {
            guess = scanner.nextInt();
            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the correct  number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low number. Try again:");
            } else {
                System.out.println("Your guess is too high number. Try again:");
            }
        }
        scanner.close();
    }
}