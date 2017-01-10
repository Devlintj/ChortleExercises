import java.util.Scanner;


public class Exercise10_3 {
	public static void main(String[] args){
		Scanner change = new Scanner(System.in);
		System.out.println("what is your change? ");
		int pennies = change.nextInt();
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		for(int i = pennies; pennies >= 100; i++) {
			pennies = pennies - 100;
			dollars++;
		}
		for(int i = pennies; pennies >= 25; i++) {
			pennies = pennies - 25;
			quarters++;
		}
		for(int i = pennies; pennies >= 10; i++) {
			pennies = pennies - 10;
			dimes++;
		}
		for(int i = pennies; pennies >= 5; i++) {
			pennies = pennies - 5;
			nickels++;
		}
		System.out.println("your change is: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
	}
}
