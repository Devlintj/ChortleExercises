import java.util.Scanner;


public class Exercise20_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many rounds?");
		int rounds = input.nextInt();
		int turn = 2;
		int firstRoundsWon = 0;
		int secondRoundsWon = 0;
		System.out.println("First Player, sign in:");
		String first = input.next();
		System.out.println("Second Player, sign in:");
		String second = input.next();
		for(int i = 0; i < rounds; i++) {
			double firstGuess = 0;
			double secondGuess = 0;
			double rootOf = (Math.random() * 99.0) + 1.0;
			double sqrtOf = Math.sqrt(rootOf);
			System.out.println("What is the square root of " + rootOf);
			if(turn % 2 == 0) {
				System.out.println(first + ", your guess:");
				firstGuess = input.nextDouble();
				System.out.println(second + ", your guess:");
				secondGuess = input.nextDouble();
			} else {
				System.out.println(second + ", your guess:");
				secondGuess = input.nextDouble();
				System.out.println(first + ", your guess:");
				firstGuess = input.nextDouble();
			}
			turn++;
			double firstAns = Math.abs(sqrtOf - firstGuess);
			double secondAns = Math.abs(sqrtOf - secondGuess);
			System.out.println("The correct square root: " + sqrtOf);
			System.out.println(first + " is " + Math.abs(sqrtOf - firstGuess) + " away");
			System.out.println(second + " is " + Math.abs(sqrtOf - secondGuess) + " away");
			if(firstAns < secondAns) {
				System.out.println(first + " wins!");
				firstRoundsWon++;
			} else if(secondAns < firstAns) {
				System.out.println(second + " wins!");
				secondRoundsWon++;
			} else {
				System.out.println("Tie! you both lose");
			}
		}
		System.out.println("---- Final Score ----");
		System.out.println(first + ":  " + firstRoundsWon + "   " + second + ":  " + secondRoundsWon);
	}
}
