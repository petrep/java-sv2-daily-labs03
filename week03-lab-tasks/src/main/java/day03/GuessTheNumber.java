package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	private int randomIntTo100 = 0;
	private int remainingLives = 6;
	private boolean wonTheGame;

	public int generateARandomNumber() {
		Random rnd = new Random();
		randomIntTo100 = rnd.nextInt(100);
		return randomIntTo100;
	}

	public void guessTheNumber() {
		System.out.print("Tell me your guess, it can be a whole number");
		System.out.println(" between 1 and 100.");
		Scanner scanner = new Scanner(System.in);

		System.out.println("randomIntTo100: " + randomIntTo100);
		for (int i = 1; i <= 6; i++) {
			int guess = scanner.nextInt();
			if (guess == randomIntTo100) {
				System.out.println(" Congratulations! You guessed the number!");
				System.out.println("With " + (remainingLives - 1) + " guesses left.");
				wonTheGame = true;
				break;
			}
			if (guess < randomIntTo100) {
				System.out.println("Almost. Your guess is a little low.");
				System.out.println("Guess again:");
				remainingLives--;
			} else {
				System.out.println("Almost. Your guess is a little high.");
				System.out.println("Guess again:");
				remainingLives--;
			}
		}
		if (!wonTheGame) System.out.println(" You have lost. Sorry :(");
	}
}
