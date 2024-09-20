package test;

import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String playAgain = "";
	do {
		// Generates random number between 1 and 100
		int theNumber = (int)(Math.random() * 100 - 1);
		int guess = 0;
		int numberOfTries = 0;
		while (guess != theNumber) {
			System.out.println("Guess a number between 1 and 100: ");
			guess = scan.nextInt();
			if (guess > theNumber)
				System.out.println(guess + " is too high, try again.");
			else if (guess < theNumber)
				System.out.println(guess + " is too low, try again.");
			else
				System.out.println(guess + " is correct, you win!");
			numberOfTries += 1;
			} // End of the while loop for guessing
			System.out.println("You guessed the number in " + numberOfTries + " tries.");
			System.out.println("Do you want to play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y")); 	
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}
}
