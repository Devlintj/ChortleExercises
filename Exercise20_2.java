import java.util.Random;
import java.util.Scanner;

public class Exercise20_2 {
	public static void main(String args[]) {
		Random rand = new Random();
		int answer = rand.nextInt(10) + 1;
		boolean rightans = false;
		int guessnum = 3;
		Scanner input = new Scanner(System.in);
		
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
	}
}
