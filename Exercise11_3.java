import java.util.Scanner;

public class Exercise11_3 {
	public static void main(String args[]) {
		System.out.println("Enter a double:");
		Scanner num = new Scanner(System.in);
		double base = num.nextDouble();
		double result = Math.log(base)/Math.log(2);
		System.out.println("Base 2 log of " + base + " is " + result);
	}
}
