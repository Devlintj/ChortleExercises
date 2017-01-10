import java.util.Random;
import java.util.Scanner;

public class Exercise20_3 {
	public static void main(String args[]) {
		int roundsWon = 0;
		int roundsPlayed = 1;
		
		while(roundsPlayed <= 10) {
			Random rand = new Random();
			int answer = rand.nextInt(10) + 1;
			boolean rightans = false;
			int guessnum = 3;
			Scanner input = new Scanner(System.in);
			
			System.out.println("round " + roundsPlayed + ":");
			System.out.println("");
			
			System.out.println("I am thinking of a number from 1 to 10.");
			System.out.println("You must guess what it is in three tries.");
			System.out.println("enter a guess");
			
			while(guessnum > 0 && rightans == false) {
				int guess = input.nextInt();
				if(guess == answer) {
					rightans = true;
					System.out.println("You have got the right answer winner");
				} else if(guess == answer + 1 || guess == answer - 1) {
					System.out.println("you are HOT! ;)");
				} else if(guess == answer + 2 || guess == answer - 2) {
					System.out.println("you are warm");
				} else
					System.out.println("you are cold");
				guessnum--;
			}
			
			if(guessnum == 0 && rightans == false) {
				System.out.print("you have lost the game. The correct num was " + answer);
			}
			
			if(rightans == true) {
				roundsWon++;
			}
			System.out.println(" You have won " + roundsWon + " out of " + roundsPlayed + " rounds.");
			roundsPlayed++;
		}
		if(roundsWon == 10) {
			System.out.println("You're a hacker");
		} else if(roundsWon == 9) {
			System.out.println("You're a professional");
		} else if(roundsWon == 8) {
			System.out.println("You're advanced");
		} else {
			System.out.println("You're an amateur");
		}
	}
}
