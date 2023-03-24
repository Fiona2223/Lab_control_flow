
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        // Obtain a secret number between 1 and 20
        int secretNumber = 11;

        // Prompt the user to input a number
        System.out.println("Guess the secret number, between 1 and 20: ");
        Scanner reader = new Scanner(System.in); // creates a Scanner object
        int userGuess = reader.nextInt();  //reads user input

        // If the user guesses the right answer
        if (userGuess == secretNumber) {
            System.out.println("Perfect! The secret number was " + secretNumber + ".");
        } else if (userGuess > secretNumber) {
            System.out.println("Haha too high, try again: ");
        } else {
            System.out.println("Oops Too low, try again: ");
            // Prompting the user to keep trying ; using the while condition
            while (userGuess != secretNumber) {
                userGuess = reader.nextInt();

                // if the user inputs the wrong answer but close enough, print "Ouch Too high or Wee Too low"
                if (userGuess > secretNumber) {
                    System.out.println("Ouch Too high, try again ");
                } else if (userGuess < secretNumber) {
                    System.out.println("Wee Too low, try again ");
                }
                // if the user inputs the correct answer, display the result
                else {
                    System.out.println("Perfect! The secret number was " + secretNumber + ".");
                }


            }

        }
    }

    }