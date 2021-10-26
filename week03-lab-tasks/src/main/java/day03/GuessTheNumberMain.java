package day03;

public class GuessTheNumberMain {
	public static void main(String[] args) {
		System.out.println(" Welcome to the Guess the number Game!");

		System.out.println("The computer will generate a random number now..");
		System.out.println("You have to guess which number it is.");
		GuessTheNumber guessTheNumber = new GuessTheNumber();
		guessTheNumber.generateARandomNumber();

		System.out.println("The number is generated, let the game begin!");
		guessTheNumber.guessTheNumber();
	}
}
